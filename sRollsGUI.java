import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class sRollsGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sRollsGUI frame = new sRollsGUI();
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
	public sRollsGUI() {
		setBounds(100, 100, 433, 362);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		setContentPane(contentPane);
		JLabel srTitle = new JLabel("Spring Rolls");
		srTitle.setBounds(121, 11, 180, 31);
		srTitle.setForeground(new Color(218, 165, 32));
		srTitle.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 25));
		contentPane.add(srTitle);
		
		JLabel srDes1 = new JLabel("Our house-made spring rolls are a delightful meal to have at \r\n");
		srDes1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		srDes1.setBounds(30, 50, 422, 15);
		contentPane.add(srDes1);
		
		JLabel srDes2 = new JLabel("lunch! The rolls have a thin, crispy skin and a tasty\r\n\r\n");
		srDes2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		srDes2.setBounds(30, 70, 422, 15);
		contentPane.add(srDes2);
		
		JLabel srDes3 = new JLabel("filling made up on a mixure of vegetables and pork. The rolls are served");
		srDes3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		srDes3.setBounds(30, 90, 422, 15);
		contentPane.add(srDes3);
		
		JLabel srDes4 = new JLabel("with vinegar and soysauce");
		srDes4.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		srDes4.setBounds(30, 110, 422, 15);
		contentPane.add(srDes4);
	}

}
