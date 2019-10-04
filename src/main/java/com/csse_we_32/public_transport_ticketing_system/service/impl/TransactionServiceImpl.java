package com.csse_we_32.public_transport_ticketing_system.service.impl;

import com.csse_we_32.public_transport_ticketing_system.DataClasses.DayTransaction;
import com.csse_we_32.public_transport_ticketing_system.domain.Transaction;
import com.csse_we_32.public_transport_ticketing_system.repository.TransactionRepo;
import com.csse_we_32.public_transport_ticketing_system.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    private TransactionRepo transactionRepo;
    @Override
    public List<Transaction> findByDateAfterAndDateBefore(Date startDate, Date endDate) {
      //  return transactionRepo.findByDateAfterAndDateBefore(startDate,endDate);
        return  transactionRepo.findByDateBetween(startDate,endDate);
    }

    @Override
    public Transaction save(Transaction transaction) {
        return transactionRepo.save(transaction);
    }

    @Override
    public List<Transaction> getAll() {
        return transactionRepo.findAll();
    }

    @Override
    public List<DayTransaction> findByDateAfterAndDateBeforeAccordingToDay(Date startDate, Date endDate) {
        //  return transactionRepo.findByDateAfterAndDateBefore(startDate,endDate);
        List<Transaction> transactions=transactionRepo.findByDateBetween(startDate,endDate);
        List<DayTransaction> transactionList=transactions.stream().map((dayTransaction)->new DayTransaction(dayTransaction.getDay(),dayTransaction.getAmount())).collect(Collectors.toList());


        return  transactionList;
    }

}
