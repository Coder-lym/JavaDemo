package GUI;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.TextField;

import javax.swing.JFrame;

public class PanelTest {

	public static void main(String[] args) {
		Frame frame = new Frame("²âÊÔ´°¿Ú1");
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
//		JFrame window2 = new JFrame("²âÊÔ´°¿Ú2");
//		window2.setSize(300, 300);
//		window2.setLocationRelativeTo(null);
//		window2.setVisible(true);
//		window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		Panel p = new Panel();
		ScrollPane p = new ScrollPane();
		p.add(new TextField(20));
		p.add(new Button("°´Å¥"));
		frame.add(p);
		
		
		
		
		
		
		
	}

}
