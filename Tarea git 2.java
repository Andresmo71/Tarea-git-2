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
        System.out.println("Introduce el cuarto numero");
        int num4=entrada.nextInt();
		if (num4==num1+num2+num3) {
			System.out.println("El cuarto numero es igual a la suma del primero , el segundo y el tercero ");
	
		}else {
			System.out.println("El tercer numero no es igual a la suma de los otros tres");
		}
		
		entrada.close();
	}
}