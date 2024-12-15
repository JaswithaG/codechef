import java.util.*;
import java.lang.*;
import java.io.*;

class luckyseven
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        String s = sc.next(); // Read the input string
        char luckyLetter = s.charAt(6); // Access the 7th character
        System.out.println(luckyLetter); // Print the lucky letter

	}
}
