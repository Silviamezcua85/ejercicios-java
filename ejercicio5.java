import java.util.Scanner;

public class ejercicio5 {
   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa un año: ");
        int anio = sc.nextInt();
        
        boolean esBisiesto = false;
        
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            esBisiesto = true;
        }
        
        
        if (esBisiesto) {
            System.out.println(anio + " es un año bisiesto.");
        } else {
            System.out.println(anio + " no es un año bisiesto.");
        }
        
        
    }


}
