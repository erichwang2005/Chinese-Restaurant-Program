import java.io.*;
import java.util.*;
import java.text.*;

public class Restaurant
{
	String bMenu[];
	double bPrice[];
	String lMenu[];
	double lPrice[];
	String dMenu[];
	double dPrice[];
	String dessertMenu[];
	double dessertPrice[];
	
	public void getMenu() throws IOException
	{
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		Scanner sf = new Scanner(new File("C:\\temp_Eric\\menudata.txt"));
		
		//Read Breakfast Menu Items
		String bMenustr = sf.nextLine();
		this.bMenu = bMenustr.split(",");
		
		//Read Breakfast Prices
		String bPricestr = sf.nextLine();
		String bPricestr1[] = bPricestr.split(",");
		this.bPrice = new double[bPricestr1.length];
		for(int i = 0;i<bPricestr1.length;i++)
		{
			bPrice[i] = Double.parseDouble(bPricestr1[i]);
		}
		
		//Read Lunch Menu Items
		String lMenustr = sf.nextLine();
		 this.lMenu = lMenustr.split(",");
		
		//Read Lunch Prices
		String lPricestr = sf.nextLine();
		String lPricestr1[] = lPricestr.split(",");
		this.lPrice = new double[lPricestr1.length];
		for(int i = 0;i<lPricestr1.length;i++)
		{
			lPrice[i] = Double.parseDouble(lPricestr1[i]);
		}
		

		
		//Read Dinner Menu Items
		String dMenustr = sf.nextLine();
		this.dMenu = dMenustr.split(",");
		
		//Read Dinner Prices
		String dPricestr = sf.nextLine();
		String dPricestr1[] = dPricestr.split(",");
		this.dPrice = new double[dPricestr1.length];
		for(int i = 0;i<dPricestr1.length;i++)
		{
			dPrice[i] = Double.parseDouble(dPricestr1[i]);
		}
		
		/*//Read Dessert Menu Items
		String dessertMenustr = sf.nextLine();
		this.dessertMenu = dessertMenustr.split(",");
		
		//Read Dessert Prices
		String dessertPricestr = sf.nextLine();
		String dessertPricestr1[] = dessertPricestr.split(",");
		this.dessertPrice = new double[dessertPricestr1.length];
		for(int i = 0;i<dessertPricestr1.length;i++)
		{
			dessertPrice[i] = Double.parseDouble(dessertPricestr1[i]);
		}*/
	}
	
	//Print all 3 different types of menus
	public ArrayList<String> printMenu(int choice)
	{
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		ArrayList<String> menu = new ArrayList<String>();
		switch(choice)
		{
			//Prints Breakfast Menu
			case 1:
			{
				for(int j =0;j<bMenu.length;j++)
				{
					String bList = j+1 + "." + bMenu[j] + "---" + formatter.format(bPrice[j]);
					menu.add(bList);
					
				}
				
				break; 
			}
			
			//Prints Lunch Menu
			case 2:
			{
				for(int j =0;j<lMenu.length;j++)
				{
					String lList = (j+1 + "." + lMenu[j] + "---" + formatter.format(lPrice[j]));
					menu.add(lList);
					
				}
				break;
			
			//Prints the Dinner Menu
			}
			case 3:
			{
				for(int j =0;j<dMenu.length;j++)
				{
					String dList = (j+1 + "." + dMenu[j] + "---" + formatter.format(dPrice[j]));
					menu.add(dList);
				}
				break;
			}
		
		}
		return menu;
	}
}