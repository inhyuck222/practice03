package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String answer = "";
		String[] inputValues;
		Arithmetic ex = null;
		int forward, rear;
		
		while (true) {

			inputValues = scanner.nextLine().split(" ");

			switch (inputValues[1]) {
			case "+":
				ex = new Add();
				break;
			case "-":
				ex = new Sub();
				break;
			case "*":
				ex = new Mul();
				break;
			case "/":
				ex = new Div();
				break;
			default:
				ex = null;
				break;
			}

			if (ex == null) {
				System.out.println("연산 입력 오류");
				continue;
			}
			
			forward = Integer.parseInt(inputValues[0]);
			rear = Integer.parseInt(inputValues[2]);
			ex.setValue(forward, rear);
			System.out.println(ex.calculate());
			
			answer = scanner.nextLine();
			if (answer.equals("quit")) {
				break;
			}
		}
		
		scanner.close();
	}

}
