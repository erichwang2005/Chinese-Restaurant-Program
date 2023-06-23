import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class RiceGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RiceGUI frame = new RiceGUI();
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
	public RiceGUI() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel spTitle = new JLabel("Rice");
		spTitle.setBounds(188, 11, 50, 31);
		spTitle.setForeground(new Color(218, 165, 32));
		spTitle.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 25));
		contentPane.add(spTitle);
		
		JLabel fdDes2 = new JLabel("Our house-made jasmine rice is a delightful\r\n\r\n");
		fdDes2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		fdDes2.setBounds(115, 40, 367, 15);
		contentPane.add(fdDes2);
		
		JLabel fdDes3 = new JLabel("meal to have in the evening! The rice is both fluffy and soft!  \r\n");
		fdDes3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		fdDes3.setBounds(87, 57, 381, 15);
		contentPane.add(fdDes3);
	}

}
