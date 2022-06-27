package pe.edu.upeu.arrays;

public class Matricesejemplos {
    public void matricesbasicos() {
        int notas[][]; // declarar una variable
        int[][] notas;
        notas = new int[2][2]; // tamaño dimencion
        notas[0][0]= 20;
        notas[0][1]=18;
        notas[1][0]=19;
        notas[1][1]=20;
        System.out.print(notas [1][1]);
        System.out.print("cantidad de filas :"+notas.length);
         System.out.print("cantidad de columnas:"+notas[0].length);
        
            System.out.println("");
        }
    
    public void matricesX(){
        int notas[][]={
            {20,18},
            {19,20}
        };
    notas[1][1]=15;
    for (int f=0;f < notas.length;f++){
        for (int c=0; c < notas[0].length; c++){
        System.out.print(notas[f][c]+"\t");
        }
         System.out.println("");
    }
    }

    public void sumamatrices(){
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];

        System.out.println("Valores Matriz A");
        for (int i=0; i<a.length; i++) {
            for (int j=0; j<a[0].length; j++) {
                System.out.print("Da elemento " + (i+1)+ " , " + (j+1) + " : ");
               
    }
}
    }
    

    public static void main(String[] args) {
        new Matricesejemplos().matricesX();
    }
}
