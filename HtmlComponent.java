/**
 * the class can draw the layout give component given place.
 * @author rickchang
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HtmlComponent extends JPanel{
	
	/**
	 * constructor of HtmlComponent
	 * it means that if creating a object of HtmlComponent, 
	 * then the default panel will be like that
	 * ----------------------
	 * 	input the url
	 * ----------------------
	 * 	input the filename
	 * ----------------------
	 * 		Download
	 */
	public HtmlComponent() {
		
		Html html =new Html("input the url","input the filename");
		// set the layout
		setLayout(new GridLayout(3,1));
		// set the first textfield
		JTextField urlField = new JTextField(html.getUrl());
		urlField.setFont(new Font("Arial",20, 15));
		add(urlField);
		
		// set the second textfield
		JTextField filenameField =new JTextField(html.getFilename());
		filenameField.setFont(new Font("Arial",20, 15));
		add(filenameField);
		
		// set the button
		JButton downloadButton =new JButton("DOWNLOAD");
		downloadButton.setFont(new Font("Arial",Font.BOLD, 18));
		DownloadListener download = new DownloadListener(urlField,filenameField,downloadButton);
		add(downloadButton);
		downloadButton.addActionListener(download);

		
	}
}
