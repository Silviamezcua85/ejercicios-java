import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un número entero: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " es un numero par.");
        }

        else{
            System.out.println(numero + " es un número impar.");

        }
    }
}
