package com.csse_we_32.public_transport_ticketing_system.service;

import com.csse_we_32.public_transport_ticketing_system.DataClasses.DayTransaction;
import com.csse_we_32.public_transport_ticketing_system.domain.Transaction;

import java.util.Date;
import java.util.List;

public interface TransactionService {
    List<Transaction> findByDateAfterAndDateBefore(Date startDate, Date endDate);
    Transaction save(Transaction transaction);
    List<Transaction> getAll();
    List<DayTransaction> findByDateAfterAndDateBeforeAccordingToDay(Date startDate, Date endDate);
}
