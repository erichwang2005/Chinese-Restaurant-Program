import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class DinnerMenuGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DinnerMenuGUI frame = new DinnerMenuGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	String orderPlacement;
	private JTextField tcostField;
	public DinnerMenuGUI() throws IOException {
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel title = new JLabel("Dinner Menu");
		title.setBounds(213, 11, 209, 31);
		title.setForeground(new Color(218, 165, 32));
		title.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 30));
		contentPane.add(title);
		
		Restaurant r = new Restaurant();
		r.getMenu();
		ArrayList<String> dMenu = new ArrayList<String>();
		dMenu = r.printMenu(3);
		
		JScrollPane scrollPane = new JScrollPane();
		JList list = new JList();
		list.setBounds(43, 40, 100, 100);
		list = new JList(dMenu.toArray());
		list.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		list.setSize(366, 161);
		list.setLocation(87, 66);
		list.setForeground(new Color(0, 0, 0));
		list.setBackground(new Color(255, 255, 255));
		list.setVisible(true);
		contentPane.add(list);
		
		tcostField = new JTextField();
		tcostField.setBounds(172, 301, 228, 25);
		contentPane.add(tcostField);
		tcostField.setColumns(10);
		
		JComboBox[] dinnerDrop = new JComboBox[dMenu.size()];
		
		for(int i = 0;i<dMenu.size();i++)
		{
			dinnerDrop[i] = new JComboBox();
			dinnerDrop[i].setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
			dinnerDrop[i].setBounds(479, 70+i*30, 38, 18);
			contentPane.add(dinnerDrop[i]);
		}
		
		Restaurant info = new Restaurant();
		info.getMenu();
		
		//Total Cost Function
		JButton tcostButton = new JButton("Total Cost");
		tcostButton.setBackground(new Color(255, 255, 255));
		tcostButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Restaurant info = new Restaurant();
				try {
					info.getMenu();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Order myOrder = new Order();
				for(int i = 0;i<info.dMenu.length;i++)
				{
					String Quanstr = (String)dinnerDrop[i].getSelectedItem();
					int Quantity = Integer.parseInt(Quanstr);
					if(Quantity>0)
					{
						OrderItem item = new OrderItem(i+1,info.dMenu[i],info.dPrice[i],Quantity);
						myOrder.orderItems.add(item);
					}
				}
				double tCost=myOrder.totalCost() + GUI.drinkCost() - GUI.couponCost();
				NumberFormat formatter = NumberFormat.getCurrencyInstance();
				tcostField.setText(formatter.format(tCost));
				
				try {
					myOrder.saveOrder();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		tcostButton.setBounds(241, 275, 99, 23);
		contentPane.add(tcostButton);
		
		//Import Peking Duck Image
		JLabel duckLabel = new JLabel("");
		duckLabel.setBounds(-80, 226, 279, 189);
		contentPane.add(duckLabel);
		Image duckImg = new ImageIcon(this.getClass().getResource("/pekingDuck.png")).getImage();
		duckLabel.setIcon(new ImageIcon(duckImg));
		contentPane.add(duckLabel);
		tcostButton.setBounds(241, 275, 99, 23);
		
		//Import Porkbelly Image
		JLabel porkLabel = new JLabel("");
		porkLabel.setBounds(365, 187, 221, 189);
		contentPane.add(porkLabel);
		Image porkImg = new ImageIcon(this.getClass().getResource("/porkbelly.png")).getImage();
		porkLabel.setIcon(new ImageIcon(porkImg));
		contentPane.add(porkLabel);
		tcostButton.setBounds(241, 275, 99, 23);
		
		//Extra Info for Menu Item Button
		//Button
				JButton[] DinnerBtn = new JButton[dMenu.size()];
				for(int i = 0;i<dMenu.size();i++)
				{
					DinnerBtn[i] = new JButton("+");
					DinnerBtn[i].setBounds(525, 69+i*30, 43, 18);
					contentPane.add(DinnerBtn[i]);
				}
				
				DinnerBtn[0].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						RiceGUI rFrame;
						rFrame = new RiceGUI();
						rFrame.setVisible(true);	
					}
				});
				
				DinnerBtn[1].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						rbPorkbellyGUI rbpFrame;
						rbpFrame = new rbPorkbellyGUI();
						rbpFrame.setVisible(true);
					}
				});
				
				DinnerBtn[2].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						pDuckGUI pduckFrame;
						pduckFrame = new pDuckGUI();
						pduckFrame.setVisible(true);	
					}
				});
				
				DinnerBtn[3].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						mpTofuGUI mptofuFrame;
						mptofuFrame = new mpTofuGUI();
						mptofuFrame.setVisible(true);
					}
				});
				
				DinnerBtn[4].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						wSoupGUI wsoupFrame;
						wsoupFrame = new wSoupGUI();
						wsoupFrame.setVisible(true);	
					}
				});
				
				
	}

}
