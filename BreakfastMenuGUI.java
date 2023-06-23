import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class BreakfastMenuGUI extends JFrame {

	private JPanel contentPane;
	private JList list;
	private JList list_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BreakfastMenuGUI frame = new BreakfastMenuGUI();
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
	private JLabel bunsLabel;

	public BreakfastMenuGUI() throws IOException {
		setBounds(200, 200, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel title = new JLabel("Breakfast Menu");
		title.setBounds(191, 11, 209, 31);
		title.setForeground(new Color(218, 165, 32));
		title.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 30));
		contentPane.add(title);
		
		Restaurant r = new Restaurant();
		r.getMenu();
		ArrayList<String> bMenu = new ArrayList<String>();
		bMenu = r.printMenu(1);
		
		JScrollPane scrollPane = new JScrollPane();
		//JList list = new JList();
		//list.setBounds(43, 40, 100, 100);
		list_1 = new JList(bMenu.toArray());
		list_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		list_1.setSize(448, 132);
		list_1.setLocation(21, 67);
		list_1.setForeground(new Color(0, 0, 0));
		list_1.setBackground(new Color(255, 255, 255));
		list_1.setVisible(true);
		contentPane.add(list_1);
		
		tcostField = new JTextField();
		tcostField.setBounds(172, 301, 228, 25);
		contentPane.add(tcostField);
		tcostField.setColumns(10);
		
		//Import Pancake Image
		JLabel pancakesLabel = new JLabel("");
		pancakesLabel.setBounds(389, 192, 197, 185);
		contentPane.add(pancakesLabel);
		Image img = new ImageIcon(this.getClass().getResource("/scallionPancakes75.png")).getImage();
		pancakesLabel.setIcon(new ImageIcon(img));
		contentPane.add(pancakesLabel);
		
		//Import Steamed Buns image
		bunsLabel = new JLabel("");
		bunsLabel.setBounds(-47, 210, 209, 153);
		contentPane.add(bunsLabel);
		Image bunsImg = new ImageIcon(this.getClass().getResource("/steamedBuns.png")).getImage();
		bunsLabel.setIcon(new ImageIcon(bunsImg));
		contentPane.add(bunsLabel);
		
		//ComboBoxes
		JComboBox[] breakfastDrop = new JComboBox[bMenu.size()];
		
		for(int i = 0;i<bMenu.size();i++)
		{
			breakfastDrop[i] = new JComboBox();
			breakfastDrop[i].setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
			breakfastDrop[i].setBounds(479, 63+i*30, 38, 18);
			contentPane.add(breakfastDrop[i]);
		}
		
		//Button
		JButton[] breakfastBtn = new JButton[bMenu.size()];
		for(int i = 0;i<bMenu.size();i++)
		{
			breakfastBtn[i] = new JButton("+");
			breakfastBtn[i].setBounds(525, 63+i*30, 43, 18);
			contentPane.add(breakfastBtn[i]);
		}
		
		breakfastBtn[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				spancakeGUI spFrame;
				spFrame = new spancakeGUI();
				spFrame.setVisible(true);	
			}
		});
		
		breakfastBtn[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				rporridgeGUI rpFrame;
				rpFrame = new rporridgeGUI();
				rpFrame.setVisible(true);	
			}
		});
		
		breakfastBtn[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				fDoughGUI fdFrame;
				fdFrame = new fDoughGUI();
				fdFrame.setVisible(true);	
			}
		});
		
		breakfastBtn[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				sBunGUI sbFrame;
				sbFrame = new sBunGUI();
				sbFrame.setVisible(true);
			}
		});

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
				for(int i = 0;i<info.bMenu.length;i++)
				{
					String Quanstr = (String)breakfastDrop[i].getSelectedItem();
					int Quantity = Integer.parseInt(Quanstr);
					if(Quantity>0)
					{
						OrderItem item = new OrderItem(i+1,info.bMenu[i],info.bPrice[i],Quantity);
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
	
	}
}
