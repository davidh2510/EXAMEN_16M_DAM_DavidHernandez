import java.util.Scanner;

public class Examen {
	
	public static void main (String [] arg) {
		Scanner ent = new Scanner(System.in);
		int numero = 0; 
		
		System.out.println("Buenos dias Ceinmark, soy David");
		
		System.out.println("Introduce un numero");
		numero = Integer.parseInt(ent.nextLine());
		
		if (numero <= 1) {
            System.out.println(numero + " no es un número primo.");
        } else {
            boolean esPrimo = true;
            System.out.print("Los divisores de " + numero + " son: 1");
            
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    System.out.print(", " + i);
                    esPrimo = false;
                }
            }
            
            System.out.println(", " + numero);

            if (esPrimo) {
                System.out.println(numero + " es un número primo.");
            } else {
                System.out.println(numero + " no es un número primo.");
            }
        }
	}

}
