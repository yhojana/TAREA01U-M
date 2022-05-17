package ESTREPETITIVAS;

import java.util.Scanner;

/**
 * ejercicio2
 */
public class ejercicio2{
    static Scanner lt=new Scanner(System.in);
    public static void impuestovehiculo13(){
        //definir variables
        String categoriav="";
        int cantidad=0;
        double costov=0, impuestouni=0,impuestototal=0, totalimpuestov=0;
        //datos de entrada y proceso y salida
        for (int i = 0; i <3; i++){
            System.out.print("ingrse la cantidad de vehiculos de categoria"+ (i+1)+":");
            cantidad=lt.nextInt();
            System.out.println("ingrese el precio de la categoria" +(i+1)+":");
            costov=lt.nextDouble();
            if(i==0){
                impuestouni=costov*0.10;
            }else if (i==1){
                impuestouni=costov*0.07;
            }else {
                impuestouni=costov*0.05;
            }
            impuestototal=impuestouni*cantidad;
            System.out.println("impuesto de categoria"+(i+1)+"es:"+impuestouni);
            System.out.println("impuesto total de categoria"+(i+1)+"es:"+impuestototal);
            totalimpuestov=totalimpuestov+impuestototal;
            }
        System.out.println("impuesto total  de vehiculos :"+impuestototal);
        }
    
    public static void main(String[] args) {
        impuestovehiculo13();
    }
}

