import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		for (int i = 1; i <= 10; ++i) {
			System.out.println(x + " * " + i + " = " + (x * i));
			
		}
		
	}

}
