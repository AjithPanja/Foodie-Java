package Foods;
import java.util.Scanner;
public class nonveg {
	String item[] = new String[5];
	int count[] = new int[5];
	int price[] = new int[5];
	int c = 0;
	public void display_nonveg()
	{
		Scanner s = new Scanner(System.in);
		int price_veg[] = new int[5];
		String items_veg[] = new String[5];
		items_veg[0] = "Chicken Briyani. ";
		price_veg[0] = 140;
		items_veg[1] = "Mutton Briyani. ";
		price_veg[1] = 180;
		items_veg[2] = "Prawn Briyani. ";
		price_veg[2] = 200;
		items_veg[3] = "Chicken Burger. ";
		price_veg[3] = 155;
		items_veg[4] = "Chicken Pizza. ";
		price_veg[4] = 145;
		int choice,n,check;
		boolean b = true;
		while(b)
		{
			for(int i=0;i<5;i++)
			{
				System.out.print((i+1) + " : " );
				System.out.println(items_veg[i]);
			}
			System.out.print("Enter your Choice :");
			choice = s.nextInt();
			System.out.print("Enter the no.of.Items :");
			n = s.nextInt();
			item[c] = items_veg[choice-1];
			price[c] = price_veg[choice-1];
			count[c++] = n;
			System.out.println("1.Add another item or 2.Checkout :");
			check = s.nextInt();
			if(check==2)
			{
				display_nonveg_list();
				break;
			}
		}
	}
	public void display_nonveg_list()
	{float total = 0;
	for(int j=0;j<c;j++)
	{
		System.out.println(item[j] + " " + count[j] + " * " + price[j]);
		total = total + (price[j] * count[j]);
	}
	System.out.println("Total Price : " + total);
	}
	public void clearAll()
	{
		for(int j=0;j<c;j++)
		{
			item[j] = "";
			count[j] = 0;
			price[j] = 0;
		}
	}
}