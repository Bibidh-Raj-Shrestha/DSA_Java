import java.util.Scanner;
public class Main{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		CDLL list = new CDLL();
		boolean menu = true;
		
		while(menu)
		{
			System.out.println("1.Insert at begn:");
			System.out.println("2.Insert at end:");
			System.out.println("3.Deletion at begn:");
			System.out.println("4.Deletion at end:");
			System.out.println("5.Display:");
			System.out.println("6.exit:");
			System.out.print("Enter your choice:");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1:{	
					System.out.print("Enter the value of node:");
					int value = sc.nextInt();
					list.insertFirst(value);
					break;
				}	
				case 2:{	
					System.out.print("Enter the value of node:");
					int value = sc.nextInt();
					list.insertLast(value);
					break;
				}
				case 3:{
					list.deleteFirst();
					break;
				}	
				case 4:{
					list.deleteLast();
					break;
				}
				case 5:{
					list.display();
					break;
				}	
				case 6:{
					menu = false;
					break;
				}
				default:{
					System.out.println("Enter correct choice please:");
				}		
			}
		}
		System.out.println("Exiting...");
	}
}