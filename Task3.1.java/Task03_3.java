package StepLesson;

import java.util.Scanner;

public class Task03_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Привет, кто тебе по душе?");		
		System.out.println("1. Кот");
		System.out.println("2. Собака");
		System.out.println("3. Волк");
		System.out.println("4. Корова");
		System.out.println("5. Лягушка");
		System.out.println("6. Свинья");
		System.out.println("7. Змея");
		System.out.println("8. Птица");
		System.out.println("9. Ёжик");
		System.out.println("10. Лёв");
		System.out.println("Кто-то понравился? ВЫБИРАЙ от 1 до 10!!!");
		int Number = scanner.nextInt();
		
		switch(Number) {
	     case 1:
			System.out.println("Мяу");
			break;
		case 2:
			System.out.println("Гав");
			break;
		case 3:
			System.out.println("АУУФФФ");
			break;
		case 4:
			System.out.println("МУУУУ");
			break;
		case 5:
			System.out.println("КВА");
			break;
		case 6:
			System.out.println("ХРЮ");
			break;	
		case 7:
			System.out.println("ШШШШ");
			break;
		case 8:
			System.out.println("ЧИК-ЧИРИК");
			break;			
		case 9:
			System.out.println("ПРФ");
			break;			
		case 10:
			System.out.println("РРРРР");
			break;
		default:
			System.out.println("Такого питомца нет в списке.");
		}
		
		
	}	

		
}


