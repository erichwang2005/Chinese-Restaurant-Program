import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

public class spancakeGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					spancakeGUI frame = new spancakeGUI();
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
	public spancakeGUI() {
		setBounds(100, 100, 433, 362);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Description of the Scallion Pancakes
		JLabel spTitle = new JLabel("Scallion Pancakes");
		spTitle.setBounds(121, 11, 180, 31);
		spTitle.setForeground(new Color(218, 165, 32));
		spTitle.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 25));
		contentPane.add(spTitle);
		
		JLabel spDes1 = new JLabel("Our house-made scallion pancakes are a delightful meal to have in the \r\n");
		spDes1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		spDes1.setBounds(30, 50, 422, 15);
		contentPane.add(spDes1);
		
		JLabel spDes2 = new JLabel("morning! The pancakes are served with soy sauce, and garnished with \r\n\r\n");
		spDes2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		spDes2.setBounds(30, 70, 422, 15);
		contentPane.add(spDes2);
		
		JLabel spDes3 = new JLabel("freshly cut spring onions. They have savory taste with a crispy and falky \r\n");
		spDes3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		spDes3.setBounds(30, 90, 422, 15);
		contentPane.add(spDes3);
		
		JLabel spDes4 = new JLabel("exterior and a slightly chewy interior. ");
		spDes4.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		spDes4.setBounds(30, 110, 422, 15);
		contentPane.add(spDes4);
	}

}
