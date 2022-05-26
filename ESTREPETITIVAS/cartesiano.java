package ESTREPETITIVAS;

import java.util.Scanner;
/**
 * cartesiano
 */

public class cartesiano {
    public static void ejercicio1() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca numero de filas: ");
        int numFilas = teclado.nextInt();
        System.out.print("Por favor ingrese numero de fila : ");
        int yho= teclado.nextInt();
        teclado.close();
 
        System.out.println();
        for(int altura = 1; altura<=numFilas; altura++){

            for(int blan = 1; blan<=numFilas-altura; blan++){
                System.out.print(" ");
            }
 
            for(int cos=1; cos<=(altura*2)-1; cos++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static Scanner leerT=new Scanner(System.in);
    public static void ejercicioA() {
        System.out.println("Ingese Altura de la Letra:"); 
        int cantF=leerT.nextInt();
        System.out.println("Ingrese num fila para Linea:");
        int numFilLinea=leerT.nextInt();
        int medio=cantF+1;
         for (int f = 1; f <= cantF; f++) {
             for (int c = 1; c <= 2*cantF+1; c++) {
                 if (f==1 && medio==c) {
                     System.out.print("*");
                 }else if(c==medio-f && f>1){
                     System.out.print("*");
                 }else if(c==medio+f && f>1){
                     System.out.print("*");
                 }else if(f==numFilLinea && c>medio-f && c<=medio+f ){
                     System.out.print("*");
                 }else{
                     System.out.print(" ");
                 }
             }
             System.out.print("\n");
         }
         System.out.println("");
     }
     static Scanner lt=new Scanner(System.in);
    public static void main(String[] args) {
        ejercicioA();
    }
     }
