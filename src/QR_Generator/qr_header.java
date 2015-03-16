package QR_Generator;

public class qr_header extends qrcode {
	public void header() {
		// creates positioning pattern
		Size dimentions = new Size();
		int dimention = dimentions.getDimentions();
		boolean[][] header = new boolean[9][9];
		
		for(int ai = 0; ai <= 9; ai++) {
			for(int aj = 0; aj < 9; aj++) {
				header[ai][aj] = true;
			}
		}
		for(int bi = 0; bi < 3; bi++) {
			for(int bj = 0; bj < 3; bj++) {
				header[bi][bj] =  false;
			}
		}
		for(int ci = 0; ci <= 7; ci++) {
			header[ci][1] = false;
			header[1][ci] = false;
			header[ci][7] = false;
			header[7][ci] = false;
		}
		
		for(int di = 0; di <= 9; di++) {
			for(int dj = 0; dj < 9; dj++) {
				System.out.print(header[di][dj] + ", ");
			}
			System.out.println("");
		}	
		//puts positioning pattern in qr-code matrix
		
		
		//puts header on to qr_code
		for(int z = 0; z <= 2; z++) {
			int xxi = 0;
			int xxj = 0;

			if ( z ==1 ) {
				xxi = dimention - 9;
			} else {
				xxj = dimention - 9;
			}
			for(int ei = 0; ei <= 9; ei++) {
				for(int ej = 0; ej <= 9; ej++) {
					used[ei+xxi][ej+xxj] = true;
					qr_code[ei+xxi][ej+xxj] = header[ei][ej];
				}
			}
			String text;
			for(int ti = 0; ti <= dimention; ti++) {
				for(int tj = 0; tj <= dimention; tj++) {
					if (used[ti][tj] == true) {
						text = "+";
					} else {
						text = "-";
					}
					System.out.print(text + " ");
				}
				System.out.println("");
			}
		}
		//applying fixed pattern
		int fpd = dimention - 18;
		boolean fp = false;
		for(int fi = 0; fi <= fpd; fi++) {
			int fj = fi + fpd;
			if(fp == false) {
				qr_code[9][fj] = true;
				qr_code[fj][9] = true;
				fp = true;
			} else {
				qr_code[9][fj] = false;
				qr_code[fj][9] = false;
				fp = false;
			}
			used[9][fj] = true;
			used[fj][9] = true;
		}
	}
}