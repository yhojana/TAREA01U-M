package subprogramas;
//mport subprogramas.aritmetica;
public class clasegeneral {
    public static void main(String[] args) {
        aritmetica yho=new aritmetica();
        int resultado=yho.sumar(10, 5);
        System.out.println(resultado);

        aritmetica obj=new aritmetica (4,3);
        resultado=obj.multiplicar();
        System.out.println("multiplicacion: "+resultado);
    }
    
}
