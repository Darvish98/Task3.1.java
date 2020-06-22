package StepLesson;

import java.util.Scanner;

public class Task03_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Âגוהטעו ךגאנעטנף:");
		int a = scanner.nextInt();
		
		if(a <= 36) 
		System.out.println("1 ןמהתוחה");
		else if((a >= 37) && (a <= 72))
			System.out.println("2 ןמהתוחה");
		else if((a >= 73) && (a <= 108))
			System.out.println("3 ןמהתוחה");
		else if((a >= 108) && (a <= 144))
			System.out.println("4 ןמהתוחה");
		else
			System.out.println("Êגאנעטנû םו סףשוסעגףוע!");
			
					
	}

}
