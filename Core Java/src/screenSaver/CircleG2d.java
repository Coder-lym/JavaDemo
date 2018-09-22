package screenSaver;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;

public class CircleG2d {
	
	private CircleG2d() {}

	public static void setColor(Graphics2D g2d, Color color) {
		g2d.setColor(color);
	}

	//Ciecle ���
	public static void setStrokeWidth(Graphics2D g2d, float width) {
		g2d.setStroke(new BasicStroke(width));
	}
    //�����
	public static void openAA(Graphics2D g2d) {
		RenderingHints hints = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.addRenderingHints(hints);
	}

	/**
	 * ���ƿ���Բģ��
	 * @param g2d  ����
	 * @param x  Բ�ĺ�����
	 * @param y  Բ��������
	 * @param r  Բ�뾶
	 */
	public static void strokeCircle(Graphics2D g2d,int x,int y,int r) {
		Ellipse2D ellipse2d =new Ellipse2D.Float(x-r, y-r, 2*r, 2*r);
		g2d.draw(ellipse2d);
	}
	
	public static void sleep(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
	
	
	
	
	
}
