import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class kpChickenGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kpChickenGUI frame = new kpChickenGUI();
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
	public kpChickenGUI() {
		setBounds(100, 100, 433, 362);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		setContentPane(contentPane);
		JLabel kpcTitle = new JLabel("Kung Pao Chicken");
		kpcTitle.setBounds(121, 11, 180, 31);
		kpcTitle.setForeground(new Color(218, 165, 32));
		kpcTitle.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 25));
		contentPane.add(kpcTitle);
		
		JLabel kpcDes1 = new JLabel("Our house-made kung pao chicken are a delightful meal to have at \r\n");
		kpcDes1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		kpcDes1.setBounds(30, 50, 422, 15);
		contentPane.add(kpcDes1);
		
		JLabel kpcDes2 = new JLabel("lunch! The dish is made of chicken, peanuts, peppers and a variety of \r\n\r\n");
		kpcDes2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		kpcDes2.setBounds(30, 70, 422, 15);
		contentPane.add(kpcDes2);
		
		JLabel kpcDes3 = new JLabel("spices and herbs. The chicken is savory and slightly spicy!");
		kpcDes3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		kpcDes3.setBounds(30, 90, 422, 15);
		contentPane.add(kpcDes3);

	}

}
