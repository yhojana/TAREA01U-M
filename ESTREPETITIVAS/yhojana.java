package ESTREPETITIVAS;

import java.util.Scanner;

/**
 *yhojana
 */
public class yhojana{
    static Scanner lt=new Scanner(System.in);
      public static void ejercicio49() {
        //Definir datos
        int numero;
        int salones;
        int edad;
        int suma=0;
        int total=0,alumnos=0;
        //Datos de entrada
        System.out.println("Ingrese la cantidad de salones: ");
        salones=lt.nextInt();
        while (salones>0) {
            System.out.println("Ingrese la cantidad de alumnos: ");
            numero=lt.nextInt();
            for (int i = 0; i < numero; i++) {
                System.out.println("Ingrese la edad del alumno: "+(i+1));
                edad=lt.nextInt(); 
                suma=suma+edad;
            }
            System.out.println("El promedio del salon "+salones+" es: "+(suma/numero)+" años");
            alumnos = alumnos + numero;
            total = total + suma;
	        salones = salones - 1;
            suma=suma*0;
        }
        System.out.println("El promedio de toda la escuela es: "+(total/alumnos)+" años");
    }


    public static void main(String[] args) {
        ejercicio49();
    }
}
