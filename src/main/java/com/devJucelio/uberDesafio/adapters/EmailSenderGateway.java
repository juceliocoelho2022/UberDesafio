package com.devJucelio.uberDesafio.adapters;

public interface EmailSenderGateway {
    void sendEmail(String toEmail, String subject, String body);
}
