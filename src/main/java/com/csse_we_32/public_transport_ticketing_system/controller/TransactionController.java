package com.csse_we_32.public_transport_ticketing_system.controller;

import com.csse_we_32.public_transport_ticketing_system.domain.TimeSlot;
import com.csse_we_32.public_transport_ticketing_system.domain.Transaction;
import com.csse_we_32.public_transport_ticketing_system.service.impl.TransactionServiceImpl;
import com.csse_we_32.public_transport_ticketing_system.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1/Transaction")
public class TransactionController {
    @Autowired
    TransactionServiceImpl transactionService;

    @PostMapping("/save")
    public ResponseEntity<?> save(@Valid @RequestBody Transaction transaction) throws Exception {

        return ResponseEntity.status(HttpStatus.OK).body(transactionService.save(transaction));

    }
    @GetMapping("/all")
    public ResponseEntity<List<Transaction>> findAll() throws Exception {

        return ResponseEntity.status(HttpStatus.OK).body(transactionService.getAll());

    }

    @GetMapping("/timeDuration/{startDate}/{endDate}")
    public ResponseEntity<List<Transaction>> findAllTimeDuartion(@PathVariable("startDate") String startDate,@PathVariable("endDate") String endDate ) throws Exception {

        return ResponseEntity.status(HttpStatus.OK).body(transactionService.findByDateAfterAndDateBefore(DateUtil.getDateByString(startDate),DateUtil.getDateByString(endDate)));

    }

}
