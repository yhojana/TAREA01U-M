package ESTREPETITIVAS;

import java.util.Scanner;
/**
 * ejerciciosR
 */
public class ejercicio3{
    public static void ejercicio1() {
            //Definir variables
            int contador=1;
            double numeroX;
            double sumaNumeros=0;
            //Proceso Datos de entrada
            while (contador<=10) {
                System.out.print("Ingrese el valor de "+contador+": ");
                numeroX=lt.nextDouble();
                sumaNumeros=sumaNumeros+numeroX;
                contador++;
                System.out.println("");
            }
            //Datos de Salida
            System.out.println("La suma de los "+(contador-1)+" valores introducidos es: "+ sumaNumeros);
    } 
    public static void ejercicio2() {
            //Definir Variables
            int cantfocoV=0, cantfocoB=0, cantfocoR=0;
            String colorF="";
            String continuar="S";
            //Datos de entrada y proceso
            while (continuar.equals("S")) {
        System.out.println("Ingrese el color de Foco:\nV=Verde\nB=Blanco\nR-Rojo");
        colorF=lt.next().toUpperCase();
        if (colorF.charAt(0)=='V') {
            cantfocoV++;
        }else if (colorF.charAt(0)=='B') {
            cantfocoB++;
        } else if (colorF.charAt(0)=='R') {
            cantfocoR++;
        }else{
            System.err.println("No es correcto el color de foco");
        }

        System.out.println("Tiene mas focos a evaluar?:\nS=Si\tN=No");
        continuar=lt.next().toUpperCase().equals("S")?"S":"N";
    }
            //Datos de salida
            System.out.println("La cantidad de focos de color Verde es: "+cantfocoV);
            System.out.println("La cantidad de focos de color Blanco es:" +cantfocoB);
            System.out.println("La cantidad de focos de color Rojo es: "+cantfocoR);
            System.out.println("La cantidad Total de focos son: "+(cantfocoV+cantfocoB+cantfocoR));
    }
    public static void ejercicio4() {
            //Definir Variables
            int cantNumMayorcero=0, cantNumMenorIgualCero=0;
            double numN=0;
            String continuar="S";
            //Datos de entrada y proceso
            while (continuar.equals("S")) {
                System.out.println("Ingrese un numero:");
                numN=lt.nextDouble();
                if (numN<=0) {
                    cantNumMenorIgualCero++;
                }else{
                    cantNumMayorcero++;
                }
                System.out.println("Desea ingresar mas numeros?:\nS=Si\tN=No");
                continuar=lt.next().toUpperCase().equals("S")?"S":"N";
            }  
            //Datos de salida
            System.out.println("Cantidad de numeros Mayores de cero: "+cantNumMayorcero);
            System.out.println("Cantidad de numeros menores e iguales a cero: "+cantNumMenorIgualCero);
            System.out.println("Total de numeros introducidos: "+(cantNumMayorcero+cantNumMenorIgualCero));
    
}
    static Scanner lt=new Scanner(System.in);
    public static void main(String[] args) {
        ejercicio1();
    }

}
     

