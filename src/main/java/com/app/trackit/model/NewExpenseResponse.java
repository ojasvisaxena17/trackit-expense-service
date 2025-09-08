package com.app.trackit.model;

import com.app.trackit.entity.Expense;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NewExpenseResponse {
  Double amount;
  String description;
  String type;
  String mode;
  LocalDateTime createdAt;
  Double budget;

  public NewExpenseResponse(Expense expense) {
    this.amount = expense.getAmount();
    this.description = expense.getDescription();
    this.type = expense.getType();
    this.mode = expense.getMode();
    this.createdAt = expense.getCreatedAt();
    this.budget = expense.getBudget();
  }
}
