package com.app.trackit.controller;

import com.app.trackit.entity.Expense;
import com.app.trackit.model.NewExpenseRequest;
import com.app.trackit.model.UpdateExpenseRequest;
import com.app.trackit.service.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.hibernate.sql.Update;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v2")
@RequiredArgsConstructor
public class ExpenseController {
  private final ExpenseService expenseService;

  @PostMapping("/newExpense")
  public void newExpense(@RequestBody NewExpenseRequest newExpenseRequest) {
      //log.info("Creating new expense for the user.");
    expenseService.createExpense(newExpenseRequest);
  }

  @GetMapping("/users/getAllExpenses/{userId}")
    public Optional<Expense> getAllExpenses(@PathVariable Integer userId) {
      return expenseService.getAllExpenses(userId);
  }

  @GetMapping("/getExpense/{expenseId}")
    public Optional<Expense> getExpenseById(@PathVariable Integer expenseId) {
      return expenseService.getExpenseById(expenseId);
  }

  @PatchMapping("/updateExpense/{expenseId}")
    public void updateExpense(@PathVariable Integer expenseId,@RequestBody UpdateExpenseRequest updateExpenseRequest) {
      expenseService.updateExpense(expenseId, updateExpenseRequest);
  }

  @DeleteMapping("/deleteExpense/{expenseId}")
    public void deleteExpense(@PathVariable Integer expenseId) {
      expenseService.deleteExpense(expenseId);
  }

  @GetMapping("/getMonthlyExpense/{userId}")
    public Optional<Expense> getMonthlyExpense(@PathVariable Integer userId) {
      return expenseService.getMonthlyExpense(userId);
  }

  @GetMapping("/filterByCategory/{userId}")
    public Optional<Expense> filterByCategory(@PathVariable Integer userId) {
      return expenseService.filterExpense(userId);
  }

  @PostMapping("/setBudget/{userId}")
    public void setExpenseLimit(@PathVariable Integer userId, @RequestBody Expense expense){
       expenseService.setExpenseLimit(userId,expense);
  }
}
