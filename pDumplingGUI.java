import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class pDumplingGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pDumplingGUI frame = new pDumplingGUI();
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
	public pDumplingGUI() {
		setBounds(100, 100, 433, 362);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		JLabel pdTitle = new JLabel("Pork Dumplings");
		pdTitle.setBounds(121, 11, 180, 31);
		pdTitle.setForeground(new Color(218, 165, 32));
		pdTitle.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 25));
		contentPane.add(pdTitle);
		
		JLabel pdDes1 = new JLabel("Our house-made pork dumplings are a delightful meal to have at \r\n");
		pdDes1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		pdDes1.setBounds(30, 50, 422, 15);
		contentPane.add(pdDes1);
		
		JLabel pdDes2 = new JLabel("lunch! The dumplings have a thin, slightly chewy skin and a tasty\r\n\r\n");
		pdDes2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		pdDes2.setBounds(30, 70, 422, 15);
		contentPane.add(pdDes2);
		
		JLabel pdDes3 = new JLabel("filling made up on a mixure of vegetables and pork. The dumplings are served");
		pdDes3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		pdDes3.setBounds(30, 90, 422, 15);
		contentPane.add(pdDes3);
		
		JLabel pdDes4 = new JLabel("with vinegar and soysauce");
		pdDes4.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		pdDes4.setBounds(30, 110, 422, 15);
		contentPane.add(pdDes4);
	}

}
