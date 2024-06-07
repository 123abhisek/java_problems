package sample;

import java.applet.*;
import java.awt.Graphics;

public class applet_class extends Applet {

	public static void paint(Graphics g) {
		g.drawString("Hello world", 150, 150);
	}
	public static void main(String[] args) {
		
		paint(null);
		
	}

}
