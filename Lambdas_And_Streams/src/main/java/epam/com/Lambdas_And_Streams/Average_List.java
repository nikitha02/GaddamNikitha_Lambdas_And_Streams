package epam.com.Lambdas_And_Streams;
import java.util.ArrayList;
import java.util.Scanner;

public class Average_List{

	public static void main(String[] args) {
		int obj = 0, number;
		double avgerage;
		ArrayList<Integer> b1= new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the elments to be stored");
		int len = sc.nextInt();
		System.out.println("enter the elements");
		for(int i = 0; i < len; i++) {
			System.out.println("enter num " + (i+1));
			b1.add(sc.nextInt());
		}
		System.out.println("Average of array is " + Average_List(b1));
	}

	private static Double Average_List(ArrayList<Integer> b1) {
		return b1.stream().mapToDouble(a -> a).average().getAsDouble();
	}
}
