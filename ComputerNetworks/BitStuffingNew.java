import java.util.Scanner;
public class BitStuffingNew {
	
	public static void main(String[] args)
	{		
		stuff();
	}
	
	static void stuff()
	{
		int sendadd=11111;
		int recadd=11011;
		try (Scanner s = new Scanner(System.in)) {
			String payloadl="";
			while(true)
			{
			
			System.out.println("Enter size of payload");
			 payloadl= s.nextLine();
			int payload = Integer.valueOf(payloadl);
			if(payload>25)
			{
				System.out.println("Size less than 25 allowed");
			}
			else {
				break;
			}
			}
			int pay = Integer.valueOf(payloadl);
			
			System.out.println("Enter the bits of data");
			String data = s.nextLine();
   
			if(data.length() > pay) 
			{
				System.out.println("Enter valid data as per the size of given payload");
			}
			else
			{
			int cnt=0;
			String str ="";
			for(int i=0; i<data.length();i++)
			{
				char ch = data.charAt(i);
				if(ch=='1')
				{
					cnt++;
					if(cnt<5)
					{
						str+=ch;
						
					}
					else
					{
						str = str + ch + '0';
						cnt=0;
					}
				}
				else
				{
					str+=ch;
				}
			}
			
			int len = str.length();
			
			int bin[] = new int[10];    
			 int index = 0;    
			 while(len > 0){    
			   bin[index++] = len%2;    
			   len = len/2;    
			 }
			
			System.out.println("\nSender address: " + sendadd);
			System.out.println("Receiver address: " + recadd);
			
			System.out.print("Payload: ");
			for(int i = 4;i >= 0;i--)
			{   
				 System.out.print(bin[i]);    
			}
				
			System.out.println();
			
			System.out.println("Flag: 01111110");
			System.out.println("Stuffed data: 01111110 " + str + " 01111110");
			
			System.out.println();
			System.out.println("*********************");
			System.out.print("Sending: " +  sendadd + " " + recadd + " ");
			for(int i = 4;i >= 0;i--)
			{   
				 System.out.print(bin[i]);    
			}
			System.out.print(" " + "01111110 " + str + " 01111110");
			System.out.println("\n*********************");
			
			System.out.println();
			System.out.println("-----------------------------");
			System.out.println("\tMoving to destuff");
			System.out.println("-----------------------------");
			destuff(str);
			}
		} catch (NumberFormatException e) {
		
			e.printStackTrace();
		}
	}

	static void destuff(String str)
	{
		int cnt=0;
		String st="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			//char chr=str.charAt(i+1);
			if(ch=='1')
			{
				cnt++;
				if(cnt==5)
				{
					cnt=0;
					i++;
				}		
				st+=ch;	
			}
			else
				st+=ch;
		}
		System.out.println("\nDestuffed string is: 01111110 " + st + " 01111110");
	}
}
