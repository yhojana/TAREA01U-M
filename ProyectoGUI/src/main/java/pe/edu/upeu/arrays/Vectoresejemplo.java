package pe.edu.upeu.arrays;

import pe.edu.upeu.modelo.Persona;

/**
 * 
 * Vectoresejemplos
 */
public class Vectoresejemplo {
    public void vectoresX() {
        int edades[] = new int[10];
        edades = new int[12];
        edades[0] = 20;
        edades[1] = 18;
        edades[11] = 30;
        System.out.println("edades");
        System.out.println("indice 0:" + edades[0]);
        System.out.println("indice 11:" + edades[11]);
        // FORMA DOS
        System.out.println("forma dos");
        int edadesX[] = { 20, 18, 30, 40, 16 };
        System.out.println(edadesX.length);
        System.out.println("indice 0:" + edadesX[0]);
        System.out.println("indice 4:" + edadesX[4]);
    }

    public void vectoresobjetos() {
        Persona[] p = new Persona[27];
        p[0]=new Persona(codigo:"200410564", nombres: "david" , asistencia:false);
        p[0]=new Persona(codigo:"200419564", nombres :"jana" , asistencia:false);
        
        System.out.println(p[26].nombres);


        Persona[] pp={
        new Persona(codigo:"202211715", nombres:"yhojana uscamayta mamani", asistencia: true)
        new Persona(codigo:"202211715", nombres:"medry elizabeth flores llanque", asistencia: true)}
        }
    }

    public static void main(String[] args) {
        Vectoresejemplo objx = new Vectoresejemplo();
        objx.vectoresX();
    }
