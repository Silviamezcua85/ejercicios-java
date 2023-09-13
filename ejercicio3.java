import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Ingresa el primer número: ");
        double numero1 = sc.nextDouble();
        System.out.print("Ingresa el segundo número: ");
        double numero2 = sc.nextDouble();
        System.out.print("Ingresa el tercer número: ");
        double numero3 = sc.nextDouble();
        
        
        double minimo = Math.min(Math.min(numero1, numero2), numero3);
        
       
        System.out.println("El mínimo de los tres números es: " + minimo);
        
        
    }
}
