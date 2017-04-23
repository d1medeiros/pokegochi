package pokegochi.teste;

import java.time.LocalTime;

public class Teste {

	public static void main(String[] args) {

		
		
		int a = 1;
		
		int b = 5;
		
		int c = 12;
		
		if(a == 1 && b == 5)
			System.out.println("tipo 1");
		if(a == 1 && b == 6)
			System.out.println("tipo 2");
		if(a == 1 & b == 5)
			System.out.println("tipo 3");
		
		System.out.println(LocalTime.of(6, 20, 26, 237));
		System.out.println(LocalTime.now());
		
		
	}

}
