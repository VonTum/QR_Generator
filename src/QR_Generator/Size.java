package QR_Generator;

public class Size extends qrcode {
	private int dimentions;
	public void qrcodeWith(String data) {
		if (data.length() <= 14) {
			this.dimentions = 21;
		} else if (data.length() <= 26) {
			this.dimentions = 25;
		} else if (data.length() <= 42) {
			this.dimentions = 29;
		} else if (data.length() <= 61) {
			this.dimentions = 33;
		} else if (data.length() <= 84) {
			this.dimentions = 37;
		} else if (data.length() <= 106) {
			this.dimentions = 41;
		} else if (data.length() <= 122) {
			this.dimentions = 45;
		} else if (data.length() <= 152) {
			this.dimentions = 49;
		} else if (data.length() <= 180) {
			this.dimentions = 53;
		} else if (data.length() <= 213) {
			this.dimentions = 57;
		} else if (data.length() <= 251) {
			this.dimentions = 61;
		} else {
			System.out.println("Error string is to large");		
		}
	}
	
	public int getDimentions() {
		return dimentions;
	}
}