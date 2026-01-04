import java.util.Scanner;
public class Main{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		SLL list = new SLL();
		boolean menu = true;
		
		while(menu)
		{
			System.out.println("1.Insert at begn:");
			System.out.println("2.Insert at end:");
			System.out.println("3.Insert at n:");
			System.out.println("4.Deletion at begn:");
			System.out.println("5.Deletion at end:");
			System.out.println("6.Deletion at n:");
			System.out.println("7.Display:");
			System.out.println("8.exit:");
			System.out.print("Enter your choice:");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1:{	
					System.out.print("Enter the value of node:");
					int value = sc.nextInt();
					list.addNodeAtFirst(value);
					break;
				}	
				case 2:{	
					System.out.print("Enter the value of node:");
					int value = sc.nextInt();
					list.addNodeAtLast(value);
					break;
				}
				case 3:{	
					System.out.print("Enter the value of node:");
					int value = sc.nextInt();	
					System.out.print("Enter the position:");
					int n = sc.nextInt();
					list.addNodeAtN(value,n);
					break;
				}
				case 4:{
					list.delNodeAtFirst();
					break;
				}	
				case 5:{
					list.delNodeAtLast();
					break;
				}
				case 6:{
					System.out.print("Enter the position:");
					int n = sc.nextInt();
					list.delNodeAtN(n);
					break;
				}
				case 7:{
					list.display();
					break;
				}	
				case 8:{
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