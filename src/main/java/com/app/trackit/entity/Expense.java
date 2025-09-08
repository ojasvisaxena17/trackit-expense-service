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
  LocalDateTime expenseDate;
  String type;
  String mode;
  LocalDateTime createdAt;
  LocalDateTime updatedAt;
}
