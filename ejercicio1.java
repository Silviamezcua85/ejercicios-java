import java.util.Scanner;

public class ejercicio1{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el radio del circulo: ");
        
        double radio = sc.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("El area del circulo con radio de " + radio + " es: " + area);
        
    }
}