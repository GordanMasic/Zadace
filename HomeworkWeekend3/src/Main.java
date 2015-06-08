import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Main {

	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();
		draw(w);
	}

	public static void draw(DrawWindow w) {
		BufferedImage img = new BufferedImage(1200, 800,
				BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();
		// **** Draw here ****

		g.setColor(Color.BLACK);
		g.drawRect(10, 10, 600, 300);// Biggest rectangle

		g.drawRect(85, 55, 150, 240);// First big rectangle

		g.drawRect(105, 80, 120, 120);// Big rectangle inside first big rectangle

		g.drawRect(120, 150, 100, 20);//First small rect inside big rect inside first big rect
		g.drawRect(120, 175, 100, 20);//Second small rect inside big rect inside first big rect

		g.drawRect(105, 210, 120, 35);
		g.drawRect(105, 250, 120, 35);//Done first big rect

		g.drawRect(295, 55, 150, 240);//Second big rect

		g.drawRect(315, 80, 120, 120);//Big rect inside second big rect

		g.drawRect(330, 150, 100, 20);//First small rect inside big rect inside second big rect
		g.drawRect(330, 175, 100, 20);//Second small rect inside big rect inside second big rect

		g.drawRect(315, 210, 120, 35);
		g.drawRect(315, 250, 120, 35);//Done second big rect

		g.drawRect(505, 55, 90, 240);//Third big rect
		
		//Adding text in rectangles:

		g.setColor(Color.BLUE);
		g.setFont(new Font("TimesNewRoman ", Font.BOLD, 16));
		g.drawString("java", 15, 30);

		g.setFont(new Font("TimesNewRoman ", Font.BOLD, 16));
		g.drawString("lang", 95, 75);

		g.setFont(new Font("TimesNewRoman ", Font.BOLD, 16));
		g.drawString("awt", 305, 75);

		g.setFont(new Font("TimesNewRoman ", Font.BOLD, 16));
		g.drawString("util", 515, 75);

		g.setColor(Color.GREEN);
		g.setFont(new Font("TimesNewRoman ", Font.BOLD, 14));
		g.drawString("Math", 115, 100);

		g.setFont(new Font("TimesNewRoman ", Font.BOLD, 14));
		g.drawString("Graphics", 325, 100);

		g.setFont(new Font("TimesNewRoman ", Font.BOLD, 14));
		g.drawString("String", 115, 230);

		g.setFont(new Font("TimesNewRoman ", Font.BOLD, 14));
		g.drawString("Integer", 115, 270);

		g.setFont(new Font("TimesNewRoman ", Font.BOLD, 14));
		g.drawString("Color", 325, 230);

		g.setFont(new Font("TimesNewRoman ", Font.BOLD, 14));
		g.drawString("Font", 325, 270);

		g.setColor(Color.RED);
		g.setFont(new Font("TimesNewRoman ", Font.BOLD, 12));
		g.drawString("sqrt()", 150, 165);

		g.setFont(new Font("TimesNewRoman ", Font.BOLD, 12));
		g.drawString("random()", 150, 190);

		g.setFont(new Font("TimesNewRoman ", Font.BOLD, 12));
		g.drawString("drawRect", 360, 165);

		g.setFont(new Font("TimesNewRoman ", Font.BOLD, 12));
		g.drawString("setColor", 360, 190);
		// *******************
		w.setImage(img);
	}
}
