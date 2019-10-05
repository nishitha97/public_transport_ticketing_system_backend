package com.csse_we_32.public_transport_ticketing_system.controller;


import com.csse_we_32.public_transport_ticketing_system.domain.*;
import com.csse_we_32.public_transport_ticketing_system.security.JwtTokenUtil;
import com.csse_we_32.public_transport_ticketing_system.service.AuthService;
import com.csse_we_32.public_transport_ticketing_system.service.SmartCardService;
import com.csse_we_32.public_transport_ticketing_system.service.UserService;
import com.csse_we_32.public_transport_ticketing_system.service.impl.QRCodeGenerator;
import com.csse_we_32.public_transport_ticketing_system.service.impl.TransactionServiceImpl;
import com.csse_we_32.public_transport_ticketing_system.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1/smartCards")
public class SmartCardController {

    @Autowired
    SmartCardService smartCardService;

    @Autowired
    QRCodeGenerator qrCodeGenerator;

    @Autowired
    TransactionServiceImpl transactionService;

    @Autowired
    UserService userService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    AuthService authService;
    @Autowired
    JwtTokenUtil jwtTokenUtil;

    @GetMapping()
    public ResponseEntity<List<SmartCard>> getSmartCards() {

        return ResponseEntity.status(HttpStatus.OK).body(smartCardService.getAllSmartCards());

    }

    //
    @GetMapping("/smartCardId/{id}")
    public ResponseEntity<Optional<SmartCard>> getSmartCardById(@PathVariable("id") String id) {

        return ResponseEntity.status(HttpStatus.OK).body(smartCardService.getById(id));

    }

    @GetMapping("/userId/{id}")
    public ResponseEntity<Optional<SmartCard>> getSmartCardByUserId(@PathVariable("id") String userId) {
        return ResponseEntity.status(HttpStatus.OK).body(smartCardService.getByUserId(userId));

    }

    @PostMapping("/save")
    public ResponseEntity<SmartCard> save(SmartCard smartCard) {
        qrCodeGenerator.setQrCode(smartCard);
        return ResponseEntity.status(HttpStatus.OK).body(smartCardService.save(smartCard));

    }

    @PutMapping ("/save")
    public ResponseEntity<SmartCard> upadteWithoutTransaction(SmartCard smartCard) {
        qrCodeGenerator.setQrCode(smartCard);
        smartCard.setAmount(smartCardService.getById(smartCard.getId()).get().getAmount());
        return ResponseEntity.status(HttpStatus.OK).body(smartCardService.save(smartCard));

    }

    @PutMapping ("/TopUp/{smartCardId}/{amount}")
    public ResponseEntity<SmartCard> topUp(@PathVariable("smartCardId") String smartCardId,@PathVariable double amount) {

        SmartCard smartCard=smartCardService.getById(smartCardId).get();
        transactionService.save(new Transaction(amount,smartCardId,smartCard.getUserId(),new Date(),DateUtil.getDayByDate(new Date()) ));
        qrCodeGenerator.setQrCode(smartCard);
        smartCard.setAmount(smartCard.getAmount()+amount);
        return ResponseEntity.status(HttpStatus.OK).body(smartCardService.save(smartCard));

    }

    @PostMapping("/getSmartCardByToken")
    public ResponseEntity<Optional<SmartCard>>  getSmartCardByToken(@RequestBody JwtToken jwtToken
    ) throws Exception {
        String userName=jwtTokenUtil.getUsernameFromToken(jwtToken.getJwttoken());
        User user=userService.getUserByUserName(userName);

        return ResponseEntity.status(HttpStatus.OK).body(smartCardService.getByUserId(user.getId()));

    }




}
