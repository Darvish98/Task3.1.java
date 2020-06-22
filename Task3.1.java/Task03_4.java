package StepLesson;

import java.util.Scanner;

public class Task03_4 {
	public static void main(String agrs[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите координату \"x\"");
		double x = scanner.nextDouble();
		System.out.println("Введите координату \"y\"");
		double y = scanner.nextDouble();
		
		if ((x > 0) && (y > 0))
			System.out.println("Координата ("+ x +" , "+ y +") находиться I четверти");
		else if ((x < 0) && (y < 0))
			System.out.println("Координата ("+ x +" , "+ y +") находиться III четверти");
		else if ((x < 0) && (y > 0))
			System.out.println("Координата ("+ x +", "+ y +") находиться II четверти");
		else if ((x > 0) && (y < 0))
			System.out.println("Координата ("+ x +", "+ y +") находиться IV четверти");
		else if ((x == 0) && (y == 0))
			System.out.println("Координата ("+ x +", "+ y +") находиться в начале");
		else 
			System.out.println("Таких координат нет");
			
			
		
	}

}
