package QR_Generator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Screen extends JPanel{
	public static final int pxl_height = 32;
	public static final int pxl_width = 32;
	
	
	
	public boolean[][] code;
	public Screen(boolean[][] code){
		this.code = code;
		setPreferredSize(new Dimension(code.length * pxl_height, code[0].length * pxl_width));
		// TODO Create initialisation method and screen size
	}
	public void paintComponent(Graphics g){
		for(int y = 0; y < code.length; y++){
			for(int x = 0; x < code[0].length; x++){
				if(code[x][y]) g.fillRect(x * pxl_width, y * pxl_height, pxl_width, pxl_height);
			}
		}
	}
	
}