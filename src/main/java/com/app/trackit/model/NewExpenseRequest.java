package com.app.trackit.model;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NewExpenseRequest {
  Double amount;
  String description;
  Double budget;
  LocalDateTime createdAt;
  String mode;
  String type;
}
