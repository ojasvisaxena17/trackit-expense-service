package com.app.trackit.model;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateExpenseRequest {
  Double amount;
  String type;
  String description;
  Double budget;
  LocalDateTime updatedAt;
  String mode;
}
