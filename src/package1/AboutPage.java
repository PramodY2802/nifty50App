package package1;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class AboutPage {

	private JFrame frmAboutpage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutPage window = new AboutPage();
					window.frmAboutpage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AboutPage() {
		initialize();
		Toolkit t1=Toolkit.getDefaultToolkit();
        Dimension screensize=t1.getScreenSize();
        int screenwith = screensize.width;
		int screenheight = screensize.height;
		
		frmAboutpage.setSize(screenwith, screenheight);
		frmAboutpage.setLocationRelativeTo(null);
		frmAboutpage.getContentPane().setLayout(null);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAboutpage = new JFrame();
		frmAboutpage.setTitle("AboutPage");
		frmAboutpage.setBounds(100, 100, 450, 300);
		frmAboutpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
