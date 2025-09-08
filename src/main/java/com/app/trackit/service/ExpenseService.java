package com.app.trackit.service;

import com.app.trackit.entity.Expense;
import com.app.trackit.model.NewExpenseRequest;
import com.app.trackit.model.NewExpenseResponse;
import com.app.trackit.model.UpdateExpenseRequest;

import java.util.List;
import java.util.Optional;

public interface ExpenseService {

  public NewExpenseResponse createExpense(NewExpenseRequest newExpenseRequest);

  Optional<Expense> getAllExpenses(int userId);

  Optional<Expense> getExpenseById(int expenseId);

  public void updateExpense(Integer expenseId,   UpdateExpenseRequest updateExpenseRequest);

  Optional<Expense> getMonthlyExpense(Integer userId);

  Optional<Expense> filterExpense(Integer userId);

  public void deleteExpense(Integer expenseId);

  public void setExpenseLimit(Integer userId, Expense expense);
}
