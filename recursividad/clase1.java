package recursividad
/**
 * ejemplos
 */
public class clase1{
    
    public static  int factorial(int n){
        if (n>1){
            return factorial(n-1)*n;
        }
        return 1;
    }
    public static  int fibonaci(int n){
        if (n>1){
            return fibonaci(n-1)+fibonaci(n-2);
        }
        return n;


}

public static void main(String[]args) {
    System.out.print(factorial(n:10));
   
}

}
