import java.util.*;
import java.io.*;
public class Order
{
    ArrayList<OrderItem> orderItems;

    //Default Constructor
    Order()
    {
        orderItems = new ArrayList<OrderItem>();
    }

    //Calculate Total Cost
    public double totalCost()
    {
        double totalCost = 0;
        for(int i=0;i<orderItems.size();i++)
        {
            totalCost = totalCost + orderItems.get(i).price*orderItems.get(i).quantity;
        }
        return totalCost;
    }
    
    //Save Order 
    public void saveOrder() throws IOException
    {
        FileWriter writer = new FileWriter("C:\\temp_Eric\\orders.txt", true);
        for(int i=0; i<orderItems.size();i++)
        {
		writer.append("Item Number:" + orderItems.get(i).itemNum + "\n Item Name:" + orderItems.get(i).itemName + "\n Price:" + orderItems.get(i).price  + "\n Quantity:" + orderItems.get(i).quantity + "\n");
        }
        writer.write("\n --------------------------- \n" + "\n");
        writer.close();
    }

}