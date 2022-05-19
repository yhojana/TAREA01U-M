package ESTREPETITIVAS;
/**
 *ejerciciovarios
 */

import java.util.Scanner;

public class ejerciciovarios{
    static Scanner leerT=new Scanner (System.in);

    public static long factorialn(int numero) {
        long resultado=1;
        if (numero>1){
            for (int i=1; i <= numero; i++){
                resultado=resultado*i;
            }
        }
        return resultado;
    }

    public static void main(String[]args) {
        System.out.println("INGRESE UN NUMERO:");
        int num=leerT.nextInt();
        for (int i=0; i <=num; i++){
        System.out.println("factorial de "+ i+" es:"+factorialn (i));
            
    }
    }
}