package TAREAYMUM;

import java.util.Scanner;
public class App {
    public static void main( String[] args ){
        Scanner le=new Scanner(System.in);
        int n;
        System.out.println("introduzca el numero de la MATRIZ:");
        n=le.nextInt();
        switch (n) {
            case 1: new tareaymum().tareaymum05(); break;
            case 2: new tareaymum().tareaymum06(); break;
            case 3: new tareaymum().tareaymum07(); break;
            case 4: new tareaymum().tareaymum09(); break;
            case 5: new tareaymum().tareaymum010(); break;
            case 6: new tareaymum().tareaymum011(); break;
            case 7: new tareaymum().tareaymum012(); break;
            case 8: new tareaymum().tareaymum018(); break;
            case 9: new tareaymum().tareaymum020(); break;
            case 10: new tareaymum().tareaymum022(); break;
            case 11: new tareaymum().tareaymum023(); break;
            case 12: new tareaymum().tareaymum024(); break;
            case 13: new tareaymum().tareaymum025(); break;
            case 14: new tareaymum().tareaymum026(); break;
            case 15: new tareaymum().tareaymum027(); break;
            case 16: new tareaymum().tareaymum028(); break;
            case 17: new tareaymum().tareaymum029(); break;
            case 18: new tareaymum().tareaymum030(); break;
            case 19: new tareaymum().tareaymum031(); break;
            case 20: new tareaymum().tareaymum032(); break;
            case 21: new tareaymum().tareaymum033(); break;
            case 22: new tareaymum().tareaymum034(); break;
            case 23: new tareaymum().tareaymum035(); break;
            case 24: new tareaymum().tareaymum036(); break;

            default: System.err.println("dicha  opcion no existe :("); break;
        }
       
    }
}
