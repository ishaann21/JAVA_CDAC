import java.util.*;
class Canteen{
	public static void main(String[] args)
	{
		boolean exit=false;
		int num=0,item,count=0;
		float bill=0, idli=20,samosa=10,pohe=15,dosa=27,meduvada=32;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a choice from below:");
		System.out.println("1.idli=20,  2.samosa=10,  3.pohe=15,   4.dosa=27,   5.meduvada=32   6.bill");
		
		//item= sc.nextInt();
		while(!exit)
			{
				
				
				item= sc.nextInt();
				if(item!=6)
				{	
					
					
					System.out.println("How many of those:");
					num = sc.nextInt();
				}
				switch(item)
				{
					case 1:
						bill = bill + num*idli;
						System.out.println("Idli added!!");
						count=count+num;
						break;
					case 2:
						bill = bill + num*samosa;
						System.out.println("samosa added!!");
						count=count+num;
						break;

					case 3:
						bill = bill + num*pohe;
						System.out.println("pohe added!!");
						count=count+num;
						break;
					case 4:
						bill = bill + num*dosa;
						System.out.println("dosa added!!");
						count=count+num;
						break;
					case 5:
						bill = bill + num*meduvada;
						System.out.println("meduvada added!!");
						count=count+num;
						break;
					case 6:
						exit=true;

				
				}
				if(item!=6)
				{	
					
				System.out.println("Anything else?:");	
					
			}
				
		}
		System.out.println("Your bill for " +count+ " item is :$"+bill);

	sc.close();
	}
	
}
