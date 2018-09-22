package GUI;

import java.awt.Button;
import java.awt.Frame;

import javax.swing.BoxLayout;

public class BoxLayoutTest {

	private Frame frame = new Frame("≤‚ ‘");
	public void init() {
		frame.setLayout(new BoxLayout(frame, BoxLayout.X_AXIS));
		frame.add(new Button("∞¥≈•1"));
		frame.add(new Button("∞¥≈•2"));
		frame.pack();
		frame.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new BoxLayoutTest().init();

	}

}
