import java.util.Scanner;

public class Binary_Converter_Java {

	public static void main(String[] args) {
		// System.out.println("842");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.print(toBinary(x));
	}

	public static String toBinary(int num) {
		String binary = "";
		while (num > 0) {
			binary = (num % 2) + binary;
			num /= 2;
		}
		return binary;
	}
}