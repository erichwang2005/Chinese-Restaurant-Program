import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class mpTofuGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mpTofuGUI frame = new mpTofuGUI();
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
	public mpTofuGUI() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel spTitle = new JLabel("Mapo Tofu");
		spTitle.setBounds(144, 11, 116, 31);
		spTitle.setForeground(new Color(218, 165, 32));
		spTitle.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 25));
		contentPane.add(spTitle);
		
		JLabel fdDes1 = new JLabel("Our house-made mapo tofu is a delightful \r\n");
		fdDes1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		fdDes1.setBounds(111, 53, 202, 15);
		contentPane.add(fdDes1);
		
		JLabel fdDes2 = new JLabel("meal to have in the evening! The mapo tofu is very soft \r\n\r\n");
		fdDes2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		fdDes2.setBounds(81, 71, 363, 15);
		contentPane.add(fdDes2);
		
		JLabel fdDes3 = new JLabel("and has a slight spice to it. \r\n");
		fdDes3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		fdDes3.setBounds(123, 91, 376, 15);
		contentPane.add(fdDes3);
	}

}
