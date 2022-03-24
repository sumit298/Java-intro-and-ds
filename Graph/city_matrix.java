import java.util.Scanner;

public class city_matrix{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total number of records: ");
		int countcity = sc.nextInt();
		sc.nextLine();
		String cityname[]= new String[countcity];
		int kms[][]= new int[countcity][countcity];
		boolean connection;
		for(int index=0; index<countcity;index++)
		{
			System.out.println("Enter "+ (index+1) + " city name");
			cityname[index]=sc.nextLine();
		}
		
		for(int index=0; index<countcity;index++)
		{
			System.out.println("City "+ (index+1) + ": " + cityname[index]);
		}
		
		for(int outindex=0;outindex<countcity;outindex++)
		{
			for(int inindex=0;inindex<countcity;inindex++)
			{
				if(inindex==outindex)
				{
					kms[inindex][outindex]=0;
				}
				else
				{
					System.out.println("Do you want a route from "+ (inindex+1)+ " to " + (outindex+1)+ " Y or N");
					connection=sc.nextLine().trim().equalsIgnoreCase("y")? true : false;
					if(connection==true)
					{
						System.out.println("Enter kms: ");
						kms[inindex][outindex]=sc.nextInt();
						sc.nextLine();
					}
				}
			}
		}
		
		//to print kms matrix
		for(int index=0; index<countcity;index++)
		{
			System.out.print("    "+ cityname[index]);
		}
		System.out.println();
		for(int outindex=0;outindex<countcity;outindex++)
		{
			System.out.print(cityname[outindex] + "  ");
			for(int inindex=0;inindex<countcity;inindex++)
			{
				System.out.print("  " + kms[inindex][outindex]);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		//to print yes no matrix
		for(int index=0; index<countcity;index++)
		{
			System.out.print("    "+cityname[index]);
		}
		System.out.println();
		for(int outindex=0;outindex<countcity;outindex++)
		{
			System.out.print(cityname[outindex] + "  ");
			for(int inindex=0;inindex<countcity;inindex++)
			{
				if(kms[inindex][outindex]>0)
				{
					System.out.print("Yes  ");
				}
				else
				{
					System.out.print("No  ");
				}
				
			}
			System.out.println();
		}
	}
}
