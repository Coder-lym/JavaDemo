package GUI;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class BorderLayoutTest {

	public static void main(String[] args) {
		Frame frame = new Frame("���Դ���");
		//����Frame����ʹ�� BorderLayout ���ֹ�����
		frame.setLayout(new BorderLayout(30,5));
        frame.add(new Button("��"));
        frame.add(new Button("��"));
        frame.add(new Button("��"));
        frame.add(new Button("��"));
        frame.add(new Button("��"));
		
        frame.pack();
        frame.setVisible(true);
        
        
	}

}
