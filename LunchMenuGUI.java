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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;

public class LunchMenuGUI extends JFrame {

	private JPanel contentPane;
	private JPanel list;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LunchMenuGUI frame = new LunchMenuGUI();
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
	public LunchMenuGUI() throws IOException 
	{
		setBounds(200, 200, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel title = new JLabel("Lunch Menu");
		title.setBounds(213, 11, 209, 31);
		title.setForeground(new Color(218, 165, 32));
		title.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 30));
		contentPane.add(title);
		
		Restaurant r = new Restaurant();
		r.getMenu();
		ArrayList<String> lMenu = new ArrayList<String>();
		lMenu = r.printMenu(2);
		
		JScrollPane scrollPane = new JScrollPane();
		JList list = new JList();
		list.setBounds(43, 40, 100, 100);
		list = new JList(lMenu.toArray());
		list.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		list.setSize(319, 161);
		list.setLocation(149, 68);
		list.setForeground(new Color(0, 0, 0));
		list.setBackground(new Color(255, 255, 255));
		list.setVisible(true);
		contentPane.add(list);
		
		tcostField = new JTextField();
		tcostField.setBounds(172, 301, 228, 25);
		contentPane.add(tcostField);
		tcostField.setColumns(10);
		
		JComboBox[] lunchDrop = new JComboBox[lMenu.size()];
		
		for(int i = 0;i<lMenu.size();i++)
		{
			lunchDrop[i] = new JComboBox();
			lunchDrop[i].setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
			lunchDrop[i].setBounds(479, 70+i*30, 38, 18);
			contentPane.add(lunchDrop[i]);
		}
		
		Restaurant info = new Restaurant();
		info.getMenu();
		
		//Total Cost function
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
				for(int i = 0;i<info.lMenu.length;i++)
				{
					String Quanstr = (String)lunchDrop[i].getSelectedItem();
					int Quantity = Integer.parseInt(Quanstr);
					if(Quantity>0)
					{
						OrderItem item = new OrderItem(i+1,info.lMenu[i],info.lPrice[i],Quantity);
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
		contentPane.add(tcostButton);
		
		//Import Fried Rice Image
		JLabel riceLabel = new JLabel("");
		riceLabel.setBounds(-12, 145, 288, 218);
		contentPane.add(riceLabel);
		Image riceImg = new ImageIcon(this.getClass().getResource("/rice.png")).getImage();
		riceLabel.setIcon(new ImageIcon(riceImg));
		contentPane.add(riceLabel);
		tcostButton.setBounds(241, 275, 99, 23);
		
		//Import Dumpling Image
		JLabel dumplingLabel = new JLabel("");
		dumplingLabel.setBounds(386, 174, 210, 189);
		contentPane.add(dumplingLabel);
		Image dumplingImg = new ImageIcon(this.getClass().getResource("/dumpling.png")).getImage();
		dumplingLabel.setIcon(new ImageIcon(dumplingImg));
		contentPane.add(dumplingLabel);
		tcostButton.setBounds(241, 275, 99, 23);
		
		//Extra Info for Menu Item Button
		//Button
				JButton[] LunchBtn = new JButton[lMenu.size()];
				for(int i = 0;i<lMenu.size();i++)
				{
					LunchBtn[i] = new JButton("+");
					LunchBtn[i].setBounds(525, 69+i*30, 43, 18);
					contentPane.add(LunchBtn[i]);
				}
				
				LunchBtn[0].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						pDumplingGUI pdFrame;
						pdFrame = new pDumplingGUI();
						pdFrame.setVisible(true);	
					}
				});
				
				LunchBtn[1].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						fRiceGUI frFrame;
						frFrame = new fRiceGUI();
						frFrame.setVisible(true);	
					}
				});
				
				LunchBtn[2].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						kpChickenGUI kpcFrame;
						kpcFrame = new kpChickenGUI();
						kpcFrame.setVisible(true);	
					}
				});
				
				LunchBtn[3].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						sRollsGUI srFrame;
						srFrame = new sRollsGUI();
						srFrame.setVisible(true);
					}
				});
				
				LunchBtn[4].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						fNoodlesGUI fnFrame;
						fnFrame = new fNoodlesGUI();
						fnFrame.setVisible(true);
					}
				});
				
		
	}
}
