package QR_Generator;

import java.util.Scanner;

public class qrcode {
 	public boolean[][] qr_code;
	protected boolean[][] used;
	int dimentions; // lengte van qr-code
	public String text;
	
	public boolean[][] qrcode(String text) {
		this.text = text;
		//Scanner input = new Scanner(System.in);
		//text = input.nextLine();
		Size stap1 = new Size(text);
		qr_header stap2 = new qr_header();
		Algoritme stap3 = new Algoritme();
		
		
		stap2.header();
		stap3.create();
		
		return qr_code;
	}
	
	public void Error(String message) {
		System.out.println(message);
	}
}