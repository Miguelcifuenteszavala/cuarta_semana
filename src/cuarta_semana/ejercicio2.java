package cuarta_semana;

import java.util.Scanner;

public class ejercicio2 {
    
public static void main(String[] args) {
        double area, radio;
        Scanner num = new Scanner(System.in);
        try {
            System.out.print("Introduce el radio de un Círculo: ");
            radio = num.nextDouble();
            area = Math.PI*(radio*radio);
            System.out.println("El área del Círculo es: " + area);
        } catch (Exception e) {
        }        
    }
}
