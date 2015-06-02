import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class GraphicArray {

	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();
		draw(w);
	}

	public static void draw(DrawWindow w) {
		BufferedImage img = new BufferedImage(1200, 800,
				BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();

		g.setColor(Color.BLACK);

		// Drawing 10 equal rectangles
		int x = 50;
		for (int i = 1; i < 11; i++) {
			g.drawRect(x, 50, 50, 50);
			x += 50;
		}

		g.setColor(Color.BLACK);
		g.setFont(new Font("Cambria", Font.BOLD, 18));
		g.drawString("An array of the numbers", 200, 40);
		g.drawString("Type: int", 260, 120);
		
		// Putting an array of a numbers into a rectangles
		int y = 70;
		for (int i = 1; i < 11; i++) {
			g.drawString("" + (int) (Math.random() * 10), y, 80);
			y += 50;
		}

		w.setImage(img);
	}
}
