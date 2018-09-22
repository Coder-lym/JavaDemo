package GUI;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowLayoutTest {

	public static void main(String[] args) {
		Frame frame = new Frame("测试窗口");
		
		//设置Frame容器使用 FlowLayout 布局管理器
        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 5));//左对齐，水平间距20，垂直间距5
        
        //向容器添加10个按钮
        for (int i = 0; i < 10; i++) {
	       frame.add(new Button("按钮"+i));
		}
		//设置窗口为最佳大小
        frame.pack();
        frame.setVisible(true);
		
	}

}
