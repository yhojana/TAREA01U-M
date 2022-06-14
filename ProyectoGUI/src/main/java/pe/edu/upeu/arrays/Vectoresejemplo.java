package pe.edu.upeu.arrays;

/**
 * 
 *Vectoresejemplos
 */
public class Vectoresejemplo {
    public void vectoresX(){
        int edades[]=new int [10];
        edades=new int [12];
        edades[0]=20;
        edades[1]=18;
        edades[11]=30;
        System.out.println("edades");
        System.out.println("indice 0:" +edades[0]);
        System.out.println("indice 11:"+edades[11]);
        //FORMA DOS
        System.out.println("forma dos");
        int edadesX[]={20,18,30,40,16};
        System.out.println(edadesX.length);
        System.out.println("indice 0:"+edadesX[0]);
        System.out.println("indice 4:"+edadesX[4]);
    }



public static void main(String[]args) {
    Vectoresejemplo objx=new Vectoresejemplo();
    objx.vectoresX();
}
}