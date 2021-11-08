package com.brunobezerra.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.brunobezerra.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
}