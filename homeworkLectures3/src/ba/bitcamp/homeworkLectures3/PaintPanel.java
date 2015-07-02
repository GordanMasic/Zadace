package ba.bitcamp.homeworkLectures3;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PaintPanel extends JPanel {

	private static final long serialVersionUID = 8116418407672994835L;

	private PointArray points;
	private Color activeColor;
	private int pointSize = 2;
	boolean isCtrl = false;
	
	private String str = "";
	private int textX;
	private int textY;

	private PointArray newPointsArray = new PointArray();
	
	private static Color[] supportedColors = new Color[] { Color.RED,
			Color.BLUE, Color.GREEN, Color.ORANGE, Color.PINK };

	private int x1;
	private int y1;
	private int x2;
	private int y2;

	public PaintPanel(int height, int width) {

		super();

		points = new PointArray();
		newPointsArray.addPoint(new Point(0, 0, 0, 0, 0, activeColor));
		setSize(width, height);
		setBackground(Color.WHITE);

		for (int i = 0; i < supportedColors.length; i++) {
			JButton color = new JButton("Pick");
			color.setName(Integer.toString(i));
			color.setForeground(supportedColors[i]);

			color.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					JButton clicked = (JButton) e.getSource();

					String name = clicked.getName();
					int index = Integer.parseInt(name);
					activeColor = supportedColors[index];

				}
			});
			add(color);
			addMouseMotionListener(new MouseHandler());
			addMouseListener(new MouseHandler());
		}

		JButton size1 = new JButton("+");
		size1.setName("+");
		JButton size2 = new JButton("-");
		size1.setName("-");
		size1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (pointSize < 50) {
					pointSize += 1;
				}

			}
		});

		add(size1);

		size2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (pointSize > 5) {
					pointSize -= 5;
				}

			}
		});

		add(size2);

		JButton undo = new JButton("undo");
		undo.setName("undo");
		undo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				PointArray temp = new PointArray();
				temp.addPoint(points.elementAt(0));
				
				
					
					newPointsArray.addPoint(points.elementAt(points.getLength()-1));
				
				System.out.println(newPointsArray.getLength()+ " " +points.getLength());
				
				
				for (int j = 1; j < points.getLength() - 5; j++) {
					if(!points.elementAt(j).equals(points.elementAt(j-1))){
						temp.addPoint(points.elementAt(j));
						
					}
					
				}
				points = temp;
				repaint();
			}
		});
		add(undo);

		JButton redo = new JButton("redo");
		redo.setName("redo");
		redo.addActionListener(new ActionListener() {
			int counter = 1;
			@Override
			public void actionPerformed(ActionEvent e) {
//				for (int i = newPointsArray.getLength() - 1; i >= newPointsArray
//						.getLength() - 3; i--) {
					points.addPoint(newPointsArray.elementAt(newPointsArray.getLength()-counter));
					counter++;
					if(counter == 4){
						counter = 1;
					}
					repaint();
				}

//			}
		});
		add(redo);
		
		JButton text = new JButton("Text");
		text.setName("Text");
		text.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				str = JOptionPane.showInputDialog("Insert text");
				String coordinates = "" + JOptionPane.showInputDialog("Insert coordinates where you want to set text");
				
				textX = Integer.parseInt(coordinates.substring(0, coordinates.indexOf(',')));
				textY = Integer.parseInt(coordinates.substring(coordinates.indexOf(',')+1));
				
				repaint();
				
				
			}
		});
		add(text);
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		for (int i = 0; i < points.getLength(); i++) {
			Point p = points.elementAt(i);
			g.setColor(p.getColor());
			Graphics2D g2d = (Graphics2D) g;
			if (p.isFill()) {
				g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
						RenderingHints.VALUE_ANTIALIAS_ON);
				g2d.setStroke(new BasicStroke(p.getSize()));
				g2d.drawLine(p.getX(), p.getY(), p.getX1(), p.getY1());
			} else {

				g2d.drawOval(p.getX(), p.getY(), p.getSize(), p.getSize());

			}
			
		}
		g.setFont(new Font("Serif", Font.ITALIC, 25));
		g.drawString(str, textX, textY);

	}

	private class MouseHandler extends MouseAdapter {

		public void mouseDragged(MouseEvent e) {
			Point newPoint = new Point(x2, y2, e.getX(), e.getY(), pointSize,
					activeColor);

			x2 = e.getX();
			y2 = e.getY();
			if (e.isShiftDown() == true) {
				newPoint.setColor(Color.WHITE);

			}
			if (e.isControlDown() == true) {
				newPoint.setFill(false);
			} else {
				newPoint.setFill(true);
			}

			points.addPoint(newPoint);
			repaint();
		}

		@Override
		public void mousePressed(MouseEvent e) {
			super.mousePressed(e);

			x1 = e.getX();
			y1 = e.getY();
			x2 = x1;
			y2 = y1;

		}


	}

}