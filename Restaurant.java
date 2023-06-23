import java.io.*;
import java.util.*;
import java.text.*;

public class Restaurant
{
public static void main(String[] args) throws IOException
{

	NumberFormat formatter = NumberFormat.getCurrencyInstance();
	//Read Lunch Menu Items
	Scanner sf = new Scanner(new File("C:\\temp_Eric\\menudata.txt"));
	int count = -1;
	String lMenustr = sf.nextLine();
	String lMenu[] = lMenustr.split(",");
	
	//Read Lunch Prices
	String lPricestr = sf.nextLine();
	String lPricestr1[] = lPricestr.split(",");
	double lPrice[] = new double[lPricestr1.length];
	for(int i = 0;i<lPricestr1.length;i++)
	{
		lPrice[i] = Double.parseDouble(lPricestr1[i]);
	}
	
	//Read Breakfast Menu Items
	String bMenustr = sf.nextLine();
	String bMenu[] = bMenustr.split(",");
	
	//Read Breakfast Prices
	String bPricestr = sf.nextLine();
	String bPricestr1[] = bPricestr.split(",");
	double bPrice[] = new double[bPricestr1.length];
	for(int i = 0;i<bPricestr1.length;i++)
	{
		bPrice[i] = Double.parseDouble(bPricestr1[i]);
	}
	
	//Read Dinner Menu Items
	String dMenustr = sf.nextLine();
	String dMenu[] = dMenustr.split(",");
	
	//Read Dinner Prices
	String dPricestr = sf.nextLine();
	String dPricestr1[] = dPricestr.split(",");
	double dPrice[] = new double[dPricestr1.length];
	for(int i = 0;i<dPricestr1.length;i++)
	{
		dPrice[i] = Double.parseDouble(dPricestr1[i]);
	}
	
	//Read Dessert Menu Items
	String dessertMenustr = sf.nextLine();
	String dessertMenu[] = dessertMenustr.split(",");
	
	//Read Dessert Prices
	String dessertPricestr = sf.nextLine();
	String dessertPricestr1[] = dessertPricestr.split(",");
	double dessertPrice[] = new double[dessertPricestr1.length];
	for(int i = 0;i<dessertPricestr1.length;i++)
	{
		dessertPrice[i] = Double.parseDouble(dessertPricestr1[i]);
	}
	
	//Selection of Menu
	System.out.println("Welcome to the Golden Dragon Restaurant!");
	System.out.println("1. Breakfast Menu");
	System.out.println("2. Lunch Menu");
	System.out.println("3. Dinner Menu");
	
	int choice;
	System.out.println("Please select which of the following menus you would like to order from (Ex: 1,2 or 3)");
	Scanner kbReader = new Scanner(System.in);
	choice = kbReader.nextInt();
	
	Order myOrder = new Order();
	switch(choice)
	{
		case 1:
		{
			System.out.println("Here is the Breakfast Menu!");
			for(int j =0;j<bMenu.length;j++)
			{
				System.out.println(j+1 + "." + bMenu[j] + "---" + formatter.format(bPrice[j]));
			}
			
			System.out.println("Please Select which of the items you would to order");
			Scanner breakfastReader = new Scanner(System.in);
			String bItems = breakfastReader.next();
			String bitemsArray[] = bItems.split(",");
			double breakfastPrice = 0;
			
			for(int i = 0;i<bitemsArray.length;i++)
			{
				int breakfastNumber = Integer.parseInt(bitemsArray[i])-1;
				Scanner bServings = new Scanner(System.in);
				System.out.println("How many servings of " + bMenu[breakfastNumber] + " do you want?");
				int amount = bServings.nextInt();
				
				OrderItem orderitem = new OrderItem(breakfastNumber,bMenu[breakfastNumber],bPrice[breakfastNumber],amount);
				
				myOrder.orderItems.add(orderitem);
			}
			
			System.out.println("Here is the total cost " + formatter.format(myOrder.totalCost()));
			break; 
		}
		
		case 2:
		{
			System.out.println("Here is the Lunch Menu!");
			
			for(int j =0;j<lMenu.length;j++)
			{
				System.out.println(j+1 + "." + lMenu[j] + "---" + formatter.format(lPrice[j]));
			}
		}
		case 3:
		{
			System.out.println("Here is the Dinner Menu!");
			for(int j =0;j<dMenu.length;j++)
			{
				System.out.println(j+1 + "." + dMenu[j] + "---" + formatter.format(dPrice[j]));
			}
		}
		
	}
	
}
}