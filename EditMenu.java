import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import java.util.*;
import java.io.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JCheckBox;
import javax.swing.DefaultListModel;

public class EditMenu extends JFrame {

	private JPanel contentPane;
	private JTextField numField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditMenu frame = new EditMenu();
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
	 DefaultListModel<String> listModel = new DefaultListModel();
	private JTextField priceField;
	private JTextField nameField;
	int checkIndex;
	JCheckBox[] breakBox;
	
	public EditMenu() throws IOException {
		setBounds(100, 100, 615, 377);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.background"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Edit Menus");
		lblNewLabel.setBounds(125, 11, 87, 45);
		contentPane.add(lblNewLabel);
		
		numField = new JTextField();
		numField.setBounds(400, 165, 101, 20);
		contentPane.add(numField);
		numField.setColumns(10);
		
		priceField = new JTextField();
		priceField.setBounds(400, 205, 101, 20);
		contentPane.add(priceField);
		priceField.setColumns(10);
		
		nameField = new JTextField();
		nameField.setBounds(400, 185, 101, 20);
		contentPane.add(nameField);
		nameField.setColumns(10);

		
		/*JList list = new JList();
		list.setBounds(10, 46, 296, 282);
		contentPane.add(list);*/
		
		Restaurant r = new Restaurant();
		r.getMenu();
	 	JList list = new JList(listModel);
	 	
		list.setBounds(10, 45, 315, 256);
		list.setSize(300, 132);
		list.setLocation(21, 67);
		list.setBackground(Color.WHITE);
		 
		
		contentPane.add(list);
		//list.setVisible(true);
		
		JButton breakButton = new JButton("Breakfast");
		breakButton.setBounds(400, 45, 101, 23);
		breakButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			contentPane.setBackground(Color.WHITE);
			ArrayList<String> bMenu = new ArrayList<String>();
			bMenu = r.printMenu(1);
			for (int i=0;i<bMenu.size();i++)
			{
			listModel.add(i,bMenu.get(i));
			}
			//list(bMenu.toArray());
			list.setModel(listModel); 
			list.setVisible(true);
			
			
			//Checkboxes 
		    breakBox = new JCheckBox[bMenu.size()];
			for(int i = 0;i<bMenu.size();i++)
			{
				breakBox[i] = new JCheckBox("");
				breakBox[i].setBounds(360, 63+i*20, 37, 23);
				breakBox[i].setBackground(Color.WHITE);
				contentPane.add(breakBox[i]);
				
			}
			
			 
			
			}
		});
		contentPane.add(breakButton);
		
		
		JButton lunchButton = new JButton("Lunch");
		lunchButton.setBounds(400, 75, 101, 23);
		lunchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				contentPane.setBackground(Color.WHITE);
				ArrayList<String> lMenu = new ArrayList<String>();
				lMenu = r.printMenu(2);
				for (int i=0;i<lMenu.size();i++)
				{
				listModel.add(i,lMenu.get(i));
				}
				//list(bMenu.toArray());
				list.setModel(listModel); 
				list.setVisible(true);
				
				
				//Checkboxes 
				JCheckBox[] lunchBox = new JCheckBox[lMenu.size()];
				for(int i = 0;i<lMenu.size();i++)
				{
					lunchBox[i] = new JCheckBox("");
					lunchBox[i].setBounds(360, 63+i*20, 37, 23);
					lunchBox[i].setBackground(Color.WHITE);
					contentPane.add(lunchBox[i]);
				}
			}
		});
		contentPane.add(lunchButton);
		
		JButton dinnerButton = new JButton("Dinner");
		dinnerButton.setBounds(400, 105, 101, 23);
		dinnerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				contentPane.setBackground(Color.WHITE);
				ArrayList<String> dMenu = new ArrayList<String>();
				dMenu = r.printMenu(2);
				for (int i=0;i<dMenu.size();i++)
				{
				listModel.add(i,dMenu.get(i));
				}
				//list(bMenu.toArray());
				list.setModel(listModel); 
				list.setVisible(true);
			
			//Checkboxes 
			JCheckBox[] dinnerBox = new JCheckBox[dMenu.size()];
			for(int i = 0;i<dMenu.size();i++)
			{
				dinnerBox[i] = new JCheckBox("");
				dinnerBox[i].setBounds(360, 63+i*20, 37, 23);
				dinnerBox[i].setBackground(Color.WHITE);
				contentPane.add(dinnerBox[i]);
			}

			}
		});
		contentPane.add(dinnerButton);
		
		listModel = new DefaultListModel<>();
		
		JButton addButton = new JButton("Add");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String num = numField.getText();
				String name = nameField.getText();
				String price = priceField.getText();
					listModel.addElement(num + "." + name + "---$" + price);
					list.setModel(listModel);
					
				String[] newBMenu = new String[r.bMenu.length +1];
				for(int i =0;i<r.bMenu.length;i++)
				{
					newBMenu[i] = r.bMenu[i];
				}
				newBMenu[r.bMenu.length] = name;
				
				String[] newBPrice = new String[r.bPrice.length +1];
				for(int i =0;i<r.bPrice.length;i++)
				{
					newBPrice[i] = Double.toString(r.bPrice[i]);
				}
				newBPrice[r.bMenu.length] = price;
				
			
				
				//Save Breakfast Menu File
				
				FileWriter writer;
				try {
					writer = new FileWriter("C:\\temp_Eric\\menudata.txt");
			        for(int i=0; i<newBMenu.length;i++)
			        {
					writer.append(newBMenu[i] + ",");
			        }
			        writer.append("\n");
			        for(int i=0; i<newBPrice.length;i++)
			        {
					writer.append(newBPrice[i] + ",");
			        }
			        writer.append("\n");
			        
			        //Write Lunch
			        for(int i=0; i<r.lMenu.length;i++)
			        {
					writer.append(r.lMenu[i] + ",");
			        }
			        writer.append("\n");
			        for(int i=0; i<r.lPrice.length;i++)
			        {
					writer.append(r.lPrice[i] + ",");
			        }
			        writer.append("\n");
			        
			        //Write Dinner
			        for(int i=0; i<r.dMenu.length;i++)
			        {
					writer.append(r.dMenu[i] + ",");
			        }
			        writer.append("\n");
			        for(int i=0; i<r.dPrice.length;i++)
			        {
					writer.append(r.dPrice[i] + ",");
			        }
			        writer.close();
			        
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		addButton.setBounds(400, 235, 101, 23);
		contentPane.add(addButton);
		
		JButton editButton = new JButton("Edit");
		editButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				for (int i=0;i<breakBox.length;i++)
				{
					if (breakBox[i].isSelected())
					{
						checkIndex=i;
					}
				} 
				
				String[] editBMenu = new String[r.bMenu.length];
				for(int i =0;i<r.bMenu.length;i++)
				{
					if(i != checkIndex)
					{
						editBMenu[i] = r.bMenu[i];
					}
					else
					{
						String editedName = nameField.getText();
						editBMenu[i] = editedName;
					}
				}
				
				double[] editBPrice = new double[r.bPrice.length];
				for(int i =0;i<r.bPrice.length;i++)
				{
					if(i != checkIndex)
					{
						editBPrice[i] = r.bPrice[i];
					}
					else
					{
						double editedPrice = Double.parseDouble(priceField.getText());
						editBPrice[i] = editedPrice;
					}
				}
				
				//Save to file
				FileWriter writer;
				try {
					writer = new FileWriter("C:\\temp_Eric\\menudata.txt");
			        for(int i=0; i<editBMenu.length;i++)
			        {
					writer.append(editBMenu[i] + ",");
			        }
			        writer.append("\n");
			        for(int i=0; i<editBPrice.length;i++)
			        {
					writer.append(editBPrice[i] + ",");
			        }
			        writer.append("\n");
			        
			        //Write Lunch
			        for(int i=0; i<r.lMenu.length;i++)
			        {
					writer.append(r.lMenu[i] + ",");
			        }
			        writer.append("\n");
			        for(int i=0; i<r.lPrice.length;i++)
			        {
					writer.append(r.lPrice[i] + ",");
			        }
			        writer.append("\n");
			        
			        //Write Dinner
			        for(int i=0; i<r.dMenu.length;i++)
			        {
					writer.append(r.dMenu[i] + ",");
			        }
			        writer.append("\n");
			        for(int i=0; i<r.dPrice.length;i++)
			        {
					writer.append(r.dPrice[i] + ",");
			        }
			        writer.close();
			        
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		editButton.setBounds(400, 265, 101, 23);
		contentPane.add(editButton);
		
		//Delete Button
		JButton deleteButton = new JButton("Delete");
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				for (int i=0;i<breakBox.length;i++)
				{
					if (breakBox[i].isSelected())
					{
						checkIndex=i;
					}
					
				} 
				
				
				int k = 0;
				String[] deleteBMenu = new String[r.bMenu.length-1];
				for(int i =0;i<r.bMenu.length;i++)
				{
					if(i != checkIndex)
					{
						deleteBMenu[k] = r.bMenu[i];
						k++;
					}
				}
				
				
				double[] deleteBPrice = new double[r.bPrice.length-1];
				int j = 0;
				for(int i =0;i<r.bPrice.length;i++)
				{
						if(i != checkIndex)
						{
							deleteBPrice[j] = r.bPrice[i];
							j++;
						}

				}
				
				//save to file
				
				FileWriter writer;
					try {
						writer = new FileWriter("C:\\temp_Eric\\menudata.txt");
				        for(int i=0; i<deleteBMenu.length;i++)
				        {
						writer.append(deleteBMenu[i] + ",");
				        }
				        writer.append("\n");
				        for(int i=0; i<deleteBPrice.length;i++)
				        {
						writer.append(deleteBPrice[i] + ",");
				        }
				        writer.append("\n");
				        
				        //Write Lunch
				        for(int i=0; i<r.lMenu.length;i++)
				        {
						writer.append(r.lMenu[i] + ",");
				        }
				        writer.append("\n");
				        for(int i=0; i<r.lPrice.length;i++)
				        {
						writer.append(r.lPrice[i] + ",");
				        }
				        writer.append("\n");
				        
				        //Write Dinner
				        for(int i=0; i<r.dMenu.length;i++)
				        {
						writer.append(r.dMenu[i] + ",");
				        }
				        writer.append("\n");
				        for(int i=0; i<r.dPrice.length;i++)
				        {
						writer.append(r.dPrice[i] + ",");
				        }
				        writer.close();
				        
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				
				
			}
		});
		deleteButton.setBounds(400, 295, 101, 23);
		contentPane.add(deleteButton);
		

		
		/*JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(257, 63, 97, 23);
		contentPane.add(chckbxNewCheckBox);*/
		
		
		
		
		
		

	}

}
