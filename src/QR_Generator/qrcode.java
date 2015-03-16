package QR_Generator;

import java.util.Scanner;

public class qrcode {
 	public boolean[][] qr_code;
	protected boolean[][] used;
	int dimentions; // lengte van qr-code
	
	public boolean[][] qrcode(String text) {
		//Scanner input = new Scanner(System.in);
		//text = input.nextLine();
		Size stap1 = new Size();
		qr_header stap2 = new qr_header();
		Algoritme stap3 = new Algoritme();
		
		
		stap1.qrcodeWith(text);
		stap2.header();
		stap3.create();
		
		return qr_code;
	}
	
	public void Error(String message) {
		System.out.println(message);
	}
}