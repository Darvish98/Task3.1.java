package StepLesson;

import java.util.Scanner;

public class Task03_9 {
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число!");
		System.out.println("Введите координату \"x\" первой точки");
		double x1 = scanner.nextDouble();
		System.out.println("Введите координату \"y\" первой точки");
		double y1 = scanner.nextDouble();
		System.out.println("Введите координату \"x\" второй точки");
		double x2 = scanner.nextDouble();
		System.out.println("Введите координату \"y\" второй точки");
		double y2 = scanner.nextDouble();
		
		if (y1 == y2)
			System.out.println("Дороги ровная");
		else if (x1 == x2)
			System.out.println("Дороги отвесная");
		else if(x1 > x2 && y1 > y2 )
			System.out.println("Горка");
		else
			System.out.println("Спуск");
						
	}

}