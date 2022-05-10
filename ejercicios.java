import java.util.Scanner;

public class ejercicios {

     public void profesor(){
        System.out.println("enseñar");   
    }

    public void ALUMNO() {
            System.out.println("aprender");
        
    }
    public static void MAQUINAPC() {
        System.out.println("procesar informacion");
        
    }
    public static void PROYECTOR() {
        System.out.println("transmite informacion");
        
    }
    
 public static void main (String[] args){

    ejercicios obj=new ejercicios();
    Scanner it=new Scanner(System.in);
    System.out.println("ingrese el numero de algoritmo:\n1=profesor\n2=alumno"+"\n3=maquinapc\n4=proyector");
    int opcionMet=it.nextInt();
    switch (opcionMet) {
        case 1: obj.profesor();break;   
        case 2:obj.ALUMNO();break;
        case 3:obj.MAQUINAPC();break;
        case 4:obj.PROYECTOR();break;
         default:System.err.println("esa opcion no existe");break;
    }
      }

}
