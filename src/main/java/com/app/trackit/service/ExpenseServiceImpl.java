package com.app.trackit.service;

import com.app.trackit.entity.Expense;
import com.app.trackit.model.NewExpenseRequest;
import com.app.trackit.model.NewExpenseResponse;
import com.app.trackit.model.UpdateExpenseRequest;
import com.app.trackit.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
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
        return expense ;
    }

    @Override
    public Optional<Expense> getExpenseById(int expenseId) {
        Optional<Expense> expense = expenseRepository.findById(expenseId);
        return expense;
    }

    @Override
    public void updateExpense(Integer expenseId, UpdateExpenseRequest updateExpenseRequest) {
        Expense expense = new Expense();
        if(updateExpenseRequest.getAmount()!=null)
            expense.setAmount(updateExpenseRequest.getAmount());
        if(updateExpenseRequest.getDescription()!=null)
            expense.setDescription(updateExpenseRequest.getDescription());
        if(updateExpenseRequest.getBudget()!=null)
            expense.setBudget(updateExpenseRequest.getBudget());
        if(updateExpenseRequest.getType()!=null)
            expense.setType(updateExpenseRequest.getType());
        if(updateExpenseRequest.getMode()!=null)
            expense.setMode(updateExpenseRequest.getMode());
        expense.setCreatedAt(LocalDateTime.now());
        expenseRepository.save(expense);

    }

@Override
public Optional<Expense> getMonthlyExpense(Integer userId) {
        return  expenseRepository.findById(userId);

}

@Override
public Optional<Expense> filterExpense(Integer userId ) {
         return expenseRepository.findById(userId);
    }

@Override
public void deleteExpense(Integer expenseId) {
        expenseRepository.deleteById(expenseId);
}

@Override
public void setExpenseLimit(Integer userId, Expense expense) {
        Optional<Expense> expenseOptional  =  expenseRepository.findById(userId);
         if(expenseOptional.isPresent()){
             expenseOptional.get().setBudget(expense.getBudget());
         }
}
}
