package com.CodeWithDanny.LoginAndEmailVerification.entity;

public interface EmailSender {
    void send(String to, String email);
}
