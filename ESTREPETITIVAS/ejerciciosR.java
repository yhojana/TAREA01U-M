package ESTREPETITIVAS;

import java.util.Scanner;

/**
 * ejerciciosR
 */
public class ejerciciosR {

    public static void imprimirWhileN1_20() {
        int numInit=1;
        while(numInit<=20){
            System.out.println(numInit);
            numInit=numInit+1;
        
        }   
    }
    public static void imprimirDowhileN1_20() {
        int numInit=1;
        do {

            System.out.println(numInit);
            numInit++;
         } while (numInit<=20);
        }

    public static void imprimirForN1_20() {
        for (int numInit =1; numInit<= 20; numInit++){
            System.out.print(numInit);
        } 
    }
    public static void nombreinvertida(){
        Scanner lt=new Scanner(System.in);
        System.out.println("ingrese su nombre:");
        String nombre=lt.next();
        for (int i =nombre.length()-1;i >=0; i--){
            System.out.println(nombre.charAt(i));
        }
    }
       
    public static void main(String[] args) {

        /*System.out.println("imprime while:"); imprimirWhileN1_20();  
        System.out.println("imprime dowhile:"); imprimirDowhileN1_20(); 
        System.out.print("imprime for:"); imprimirForN1_20();*/

        nombreinvertida();
    }
}

    
    
