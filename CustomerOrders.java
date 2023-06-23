import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.io.*;
import java.util.Scanner;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.Color;

public class CustomerOrders extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerOrders frame = new CustomerOrders();
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
	DefaultListModel<String> listModel;
	
	public CustomerOrders() throws FileNotFoundException {
		setBounds(100, 100, 648, 503);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		listModel = new DefaultListModel<>();
		
		JList list = new JList();
		list.setBackground(Color.WHITE);
		list.setBounds(31, 36, 567, 401);
		contentPane.add(list);

		
		//Scanner orders = new Scanner(new File("C:\\temp_Eric\\orders.txt"));
		BufferedReader br = null;
		try {
		br = new BufferedReader(new FileReader("C:\\temp_Eric\\orders.txt"));
		
		/*int val = Integer.parseInt(br.readLine());
		for(int i=0;i<val;i++)
		{
			String oReader = br.readLine();
			listModel.addElement(oReader);
			
		}*/
		String line;
		while ((line = br.readLine()) != null) {
		    listModel.addElement(line);
		}
		list.setModel(listModel);
		}catch(Exception e) {
			System.out.println(""+e);
		}
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel cordersLabel = new JLabel("Customer Orders");
		cordersLabel.setBounds(270, 11, 120, 14);
		contentPane.add(cordersLabel);
		

		
	
	}
}
