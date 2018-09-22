package GUI;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;

/**
 * �Զ��廭��
 * ����ͼ��ģ��
 * @author Administrator
 *
 */
public class Graphics2DModel {

	//ʹ�䲻�ܱ������ɶ���
	private Graphics2DModel() {}
	
	/**
	 * ���û�����ɫ
	 * @param g2d   
	 * @param color ������ɫ
	 */
	public static void setColor(Graphics2D g2d,Color color) {
		g2d.setColor(color);
	}
	/**
	 * ���û��ʴֶ�
	 * @param g2d  ����
	 * @param width  ���ʴֶ�
	 */
	public static void setStrokeWidth(Graphics2D g2d,float width) {
		g2d.setStroke(new BasicStroke(width));
	}
	
	/**
	 * �����
	 * @param g2d
	 */
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
	
	
	
	
	
	
	
}
