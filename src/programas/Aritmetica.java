package programas;
/**
 *
 * @author Arnold Paturri
 */
import java.util.Scanner;
public class Aritmetica {
    public static void main(String[] args){
        //variables
        double num1,num2,suma,promedio;
        Scanner lectura=new Scanner (System.in);
        //entrada
        System.out.print("Ingresar numero 1: ");
        num1=lectura.nextDouble();
        System.out.print("Ingresar numero 2: ");
        num2=lectura.nextDouble();
        //operacion
        suma=num1+num2;
        promedio=suma/2;
        
       //salida
       System.out.println("Ejecutando muchas salidas uwu");
       System.out.println("La suma es "+suma);
       System.out.println("El promedio es "+promedio);
       
    }
}
