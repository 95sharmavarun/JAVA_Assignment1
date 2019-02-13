import java.util.*;
class Copy
{
		
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter size of your array: ");
	int size=s.nextInt();
	int[]copy=new int[size];
	System.out.println("Insert element in your array: ");
	for(int i=0;i<=(copy.length)-1;i++)
	{
		
		copy[i]=s.nextInt();
	}
	System.out.println("");
	System.out.println("");
	int[]paste=new int[size];
		System.out.println("Copying elements of one array to another ");
	for(int i=0;i<=(copy.length)-1;i++)
	{
		
		paste[i]=copy[i];
	}	
		System.out.println("elements of second array are: ");
	for(int i=0;i<=(copy.length)-1;i++)
	{
		
		System.out.println(paste[i]);
	}	
	
}
}
	