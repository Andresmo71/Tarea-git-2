// Que pida tres números e indicar si el tercero es igual a la suma del primero y el 
//segundo.

import java.util.Scanner;

public class H2EJ15 {
	public static void main(String[] args) {
		System.out.println("Hola");
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce le primer numero");
		int num1=entrada.nextInt();
		System.out.println("Introduce el segundo numero");
		int num2=entrada.nextInt();
		System.out.println("Introduce el tercer numero");
		int num3=entrada.nextInt();
		if (num3==num1+num2) {
			System.out.println("El tercer numero es igual a la suma del primero y el segundo");
	
		}else {
			System.out.println("El tercer numero no es igual a la suma de los otros dos");
		}
		
		entrada.close();
	}
}