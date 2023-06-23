import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class wSoupGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					wSoupGUI frame = new wSoupGUI();
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
	public wSoupGUI() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel spTitle = new JLabel("Wonton Soup");
		spTitle.setBounds(141, 11, 144, 31);
		spTitle.setForeground(new Color(218, 165, 32));
		spTitle.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 25));
		contentPane.add(spTitle);
		
		JLabel fdDes1 = new JLabel("Our house-made wonton soup is a delightful \r\n");
		fdDes1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		fdDes1.setBounds(106, 53, 216, 25);
		contentPane.add(fdDes1);
		
		JLabel fdDes2 = new JLabel("meal to have in the evening! The wontons are filled with a filling consisting of \r\n\r\n");
		fdDes2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		fdDes2.setBounds(29, 75, 384, 15);
		contentPane.add(fdDes2);
		
		JLabel fdDes3 = new JLabel("pork and chives. The soup is served warm and complements the wontons beautifully. \r\n");
		fdDes3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		fdDes3.setBounds(10, 89, 414, 15);
		contentPane.add(fdDes3);
	}

}
