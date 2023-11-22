import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		System.out.println("Type in a series of numbers with spaces in between: ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int[] nums = intsFromString(input);
		System.out.println("Sum: "+addInts(nums));
	}
	
	public static int addInts(int... a) {
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			result += a[i];
		}
		return result;
	}
	
	public static int[] intsFromString(String input) {
		String[] numbers = input.replaceAll("[^0-9]", " ").split(" ");
		int[] result = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			result[i] = Integer.parseInt(numbers[i]);
		}
		return result;
	}

}
