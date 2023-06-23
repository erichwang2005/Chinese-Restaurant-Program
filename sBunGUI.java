import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class sBunGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sBunGUI frame = new sBunGUI();
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
	public sBunGUI() {
		setBounds(100, 100, 433, 362);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Description of the Steamed Buns
		JLabel spTitle = new JLabel("Steamed Buns");
		spTitle.setBounds(121, 11, 180, 31);
		spTitle.setForeground(new Color(218, 165, 32));
		spTitle.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 25));
		contentPane.add(spTitle);
		
		JLabel sbDes1 = new JLabel("Our house-made steamed buns are a delightful meal to have in the \r\n");
		sbDes1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		sbDes1.setBounds(30, 50, 422, 15);
		contentPane.add(sbDes1);
		
		JLabel sbDes2 = new JLabel("morning! The buns are made with a mixture of yea, sugar, and flour. \r\n\r\n");
		sbDes2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		sbDes2.setBounds(30, 70, 422, 15);
		contentPane.add(sbDes2);
		
		JLabel sbDes3 = new JLabel("The inside of the bun is nice and fluffy while the outside is soft and slightly");
		sbDes3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		sbDes3.setBounds(30, 90, 422, 15);
		contentPane.add(sbDes3);
		
		JLabel sbDes4 = new JLabel("chewy. They also contain and slightly sweet flavor.");
		sbDes4.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		sbDes4.setBounds(30, 110, 422, 15);
		contentPane.add(sbDes4);
	}
}
