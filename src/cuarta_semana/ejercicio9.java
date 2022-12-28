package cuarta_semana;

import java.util.Scanner;

public class ejercicio9 {
    
public static void main(String[]args){
        Scanner teclado=new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.print("ingrese el primer numero : ");
        a=teclado.nextInt();
        System.out.print("ingrese el sugundo numero : ");
        b=teclado.nextInt();
        if(a>b){
            System.out.print("el orden correcto es : "+a+"->"+b);
        }
        else
            System.out.print("el orden de mayor a menor es : "+b+" -> "+a);
    }
}

