package com.csse_we_32.public_transport_ticketing_system.service;

import com.csse_we_32.public_transport_ticketing_system.domain.SmartCard;

public interface QRCodeGenerator {
    public String setQrCode(SmartCard smartCard);
}
