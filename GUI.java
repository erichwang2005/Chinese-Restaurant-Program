import java.awt.BorderLayout; 
import java.awt.EventQueue; 
import javax.swing.JFrame; 
import javax.swing.JPanel; 
import javax.swing.border.EmptyBorder; 
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.FlowLayout; 
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton; 
import javax.swing.JTextField; 
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel; 

public class GUI extends JFrame { 
private JPanel contentPane; 
private final JLabel menuLabel = new JLabel("Menus"); 
private JButton lunch;
private final ButtonGroup buttonGroup = new ButtonGroup();

/**  

 * Launch the application. 

 */ 

public static void main(String[] args) { 

EventQueue.invokeLater(new Runnable() { 

public void run() { 

try { 

GUI frame = new GUI(); 

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
static double waterPrice;
static double hteaPrice;
static double bteaPrice;
static double smoothiePrice;
static double sodaPrice;

int waterQuantity;
int hteaQuantity;
int bteaQuantity;
int smoothieQuantity;
int sodaQuantity;
private JTextField couponEnter;
static double couponCost1;
static double couponCost2;
static double couponCost3;
String couponText;
public GUI() {
	
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
setBounds(200,200, 1025, 600); 
contentPane = new JPanel(); 
contentPane.setBackground(new Color(165, 42, 42)); 
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5)); 
setContentPane(contentPane); 
contentPane.setLayout(null); 
menuLabel.setForeground(new Color(218, 165, 32)); 
menuLabel.setFont(new Font("Times New Roman", Font.BOLD, 30)); 
menuLabel.setBounds(39, 87, 192, 37); 

//Restaurant Title
contentPane.add(menuLabel); 
JLabel lblNewLabel = new JLabel("Welcome to the Golden Dragon Restaurant"); 
lblNewLabel.setForeground(new Color(218, 165, 32)); 
lblNewLabel.setBounds(201, 25, 639, 37); 
lblNewLabel.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 35)); 
contentPane.add(lblNewLabel); 

//Breakfast
JButton breakfast = new JButton("Breakfast"); 
breakfast.setBackground(new Color(255, 255, 255));
breakfast.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) 
	{
		
		BreakfastMenuGUI bframe;
		try {
			bframe = new BreakfastMenuGUI();
			bframe.setVisible(true);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
});
breakfast.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
breakfast.setBounds(39, 135, 219, 44); 
contentPane.add(breakfast); 

//Lunch
JButton lunch = new JButton("Lunch"); 
lunch.setBackground(new Color(255, 255, 255));
lunch.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e)
	{
		LunchMenuGUI lframe;
		try {
			lframe = new LunchMenuGUI();
			lframe.setVisible(true);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
	}
});
lunch.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
lunch.setBounds(39, 190, 219, 48);
contentPane.add(lunch);

//Dinner 
JButton dinner = new JButton("Dinner"); 
dinner.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) 
	{
		DinnerMenuGUI dframe;
		try {
			dframe = new DinnerMenuGUI();
			dframe.setVisible(true);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
});
dinner.setBackground(Color.WHITE);
dinner.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
dinner.setBounds(39, 249, 219, 48); 
contentPane.add(dinner); 
JLabel drinkLabel = new JLabel("Drinks"); 
drinkLabel.setForeground(new Color(218, 165, 32)); 
drinkLabel.setFont(new Font("Times New Roman", Font.BOLD, 30)); 
drinkLabel.setBounds(300, 87, 192, 37); 
contentPane.add(drinkLabel); 

 
//Drinks
JCheckBox waterBox = new JCheckBox("Water.........$0.50"); 
waterBox.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) 
	{
		if(waterBox.isSelected())
		{
		waterPrice = 0.50;
		}
		else
		{
		waterPrice = 0;
		}
	}
});
waterBox.setForeground(new Color(255, 255, 255)); 
waterBox.setFont(new Font("Times New Roman", Font.PLAIN, 25)); 
waterBox.setBackground(new Color(165, 42, 42)); 
waterBox.setBounds(300, 144, 219, 31); 
contentPane.add(waterBox); 

JCheckBox hteaBox = new JCheckBox("Hot Tea......$1.25"); 
hteaBox.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) 
	{
		if(hteaBox.isSelected())
		{
			hteaPrice = 1.25;
		}
		else
		{
			hteaPrice = 0;
		}
	}
});
hteaBox.setForeground(new Color(255, 255, 255)); 
hteaBox.setFont(new Font("Times New Roman", Font.PLAIN, 25)); 
hteaBox.setBackground(new Color(165, 42, 42)); 
hteaBox.setBounds(300, 178, 204, 23); 
contentPane.add(hteaBox); 

JCheckBox bteaBox = new JCheckBox("Boba Tea....$2.00"); 
bteaBox.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) 
	{
		if(bteaBox.isSelected())
		{
			bteaPrice = 2.00;
		}
		else
		{
			bteaPrice = 0;
		}
	}
});

bteaBox.setFont(new Font("Times New Roman", Font.PLAIN, 25)); 
bteaBox.setBackground(new Color(165, 42, 42)); 
bteaBox.setForeground(new Color(255, 255, 255)); 
bteaBox.setBounds(300, 204, 219, 26); 
contentPane.add(bteaBox); 

JCheckBox smoothieBox = new JCheckBox("Smoothie....$2.50"); 
smoothieBox.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e)
	{
		if(smoothieBox.isSelected())
		{
			smoothiePrice = 2.50;
		}
		else
		{
			smoothiePrice = 0;
		}
		
	}
});
smoothieBox.setForeground(new Color(255, 255, 255)); 
smoothieBox.setFont(new Font("Times New Roman", Font.PLAIN, 25)); 
smoothieBox.setBackground(new Color(165, 42, 42)); 
smoothieBox.setBounds(300, 233, 210, 23); 
contentPane.add(smoothieBox);


JCheckBox sodaBox = new JCheckBox("Soda...........$1.50");
sodaBox.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) 
	{
		if(sodaBox.isSelected())
		{
			sodaPrice = 1.50;
		}
		else
		{
			sodaPrice = 0;
		}
	}
});
sodaBox.setBackground(new Color(165, 42, 42));
sodaBox.setForeground(new Color(255, 255, 255));
sodaBox.setFont(new Font("Times New Roman", Font.PLAIN, 25));
sodaBox.setBounds(300, 260, 219, 23);
contentPane.add(sodaBox);

//Payment Method Label
JLabel paymentMethod = new JLabel("Payment Method"); 
paymentMethod.setFont(new Font("Times New Roman", Font.BOLD, 30));
paymentMethod.setForeground(new Color(218, 165, 32));
paymentMethod.setBounds(39, 333, 258, 23); 
contentPane.add(paymentMethod);

//Debit Card Button
JRadioButton debitCard = new JRadioButton("Debit Card");
debitCard.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) 
	{
		JOptionPane.showMessageDialog(null, "Thank you for paying with a debit card!");
		
	}
});
buttonGroup.add(debitCard);
debitCard.setForeground(Color.WHITE);
debitCard.setFont(new Font("Times New Roman", Font.PLAIN, 25));
debitCard.setBackground(new Color(165, 42, 42));
debitCard.setBounds(43, 377, 177, 23);
contentPane.add(debitCard);


//Credit Card Button
JRadioButton creditCard = new JRadioButton("Credit Card");
creditCard.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) 
	{
		JOptionPane.showMessageDialog(null, "Thank you for paying with a credit card!");
		
	}
});
buttonGroup.add(creditCard);
creditCard.setForeground(Color.WHITE);
creditCard.setFont(new Font("Times New Roman", Font.PLAIN, 25));
creditCard.setBackground(new Color(165, 42, 42));
creditCard.setBounds(43, 413, 162, 23);
contentPane.add(creditCard);


//Add Golden Dragon Image
JLabel imageLabel = new JLabel();
Image img = new ImageIcon(this.getClass().getResource("/goldenDragonMascot3.png")).getImage();
imageLabel.setIcon(new ImageIcon(img));
imageLabel.setBounds(320, 22, 1093, 659);
contentPane.add(imageLabel);

//Coupon System
JLabel couponField = new JLabel("Enter Coupons:\r\n");
couponField.setForeground(new Color(218, 165, 32));
couponField.setFont(new Font("Times New Roman", Font.BOLD, 30));
couponField.setBounds(44, 449, 214, 31);
contentPane.add(couponField);
couponEnter = new JTextField();
couponEnter.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) 
	{
		couponText = couponEnter.getText();
		
		if(couponText.equals("FR33F00D4M3"))
		{
			couponCost1 = 5.00;
		}
		else
		{
			couponCost1 = 0.00;
		}

		if(couponText.equals("J1NL0N9"))
		{
			couponCost2 = 3.00;
		}
		else
		{
			couponCost2 = 0.00;
		}
		
		if(couponText.equals("7WZH02"))
		{
			couponCost3 = 10.00;
		}
		else
		{
			couponCost3 = 0.00;
		}
	}
});
couponEnter.setBounds(39, 491, 219, 20);
contentPane.add(couponEnter);
couponEnter.setColumns(10);
JLabel lblNewLabel_3 = new JLabel("Note: Only 1 Coupon can be used at a time");
lblNewLabel_3.setForeground(new Color(218, 165, 32));
lblNewLabel_3.setBounds(39, 522, 273, 14);
contentPane.add(lblNewLabel_3);

//Admin Login
JButton adminButton = new JButton("Admin Login");

adminButton.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) 
	{
		AdminLogin aframe;
		try {
			aframe = new AdminLogin();
			aframe.setVisible(true);	
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
});

adminButton.setBackground(Color.WHITE);
adminButton.setBounds(876, 11, 123, 23);
contentPane.add(adminButton);


}



//Calculate the total Cost of drinks
public static double drinkCost()
{

	double drinkCosts = sodaPrice + bteaPrice + hteaPrice + smoothiePrice + waterPrice;
	return drinkCosts;
}

//Calculate Coupons
public static double couponCost()
{
	double tcouponCost = couponCost1 + couponCost2 + couponCost3;
	return tcouponCost;
}
}

