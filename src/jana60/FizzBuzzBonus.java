package jana60;

import java.util.Scanner;

public class FizzBuzzBonus {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero;
		System.out.println("inserisci in numero fino al quale vuoi giocare(min 1, max 200): ");
		numero = scan.nextInt();
		
		while(numero < 1 || numero > 200) {
			System.out.print("numero inserito non valido! Inserisci un altro numero: ");
			numero = scan.nextInt();
		}
		
		System.out.println("Perfetto, giochiamo fino a " + numero + "!");
		
        for(int i = 1; i < numero+1; i++) {
			
			if(i%3==0 && i%5==0) {
				System.out.println("FizzBuzz");
			}else if(i%3 == 0) {
				System.out.println("Fizz");
			}else if(i%5 == 0) {
				System.out.println("Buzz");
			}else {
				System.out.println(i);
			}
		}
        
        scan.close();
	}

}
