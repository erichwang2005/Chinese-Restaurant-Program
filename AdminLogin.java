
import java.awt.EventQueue;
import java.io.*;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class AdminLogin extends JFrame {

	private JPanel contentPane;
	private JTextField userField;
	private JTextField passField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws FileNotFoundException 
	 */
	String username;
	String password;
	int userCount;
	int passCount;
	
	public AdminLogin() throws FileNotFoundException {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Admin Login");
		lblNewLabel.setBounds(193, 10, 78, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("username");
		lblNewLabel_1.setBounds(34, 36, 87, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("password");
		lblNewLabel_2.setBounds(34, 86, 64, 14);
		contentPane.add(lblNewLabel_2);
		
		//Textfile to ArrayList
		ArrayList<String> adminList = new ArrayList<String>();
		
		Scanner ad = new Scanner(new FileReader("C:\\temp_Eric\\admindata.txt")).useDelimiter(",");
		String admin;
		while(ad.hasNext())
		{
			admin = ad.next();
			adminList.add(admin);
		}
		
		String[] adminArray = adminList.toArray(new String[0]);
		//Username 
		userField = new JTextField();
		userField.setBounds(34, 55, 86, 20);
		contentPane.add(userField);
		userField.setColumns(10);
		
		//Password
		passField = new JTextField();
		passField.setBounds(35, 110, 86, 20);
		contentPane.add(passField);
		passField.setColumns(10);
		
		JButton loginButton = new JButton("Login");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				username = userField.getText();
				password = passField.getText();
				
				if(username.equals(adminArray[0]) && password.equals(adminArray[1]))
				{
					JOptionPane.showMessageDialog(null, "Login Success");
					AdminPage aframe;
					aframe = new AdminPage();
					aframe.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Error: Username or Password is incorrect");
				}
			}
		});
		loginButton.setBounds(32, 141, 89, 23);
		contentPane.add(loginButton);
		

	}
}
