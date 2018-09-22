package GUI;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;

/**
 * 自定义画笔
 * 定制图形模板
 * @author Administrator
 *
 */
public class Graphics2DModel {

	//使其不能被创建成对象
	private Graphics2DModel() {}
	
	/**
	 * 设置画笔颜色
	 * @param g2d   
	 * @param color 画笔颜色
	 */
	public static void setColor(Graphics2D g2d,Color color) {
		g2d.setColor(color);
	}
	/**
	 * 设置画笔粗度
	 * @param g2d  画笔
	 * @param width  画笔粗度
	 */
	public static void setStrokeWidth(Graphics2D g2d,float width) {
		g2d.setStroke(new BasicStroke(width));
	}
	
	/**
	 * 抗锯齿
	 * @param g2d
	 */
	public static void openAA(Graphics2D g2d) {
		RenderingHints hints = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.addRenderingHints(hints);
	}
	
	/**
	 * 绘制空心圆模板
	 * @param g2d  画笔
	 * @param x  圆心横坐标
	 * @param y  圆心纵坐标
	 * @param r  圆半径
	 */
	public static void strokeCircle(Graphics2D g2d,int x,int y,int r) {
		Ellipse2D ellipse2d =new Ellipse2D.Float(x-r, y-r, 2*r, 2*r);
		g2d.draw(ellipse2d);
	}
	
	
	
	
	
	
	
}
