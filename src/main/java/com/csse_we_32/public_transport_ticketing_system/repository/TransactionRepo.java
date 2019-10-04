package com.csse_we_32.public_transport_ticketing_system.repository;

import com.csse_we_32.public_transport_ticketing_system.domain.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface TransactionRepo extends MongoRepository<Transaction,String> {
   List<Transaction> findByDateAfterAndDateBefore(Date startDate, Date endDate);
    List<Transaction> findByDateBetween(Date startDate, Date endDate);

}
