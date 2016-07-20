package guvi;
import java.util.*;
public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a charachter");
		a=s.next();
		if(a.equals("a")|| a.equals("e")|| a.equals("i") || a.equals("o")|| a.equals("u"))
		{
			System.out.println("The entered Charachter is a vowel");
		}
		else
		{
			System.out.println("The entered Charachter is a consonant");
		}

	}

}
