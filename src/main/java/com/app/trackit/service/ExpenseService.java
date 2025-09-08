package com.app.trackit.service;

import com.app.trackit.entity.Expense;
import com.app.trackit.model.NewExpenseRequest;
import com.app.trackit.model.NewExpenseResponse;
import com.app.trackit.model.UpdateExpenseRequest;
import java.util.Optional;

public interface ExpenseService {

  public NewExpenseResponse createExpense(NewExpenseRequest newExpenseRequest);

  Optional<Expense> getAllExpenses(int userId);

  Expense getExpenseById(int expenseId);

  public void updateExpense(Integer id, UpdateExpenseRequest expense);

  Optional<Expense> getExpenseSummary(Integer userId);

  Optional<Expense> filterExpense(Integer userId, Expense expense);

  public void deleteExpense(Integer expenseId);

  public void setExpenseLimit(Integer userId, Expense expense);
}
