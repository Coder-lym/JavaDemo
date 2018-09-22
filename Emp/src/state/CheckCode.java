package state;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CheckCode")
public class CheckCode extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CheckCode() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//一.绘图
		//1.设置画布
		BufferedImage image=new BufferedImage(80, 30, BufferedImage.TYPE_INT_ARGB);
		//2.获得画笔
		Graphics g=image.getGraphics();
		//3.给画笔设置颜色
		g.setColor(new Color(255, 255, 255));
		//4.给画布设置背景颜色
		g.fillRect(0, 0, 80, 30);
		//5.重新给画笔设置颜色
		Random r=new Random();
		g.setColor(new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)));
		//6.生成一个随机数
		String number=r.nextInt(88888)+"";
		//7.画
		g.drawString(number, 5, 10);
		
		//二.压缩图片并输出
		//1.设置服务器返回的内容类型
		 response.setContentType("image/jpeg");
		 //2.获得字节输出流
		 OutputStream os=response.getOutputStream();
		 //3.压缩图片并输出
		 javax.imageio.ImageIO.write(image, "jpeg", os);
		 os.close();
	}

}
