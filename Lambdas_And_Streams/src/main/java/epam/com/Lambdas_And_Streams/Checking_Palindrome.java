package epam.com.Lambdas_And_Streams;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Checking_Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> b1 = new ArrayList<String>();
		ArrayList<String> obj = new ArrayList<String>();
		System.out.println("enter the number of strings ");
		int list = sc.nextInt();
		System.out.println("enter the strings");
		for(int j = 0; j < list; j++) {
		b1.add(sc.next());
		}
		obj = palindromeList(b1);
		System.out.println("The palindrome strings are ");
		System.out.println(obj);
	}
 
	private static ArrayList<String> palindromeList(ArrayList<String> al) {
		return (ArrayList<String>) al.stream().filter(str -> str.equals(RevString(str))).collect(Collectors.toList());
	}

	public static String RevString(String str) {
		String s = "";
		for(int i = str.length()-1; i >= 0; i--) {
			s += str.charAt(i);
		}
		return s;
	}
}
