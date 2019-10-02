package com.csse_we_32.public_transport_ticketing_system.service.impl;

import com.csse_we_32.public_transport_ticketing_system.domain.SmartCard;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Service
public class QRCodeGenerator {
    @Value("${jwt.secret}")
    private String secret;

    public String setQrCode(SmartCard smartCard){
        String QRCode;
        String originalString=smartCard.getLastUpdatedDataTime().toString()+smartCard.getId()+secret;;
        MessageDigest digest = null;
        byte[] encodedhash;
        try {
            digest = MessageDigest.getInstance("SHA-256");
            encodedhash = digest.digest(
                    originalString.getBytes(StandardCharsets.UTF_8));
        } catch (NoSuchAlgorithmException e) {
            encodedhash="0".getBytes();
            e.printStackTrace();
        }

        QRCode=encodedhash.toString();
        smartCard.setQRCode(QRCode);
        return  QRCode;
    }

}
