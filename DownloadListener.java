/**
 * the class is download listener that can perform action
 * while user clicks download button
 * @author rickchang
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JTextField;

public class DownloadListener implements ActionListener{
	private JTextField urlTextField,filenameTextField;
	private JButton button;
	
	/**
	 * constructor of DownloadListener
	 * @param t1 is the first text filed
	 * @param t2 is the second text filed
	 * @param b1 is the download button
	 */
	public DownloadListener(JTextField t1,JTextField t2,JButton b1) {
		this.urlTextField=t1;
		this.filenameTextField=t2;
		this.button=b1;
		
	}
	
	/**
	 * this method can 
	 * 1. read the html from given url
	 * 2. write the html content to the new file
	 * 3. change text on the button depend on the status. 
	 */
	public void actionPerformed(ActionEvent e) {

		try {
			URL url= new URL(urlTextField.getText());
			BufferedReader in =new BufferedReader
					(new InputStreamReader(url.openStream()));
			BufferedWriter out =new BufferedWriter
					(new FileWriter(filenameTextField.getText()));
			String content;
			while((content=in.readLine())!=null){
				out.write(content+"\n");
			}
			in.close();
			button.setText("Successful!");
			
			out.close();
			
		} catch(IOException exception){
			System.out.println("the url can not be found!");	
			button.setText("Failed!"+"\n"+"please use other url and try again!");
		}
		
		
	}
}
