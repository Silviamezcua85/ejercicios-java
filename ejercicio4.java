import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Ingresa un número: ");
        double numero = sc.nextDouble();
        
    
        if (numero > 0) {
            System.out.println(numero + " es un número positivo.");
        } 
        else if (numero < 0) {
            System.out.println(numero + " es un número negativo.");
        } 
        else {
            System.out.println("El número es igual a cero.");
        }
        
        
    }
}
