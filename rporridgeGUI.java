import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class rporridgeGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rporridgeGUI frame = new rporridgeGUI();
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
	public rporridgeGUI() {
		setBounds(100, 100, 433, 362);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel rpTitle = new JLabel("Rice Porridge");
		rpTitle.setBounds(121, 11, 180, 31);
		rpTitle.setForeground(new Color(218, 165, 32));
		rpTitle.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 25));
		contentPane.add(rpTitle);
		
		JLabel rpDes1 = new JLabel("Our house-made rice porridge is a delightful meal to have in the \r\n");
		rpDes1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		rpDes1.setBounds(30, 50, 422, 15);
		contentPane.add(rpDes1);
		
		JLabel rpDes2 = new JLabel("morning! The porridge is made by boiling rice until it breaks down \r\n\r\n");
		rpDes2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		rpDes2.setBounds(30, 70, 422, 15);
		contentPane.add(rpDes2);
		
		JLabel rpDes3 = new JLabel("and has a soft creamy texture. It has a pudding like consistency. \r\n");
		rpDes3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		rpDes3.setBounds(30, 90, 422, 15);
		contentPane.add(rpDes3);
		
		
	}

}
