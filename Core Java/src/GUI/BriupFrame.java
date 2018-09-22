package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 自定义画板，并调用画布上的图形模板，形成一幅画
 * 
 * @author Administrator
 *
 */
public class BriupFrame extends JFrame {

	private static final long serialVersionUID = -4839447759065805697L;
	private static final int DEFAULT_WIDTH = 500;
	private static final int DEFAULT_HEIGHT = 500;

	private String title;
	private int canvasWidth;
	private int canvasHeight;

	public BriupFrame(String title) {
		this(title, DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}

	public BriupFrame(String title, int canvasWidth, int canvasHeight) {
		this.title = title;
		this.canvasWidth = canvasWidth;
		this.canvasHeight = canvasHeight;
        initFrame(canvasWidth, canvasHeight);
	}

	// 初始化窗口
	public void initFrame(int canvasWidth, int canvasHeight) {
		// 创建画布，设置画布大小
		JPanel BriupJPanel = new BriupJPanel();
		BriupJPanel.setPreferredSize(new Dimension(canvasWidth, canvasHeight));

		// 将画布固定到画板上
		setContentPane(BriupJPanel);
		// 调整此窗口的大小，以适合其子组件的首选大小和布局。
		pack();
		// 设置此窗体是否可由用户调整大小。
		setResizable(false);

		/*
		 * 设置用户在此窗体上发起 "close" 时默认执行的操作。必须指定以下选项之一： 
		 * DO_NOTHING_ON_CLOSE（在 WindowConstants 中定义）：不执行任何操作；要求程序在已注册的 WindowListener 对象的 windowClosing方法中处理该操作。 
		 * HIDE_ON_CLOSE（在 WindowConstants 中定义）：调用任意已注册的 WindowListener对象后自动隐藏该窗体。 
		 * DISPOSE_ON_CLOSE（在 WindowConstants 中定义）：调用任意已注册 WindowListener的对象后自动隐藏并释放该窗体。 
		 * EXIT_ON_CLOSE（在 JFrame 中定义）：使用 System exit方法退出应用程序。仅在应用程序中使用。
		 */
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

	/**
	 * BriupFrame的内部类 自定义画布，并在此类中作画
	 * @author Administrator
	 *
	 */
	class BriupJPanel extends JPanel {
		private static final long serialVersionUID = -7679743410372518875L;

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			// 得到画笔
			Graphics2D g2d = (Graphics2D) g;
			// 设置粗度
			Graphics2DModel.setStrokeWidth(g2d, 7f);

			// 抗锯齿
			Graphics2DModel.openAA(g2d);

			// 画五环
			 Graphics2DModel.setColor(g2d, Color.BLUE);
			 Graphics2DModel.strokeCircle(g2d, 135, 220, 50);
			 Graphics2DModel.setColor(g2d, Color.YELLOW);
			 Graphics2DModel.strokeCircle(g2d, 192, 270, 50);
			 Graphics2DModel.setColor(g2d, Color.BLACK);
			 Graphics2DModel.strokeCircle(g2d, 250, 220, 50);
			 Graphics2DModel.setColor(g2d, Color.GREEN);
			 Graphics2DModel.strokeCircle(g2d, 307, 270, 50);
			 Graphics2DModel.setColor(g2d, Color.RED);
			 Graphics2DModel.strokeCircle(g2d, 365, 220, 50);

		}

	}
}
