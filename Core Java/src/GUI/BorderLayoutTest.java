package GUI;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class BorderLayoutTest {

	public static void main(String[] args) {
		Frame frame = new Frame("测试窗口");
		//设置Frame容器使用 BorderLayout 布局管理器
		frame.setLayout(new BorderLayout(30,5));
        frame.add(new Button("北"));
        frame.add(new Button("南"));
        frame.add(new Button("中"));
        frame.add(new Button("西"));
        frame.add(new Button("东"));
		
        frame.pack();
        frame.setVisible(true);
        
        
	}

}
