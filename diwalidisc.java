import java.util.*;
import java.lang.*;
import java.io.*;

class diwalidisc
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		   Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        int result = Math.max(0, A - B);
        System.out.println(result);
        
        scanner.close();
	}
}
