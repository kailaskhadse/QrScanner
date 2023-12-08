package com.qrcode.ServiceImpl;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageConfig;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.encoder.QRCode;
import com.qrcode.Service.QrCodeService;
@Service
public class QrCodeServiceI implements QrCodeService{

	@Override
	public void qrCodeCreate() {
		String path="C:\\Users\\DELL\\Desktop\\Mycode";
		String s="success";
		try {
			BitMatrix matrix=new MultiFormatWriter().encode(s, BarcodeFormat.QR_CODE, 300, 300);
			
			MatrixToImageWriter.writeToPath(matrix, "jpg", Paths.get(path));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
