package com.app.trackit.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Expenses")
public class Expense {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  int expenseId;

  int userId;
  int categoryId;
  Double amount;
  Double budget;
  String description;
  String type;
  String mode;
  String month;
  String year;
  LocalDateTime createdAt;
  LocalDateTime updatedAt;
}
