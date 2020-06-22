package StepLesson;

import java.util.Scanner;

public class Task3_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Çäğàâñòâóéñòå,óêàæèòå ïîæàëóéñòà âğåìÿ:");		
		int Number = scanner.nextInt();					
		
		if ((Number >= 6) && (Number < 12))
			System.out.println("Äîáğîå óòğî");
		else if ((Number >= 12) && (Number < 18))
			System.out.println("Äîáğûé äåíü");
		else if ((Number >= 18) && (Number < 24))
			System.out.println("Äîáğûé âå÷åğ");
		else if ((Number < 6) || (Number <= 24))
			System.out.println("Äîáğîé íî÷è");
		else
			System.out.println("Ââåäèòå ÷èñëî îò 0 äî 24");
		scanner.close();
		
			

}
}