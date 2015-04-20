package QR_Generator;

public class extractValue extends qrcode {
	public void extractCharValue(String text) {
		char[] tekenArray = text.toCharArray();
		int[] tekenNummerArray;
		
		for(int i = 0; i < text.length(); i++) {
			for(char teken: tekenArray) {
				switch(teken) {
				case '0':
					tekenNummerArray[i] = 0;
					break;
				case '1':
					tekenNummerArray[i] = 1;
					break;
				case '2':
					tekenNummerArray[i] = 2;
					break;
				case '3':
					tekenNummerArray[i] = 3;
					break;
				case '4':
					tekenNummerArray[i] = 4;
					break;
				case '5':
					tekenNummerArray[i] = 5;
					break;
				case '6':
					tekenNummerArray[i] = 6;
					break;
				case '7':
					tekenNummerArray[i] = 7;
					break;
				case '8':
					tekenNummerArray[i] = 8;
					break;
				case '9':
					tekenNummerArray[i] = 9;
					break;
				case 'A':
					tekenNummerArray[i] = 10;
					break;
				case 'B':
					tekenNummerArray[i] = 11;
					break;
				case 'C':
					tekenNummerArray[i] = 12;
					break;
				case 'D':
					tekenNummerArray[i] = 13;
					break;
				case 'E':
					tekenNummerArray[i] = 14;
					break;
				case 'F':
					tekenNummerArray[i] = 15;
					break;
				case 'G':
					tekenNummerArray[i] = 16;
					break;
				case 'H':
					tekenNummerArray[i] = 17;
					break;
				case 'I':
					tekenNummerArray[i] = 18;
					break;
				case 'J':
					tekenNummerArray[i] = 19;
					break;
				case 'K':
					tekenNummerArray[i] = 20;
					break;
				case 'L':
					tekenNummerArray[i] = 21;
					break;
				case 'M':
					tekenNummerArray[i] = 22;
					break;
				case 'N':
					tekenNummerArray[i] = 23;
					break;
				case 'O':
					tekenNummerArray[i] = 24;
					break;
				case 'P':
					tekenNummerArray[i] = 25;
					break;
				case 'Q':
					tekenNummerArray[i] = 26;
					break;
				case 'R':
					tekenNummerArray[i] = 27;
					break;
				case 'S':
					tekenNummerArray[i] = 28;
					break;
				case 'T':
					tekenNummerArray[i] = 29;
					break;
				case 'U':
					tekenNummerArray[i] = 30;
					break;
				case 'V':
					tekenNummerArray[i] = 31;
					break;
				case 'W':
					tekenNummerArray[i] = 32;
					break;
				case 'X':
					tekenNummerArray[i] = 33;
					break;
				case 'Y':
					tekenNummerArray[i] = 34;
					break;
				case 'Z':
					tekenNummerArray[i] = 35;
					break;
				case ' ':
					tekenNummerArray[i] = 36;
					break;
				case '$':
					tekenNummerArray[i] = 37;
					break;
				case '%':
					tekenNummerArray[i] = 38;
					break;
				case '*':
					tekenNummerArray[i] = 39;
					break;
				case '+':
					tekenNummerArray[i] = 40;
					break;
				case '-':
					tekenNummerArray[i] = 41;
					break;
				case '.':
					tekenNummerArray[i] = 42;
					break;
				case '/':
					tekenNummerArray[i] = 43;
					break;
				case ':':
					tekenNummerArray[i] = 44;
					break;
				}
			}
		}
	}
}
