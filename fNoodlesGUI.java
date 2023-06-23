import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class fNoodlesGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fNoodlesGUI frame = new fNoodlesGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public fNoodlesGUI() {
		setBounds(100, 100, 433, 362);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		setContentPane(contentPane);
		JLabel fnTitle = new JLabel("Fried Noodles");
		fnTitle.setBounds(121, 11, 180, 31);
		fnTitle.setForeground(new Color(218, 165, 32));
		fnTitle.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 25));
		contentPane.add(fnTitle);
		
		JLabel fnDes1 = new JLabel("Our house-made fried noodles are a delightful meal to have during \r\n");
		fnDes1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		fnDes1.setBounds(30, 50, 422, 15);
		contentPane.add(fnDes1);
		
		JLabel fnDes2 = new JLabel("lunch! The noodles are handmade and served with beef and green beans.\r\n\r\n");
		fnDes2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		fnDes2.setBounds(30, 70, 422, 15);
		contentPane.add(fnDes2);
		
		JLabel fnDes3 = new JLabel("The noodles are savory and have slightly peppery taste.");
		fnDes3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		fnDes3.setBounds(30, 90, 422, 15);
		contentPane.add(fnDes3);
		
	}

}
