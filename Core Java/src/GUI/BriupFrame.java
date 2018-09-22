package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * �Զ��廭�壬�����û����ϵ�ͼ��ģ�壬�γ�һ����
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

	// ��ʼ������
	public void initFrame(int canvasWidth, int canvasHeight) {
		// �������������û�����С
		JPanel BriupJPanel = new BriupJPanel();
		BriupJPanel.setPreferredSize(new Dimension(canvasWidth, canvasHeight));

		// �������̶���������
		setContentPane(BriupJPanel);
		// �����˴��ڵĴ�С�����ʺ������������ѡ��С�Ͳ��֡�
		pack();
		// ���ô˴����Ƿ�����û�������С��
		setResizable(false);

		/*
		 * �����û��ڴ˴����Ϸ��� "close" ʱĬ��ִ�еĲ���������ָ������ѡ��֮һ�� 
		 * DO_NOTHING_ON_CLOSE���� WindowConstants �ж��壩����ִ���κβ�����Ҫ���������ע��� WindowListener ����� windowClosing�����д���ò����� 
		 * HIDE_ON_CLOSE���� WindowConstants �ж��壩������������ע��� WindowListener������Զ����ظô��塣 
		 * DISPOSE_ON_CLOSE���� WindowConstants �ж��壩������������ע�� WindowListener�Ķ�����Զ����ز��ͷŸô��塣 
		 * EXIT_ON_CLOSE���� JFrame �ж��壩��ʹ�� System exit�����˳�Ӧ�ó��򡣽���Ӧ�ó�����ʹ�á�
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
	 * BriupFrame���ڲ��� �Զ��廭�������ڴ���������
	 * @author Administrator
	 *
	 */
	class BriupJPanel extends JPanel {
		private static final long serialVersionUID = -7679743410372518875L;

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			// �õ�����
			Graphics2D g2d = (Graphics2D) g;
			// ���ôֶ�
			Graphics2DModel.setStrokeWidth(g2d, 7f);

			// �����
			Graphics2DModel.openAA(g2d);

			// ���廷
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
