import java.util.*;
class Pyramid
{
public static void main(String[] args)
{

System.out.println("enter a number for pyramid: ");
Scanner x=new Scanner(System.in);
int n=x.nextInt();
int c=n;
int l=1;
for(int i=0;i<n;i++)
{
	for(int j=0;j<c;j++)
	{
		System.out.print(" ");
	}
	for(int k=0;k<l;k++)
	{
		System.out.print("*");
		System.out.print(" ");
	}
	c--;
	l++;
	System.out.println("");
}
/*int m=2;
int p=n-1;
for(int i=n-1;i>0;i--)
{
	for(int j=0;j<m;j++)
	{
		System.out.print(" ");
	}
	for(int k=0;k<p;k++)
	{
		System.out.print("*");
		System.out.print(" ");
	}
	m++;
	p--;
	System.out.println("");
}*/


}	
}
