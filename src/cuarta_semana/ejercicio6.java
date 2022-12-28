package cuarta_semana;

import java.util.Scanner;

public class ejercicio6 {
    
public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Primer Número: ");
       int num1 = sc.nextInt();
       System.out.print("Segundo número: ");
       int num2 = sc.nextInt();
       int x = num1 % num2;
        if (x==0) {
            System.out.println("El resultado es múltiplo");
            
        }
        else {
            System.out.println("El resutado no es múltiplo");
        }
}
}
