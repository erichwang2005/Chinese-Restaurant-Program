import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class fRiceGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fRiceGUI frame = new fRiceGUI();
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
	public fRiceGUI() {
		setBounds(100, 100, 433, 362);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		setContentPane(contentPane);
		JLabel frTitle = new JLabel("Fried Rice");
		frTitle.setBounds(121, 11, 180, 31);
		frTitle.setForeground(new Color(218, 165, 32));
		frTitle.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 25));
		contentPane.add(frTitle);
		
		JLabel frDes1 = new JLabel("Our house-made fried house is a wondeful meal to have during \r\n");
		frDes1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		frDes1.setBounds(30, 50, 422, 15);
		contentPane.add(frDes1);
		
		JLabel frDes2 = new JLabel("lunch! The rice is stir-fried with sausages, corn and carrots. \r\n\r\n");
		frDes2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		frDes2.setBounds(30, 70, 422, 15);
		contentPane.add(frDes2);
		
		JLabel frDes3 = new JLabel("The fried rice is served hot and is full of flavor.");
		frDes3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		frDes3.setBounds(30, 90, 422, 15);
		contentPane.add(frDes3);

	}

}
