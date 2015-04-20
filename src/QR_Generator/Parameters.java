package QR_Generator;

public class Parameters extends qrcode {
	private String ECLevel = "";
	//Level L (Low) 	7%  of codewords can be restored.
	//Level M (Medium) 	15% of codewords can be restored.
	//Level Q (Quartile)25% of codewords can be restored.
	//Level H (High) 	30% of codewords can be restored.
	

	public String getECLevel() {
		return ECLevel;
	}
	public void setECLevel(String ECLevel) {
		this.ECLevel = ECLevel;
	}
}