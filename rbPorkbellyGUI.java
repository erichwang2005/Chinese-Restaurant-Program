import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class rbPorkbellyGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rbPorkbellyGUI frame = new rbPorkbellyGUI();
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
	public rbPorkbellyGUI() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel spTitle = new JLabel("Red-Braised Porkbelly");
		spTitle.setBounds(121, 11, 180, 31);
		spTitle.setForeground(new Color(218, 165, 32));
		spTitle.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 25));
		contentPane.add(spTitle);
		
		JLabel fdDes1 = new JLabel("Our house-made red braised borkeblly is a delightful \r\n");
		fdDes1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		fdDes1.setBounds(30, 50, 422, 15);
		contentPane.add(fdDes1);
		
		JLabel fdDes2 = new JLabel("meal to have in the evening! The pork is soft and juicy and complements rice very well. \r\n\r\n");
		fdDes2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		fdDes2.setBounds(30, 70, 422, 15);
		contentPane.add(fdDes2);
		

	}

}
