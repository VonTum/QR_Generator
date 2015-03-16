package QR_Generator;

import java.util.Scanner;

import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.Scanner;

import javax.swing.JFrame;

public class Main {
	public static String input;
	public static boolean[][] code;

	public static void main(String[] args) {
		input = args[0];

		Scanner textInput = new Scanner(System.in);
		String text = textInput.nextLine();

		qrcode qrcodetest = new qrcode();
		code = qrcodetest.qrcode(text);
		//code = new boolean[][] {{true, false, true, true},{false, true, true, true},{true, true, false, false},{false, true, false, true}};

		// TODO Convert Code

		// Generate QR Code here, store in code

		// Creating screen
		JFrame f = new JFrame(input); // sets title of frame to inputed string
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		Screen s = new Screen(code);
		f.add(s);
		f.pack();

		f.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent scrollEvent) {
				System.out.println(scrollEvent.getPreciseWheelRotation());
			}
		});

		// TODO Initialise Screen
	}
}