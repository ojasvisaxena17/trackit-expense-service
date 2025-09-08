package com.app.trackit.service;

import com.app.trackit.entity.Expense;
import com.app.trackit.model.NewExpenseRequest;
import com.app.trackit.model.NewExpenseResponse;
import com.app.trackit.model.UpdateExpenseRequest;
import com.app.trackit.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;
@Service
public class ExpenseServiceImpl implements ExpenseService {

  ExpenseRepository expenseRepository;

  @Override
  public NewExpenseResponse createExpense(NewExpenseRequest newExpenseRequest) {
    Expense expense = new Expense();
    expense.setAmount(newExpenseRequest.getAmount());
    expense.setDescription(newExpenseRequest.getDescription());
    expense.setBudget(newExpenseRequest.getBudget());
    expense.setMode(newExpenseRequest.getMode());
    expense.setType(newExpenseRequest.getType());
    expense.setCreatedAt(LocalDateTime.now());
    expenseRepository.save(expense);
    return new NewExpenseResponse(expense);
  }

  @Override
  public Optional<Expense> getAllExpenses(int userId) {
    Optional<Expense> expense = expenseRepository.findById(userId);
    return Optional.empty();
  }

  @Override
  public Expense getExpenseById(int expenseId) {
    return null;
  }

  @Override
  public void updateExpense(Integer id, UpdateExpenseRequest expense) {}

  @Override
  public Optional<Expense> getExpenseSummary(Integer userId) {
    return Optional.empty();
  }

  @Override
  public Optional<Expense> filterExpense(Integer userId, Expense expense) {
    return Optional.empty();
  }

  @Override
  public void deleteExpense(Integer expenseId) {}

  @Override
  public void setExpenseLimit(Integer userId, Expense expense) {}
}
