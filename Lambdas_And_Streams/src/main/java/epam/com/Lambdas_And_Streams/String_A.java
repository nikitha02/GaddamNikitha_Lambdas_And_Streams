package epam.com.Lambdas_And_Streams;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class String_A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> b1 = new ArrayList<String>();
		ArrayList<String> obj = new ArrayList<String>();
		System.out.println("enter the no of string");
		int length = sc.nextInt();
		System.out.println("enter the strings");
		for(int j = 0; j < length; j++) {
			b1.add(sc.next());
		}
		obj = StringList(b1);
		System.out.println("The strings are ");
		obj.forEach(y -> System.out.println(y));
	}

	private static ArrayList<String> StringList(ArrayList<String> q1) {
		return (ArrayList<String>) q1.stream().filter(str -> str.length() == 3).filter(str -> str.startsWith("a")).collect(Collectors.toList());
	}
}

