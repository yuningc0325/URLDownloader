/**
 * the class contains main method which creates and sets
 * the Jframe.
 * @author rickchang
 */
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HtmlReadGui extends JPanel {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Read Html File");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		HtmlComponent h = new HtmlComponent();
		frame.add(h);
		frame.setVisible(true);
	}
}

// add the comment here for testing the "pull" form github! 
