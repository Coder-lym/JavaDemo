package GUI;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowLayoutTest {

	public static void main(String[] args) {
		Frame frame = new Frame("���Դ���");
		
		//����Frame����ʹ�� FlowLayout ���ֹ�����
        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 5));//����룬ˮƽ���20����ֱ���5
        
        //���������10����ť
        for (int i = 0; i < 10; i++) {
	       frame.add(new Button("��ť"+i));
		}
		//���ô���Ϊ��Ѵ�С
        frame.pack();
        frame.setVisible(true);
		
	}

}
