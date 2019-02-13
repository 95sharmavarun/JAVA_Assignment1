import java.util.*;
class Duplicate
{
	
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter size of your array: ");
	int size=s.nextInt();
	int[]duplicate=new int[size];
	System.out.println("");
	System.out.println("Insert element in your array: ");
	for(int i=0;i<(duplicate.length);i++)
	{
		
		duplicate[i]=s.nextInt();
	}
	System.out.println("");
	//System.out.println("");
	int count=0;
	
	for(int i=0;i<(duplicate.length)-1;i++)
	{
		for(int j=(duplicate.length)-1;j>i;j--)
		{
			if(duplicate[j]<duplicate[i])
			{
				int temp=duplicate[j];
				duplicate[j]=duplicate[i];
				duplicate[i]=temp;
			}
		}
	}
	/*System.out.println("Elements in your array: ");
	for(int i=0;i<(duplicate.length);i++)
	{
		
		System.out.println(duplicate[i]);
	}*/
	
	System.out.println("Duplicate elements in your array: ");
	/*for(int i=0;i<(duplicate.length)-1;i++)
	{
		for(int j=i+1;j<(duplicate.length)-1;j++)
		{
			if(duplicate[i]==duplicate[j])
			{
				//System.out.println(duplicate[i]);
				count=1;
				break;
			}
			else{
				count=0;
			}
		}
		if(count!=0)
		{
			System.out.println(duplicate[i]);
		}
		
	}*/
	
	
	for(int i=0;i<(duplicate.length)-1;i++)
	{
		for(int j=(duplicate.length)-1;j>i;j--)
		{
			if(duplicate[j]==duplicate[i])
			{
				i=j;
				System.out.print(" "+duplicate[j]);
				break;
			}
		}
	}
	
}
}