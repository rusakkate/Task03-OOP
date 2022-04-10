package by.itAcademy.training.input;
import java.util.Scanner;

public class InputConditions {
	
	public String inputString (String message) {
		String condition;
		Scanner sc = new Scanner (System.in);
		System.out.println (message);
		condition = sc.nextLine();
		
		return condition;
	}
	
	public int inputInt (String message) {
		int condition;
		Scanner sc = new Scanner (System.in);
		System.out.println (message);
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println ("Incorrect value. " + message);
		}
		condition = sc.nextInt();
		
		return condition;
	}

}
