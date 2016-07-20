package logical;
import java.util.Scanner;
public class Sample
{
private static Scanner sc;
public static void main(String[] args) 
    {
	String str = new String();
	System.out.println("Enter the string");
	sc = new Scanner(System.in);
	str=sc.nextLine();
	str.toCharArray();
	int len;
	char ch;
	len=str.length();
	for(int i=0;i<len;i++)
	{
	ch=str.charAt(i);
	if(Character.isLowerCase(ch))
	System.out.print(Character.toUpperCase(ch));
	else
	System.out.print(ch);
	}
  }
}


