import java.util.Scanner;

public class Player {
	int number;
	
	void guess() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("I'm guessing: ");
		int num = scanner.nextInt();
		scanner.nextLine();
		
		this.number = num;
	}
}
