package screenSaver;
/**
 * �������Բģ��
 * @author Administrator
 */
public class Circle {
    /**
     * @param x Բ�ĺ�����
     * @param y Բ��������
     * @param r Բ�뾶
     * @param vx ˮƽ������ٶ�
     * @param vy ��ֱ������ٶ�
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
	 * @param x Բ�ĺ�����
	 * @param y Բ��������
	 * @param r Բ�뾶
	 * @param vx ˮƽ�����ٶ�
	 * @param vy ��ֱ�����ٶ�
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
