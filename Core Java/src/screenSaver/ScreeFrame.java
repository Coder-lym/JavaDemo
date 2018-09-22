package screenSaver;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ScreeFrame extends JFrame {

	private static final long serialVersionUID = -4839447759065805697L;
	private static final int DEFAULT_WIDTH = 600;
	private static final int DEFAULT_HEIGHT = 600;

	private String title;
	private int canvasWidth;
	private int canvasHeight;
	
	public ScreeFrame(){
		super();
	}

	public ScreeFrame(String title) {
		this(title, DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}

	public ScreeFrame(String title, int canvasWidth, int canvasHeight) {
		this.title = title;
		this.canvasWidth = canvasWidth;
		this.canvasHeight = canvasHeight;
		initFrame(canvasWidth, canvasHeight);
	}

	public void initFrame(int canvasWidth, int canvasHeight) {
		JPanel BriupJPanel = new screenJPanel();
		BriupJPanel.setPreferredSize(new Dimension(canvasWidth, canvasHeight));

		setContentPane(BriupJPanel);
		pack();
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCanvasWidth() {
		return canvasWidth;
	}

	public void setCanvasWidth(int canvasWidth) {
		this.canvasWidth = canvasWidth;
	}

	public int getCanvasHeight() {
		return canvasHeight;
	}

	public void setCanvasHeight(int canvasHeight) {
		this.canvasHeight = canvasHeight;
	}


	private Circle[] circles;
	
    public Circle[] getCircles() {
		return circles;
	}

	public void setCircles(Circle[] circles) {
		this.circles = circles;
	}

	
	class screenJPanel extends JPanel {
		private static final long serialVersionUID = -7679743410372518875L;

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			// µ√µΩª≠± 
			Graphics2D g2d = (Graphics2D) g;
			// …Ë÷√¥÷∂»
			CircleG2d.setStrokeWidth(g2d, 2f);
			// øπæ‚≥›
			CircleG2d.openAA(g2d);
			for (Circle circle : circles) {
				CircleG2d.strokeCircle(g2d, circle.getX(), circle.getY(), circle.getR());
				repaint();
			}

		}

	}
}
