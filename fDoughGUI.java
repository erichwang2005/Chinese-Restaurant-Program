import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class fDoughGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fDoughGUI frame = new fDoughGUI();
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
	public fDoughGUI() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel spTitle = new JLabel("Fried-Dough Sticks and Soybean Milk");
		spTitle.setBounds(121, 11, 180, 31);
		spTitle.setForeground(new Color(218, 165, 32));
		spTitle.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 25));
		contentPane.add(spTitle);
		
		JLabel fdDes1 = new JLabel("Our house-made fried-dough sticks and soybean milk is a delightful \r\n");
		fdDes1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		fdDes1.setBounds(30, 50, 422, 15);
		contentPane.add(fdDes1);
		
		JLabel fdDes2 = new JLabel("meal to have in the morning! The fried-dough sticks have a crunchy outside \r\n\r\n");
		fdDes2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		fdDes2.setBounds(30, 70, 422, 15);
		contentPane.add(fdDes2);
		
		JLabel fdDes3 = new JLabel("and has a soft inside. The soybean milk can be served hot and cold and is rich. \r\n");
		fdDes3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		fdDes3.setBounds(30, 90, 422, 15);
		contentPane.add(fdDes3);
	}

}
