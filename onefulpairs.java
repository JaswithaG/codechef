import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// write your code here
		if(a+b+(a*b)==111){
		    System.out.println("YES");
		}else{
		    System.out.println("NO");
		}
		sc.close();
		
	}
}
