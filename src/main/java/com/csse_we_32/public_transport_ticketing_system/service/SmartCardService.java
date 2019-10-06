package com.csse_we_32.public_transport_ticketing_system.service;

import com.csse_we_32.public_transport_ticketing_system.domain.SmartCard;

import java.util.List;
import java.util.Optional;

public interface SmartCardService {
    List<SmartCard> getAllSmartCards();
    Optional<SmartCard> getById(String Id);
    Optional<SmartCard> getByUserId(String userId);
    SmartCard save(SmartCard smartCard);
    Optional<SmartCard> findByQRCode(String qrCode);

}
