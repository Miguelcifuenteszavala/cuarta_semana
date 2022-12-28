package cuarta_semana;

import java.util.Scanner;

public class ejercicio3 {
    
public static void main(String[] args) {
        Scanner arje=new Scanner (System.in);
        System.out.println("Ingrese el radio: ");
        int radio=arje.nextInt();
        double longitud=radio*2*(3.1415);
        System.out.println("Longitud es de = "+longitud+" cm ");
    }    
}
