package com.app.trackit.controller;

import com.app.trackit.model.NewExpenseRequest;
import com.app.trackit.service.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2")
@RequiredArgsConstructor
public class ExpenseController {
  private final ExpenseService expenseService;

  /*@PostMapping("/newExpense")
  public void newExpense(@RequestBody NewExpenseRequest newExpenseRequest) {
    expenseService.createExpense(newExpenseRequest);
  }*/
}
