

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner var = new Scanner(System.in);
		System.out.print("Enter a valid string: ");
		String str = var.nextLine();
		System.out.print("Enter a separater symbol: ");
		String sep = var.nextLine();
		String[] stringParts = str.split(sep);
		
		int l = stringParts.length;
		for(int i=0; i<l; i++)
		{
			System.out.println(stringParts[i]);
		}
	}

}
