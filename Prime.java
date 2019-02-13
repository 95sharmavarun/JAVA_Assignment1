import java.util.*;
import java.util.ArrayList;
class Prime
{

public static void main(String[] args)
{
	ArrayList<Integer>prime=new ArrayList<>();
	int count=0;
prime.add(1);
prime.add(2);
	for(int i=2;i<=1000;i++)
	{
		for(int j=2;j<i/2;j++)
		{
			if(i%j==0)
			{
				count=0;
				break;
			}
			else{
				//prime.add(i);
				count++;
			}
		}
		if(count!=0){
		prime.add(i);
		}
	}
	
	System.out.println("prime numbers betwen 1 and 1000 are: ");
	for(int i=0;i<prime.size();i++)
	{
		System.out.print(" "+prime.get(i));
	}
}
}