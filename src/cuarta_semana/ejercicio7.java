package cuarta_semana;

import java.util.Scanner;

public class ejercicio7 {
    
public static void main(String[]args){  
    Scanner teclado=new Scanner(System.in);
    int a;
    int b;
    System.out.print("Ingrese el primer numero : ");
    a=teclado.nextInt();
    System.out.print("ingrese el segundo numero : ");
    b=teclado.nextInt();
    if(a>b)
      System.out.print("el numero mayor es : "+a);
    else
      System.out.print("el numero mayor es : "+b);
    }
}
