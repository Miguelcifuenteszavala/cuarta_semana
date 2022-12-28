	package cuarta_semana;
	import java.util.Scanner;
	public class ejercicio1 {
	    public static void main(String[] args) {
	        //coeficientes ax math  ax2+ bx + c = 0
	        Scanner arje=new Scanner (System.in);
	       double d,a,b,c,x1,x2;
	       System.out.println("Ingrese el primer coeficiente A: ");
	        a=arje.nextInt();
	        System.out.println("Ingrese el segundo coeficiente B: ");
	        b=arje.nextInt();
	        System.out.println("Ingrese el tercer coeficiente C: ");
	        c=arje.nextInt();	     
	       d=((b*b)-4*a*c);
	       System.out.println("Resultado de la operacion: "+d);
	        if(d<0){
	           System.out.println("no tiene solución real");
	       }else{
	           x1=(-b+Math.sqrt(d)/(2*a));
	           x2=(-b-Math.sqrt(d)/(2*a));
	           System.out.println("Resultado: "+x1);
	           System.out.println("Resultado: "+x2);
	       }
	        }}
