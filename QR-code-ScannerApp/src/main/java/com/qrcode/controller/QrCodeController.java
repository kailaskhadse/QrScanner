package com.qrcode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qrcode.Service.QrCodeService;

@RestController
public class QrCodeController {
	@Autowired
	QrCodeService qs;
	@GetMapping("/createqrcode")
	public String creatQrScanner() {
		qs.qrCodeCreate();
		return "success";
	}

}
