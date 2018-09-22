package screenSaver;
/**
 * 定义空心圆模型
 * @author Administrator
 */
public class Circle {
    /**
     * @param x 圆心横坐标
     * @param y 圆心纵坐标
     * @param r 圆半径
     * @param vx 水平方向的速度
     * @param vy 垂直方向的速度
     */
	private int x;
	private int y;
	private int r;
	private int vx;
	private int vy;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public int getVx() {
		return vx;
	}
	public void setVx(int vx) {
		this.vx = vx;
	}
	public int getVy() {
		return vy;
	}
	public void setVy(int vy) {
		this.vy = vy;
	}
	/**
	 * @param x 圆心横坐标
	 * @param y 圆心纵坐标
	 * @param r 圆半径
	 * @param vx 水平方向速度
	 * @param vy 垂直方向速度
	 */
	public Circle(int x, int y, int r, int vx, int vy) {
		super();
		this.x = x;
		this.y = y;
		this.r = r;
		this.vx = vx;
		this.vy = vy;
	}
	
	public void move() {
		x += vx;
		y += vy;
	}
	
	
	
	
	
	
	
	
	
}
