package pe.edu.upeu.ymum;

import java.util.Scanner;

import pe.edu.upeu.ymum.examen.ResolucionExamen;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        Scanner leer=new Scanner(System.in);
        int n;
        System.out.println("introduzca el numero del algoritmo:");
        n=leer.nextInt();
        switch (n) {
            case 2: new ResolucionExamen().examen02YMUM(); break;
            case 3: new ResolucionExamen().examen03YMUM(); break;
            case 4: new ResolucionExamen().examen04YMUM(); break;
            case 5: new ResolucionExamen().examen05YMUM(); break;
            
            default: System.err.println("dicha  opcion no existe :("); break;
        }
       
    }
}
