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
		//һ.��ͼ
		//1.���û���
		BufferedImage image=new BufferedImage(80, 30, BufferedImage.TYPE_INT_ARGB);
		//2.��û���
		Graphics g=image.getGraphics();
		//3.������������ɫ
		g.setColor(new Color(255, 255, 255));
		//4.���������ñ�����ɫ
		g.fillRect(0, 0, 80, 30);
		//5.���¸�����������ɫ
		Random r=new Random();
		g.setColor(new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)));
		//6.����һ�������
		String number=r.nextInt(88888)+"";
		//7.��
		g.drawString(number, 5, 10);
		
		//��.ѹ��ͼƬ�����
		//1.���÷��������ص���������
		 response.setContentType("image/jpeg");
		 //2.����ֽ������
		 OutputStream os=response.getOutputStream();
		 //3.ѹ��ͼƬ�����
		 javax.imageio.ImageIO.write(image, "jpeg", os);
		 os.close();
	}

}
