import java.util.Scanner;

public class ControllerDolar {
 static Scanner sc = new Scanner(System.in);

    public static double ValueDolar = sc.nextDouble();
    public static double ValueUserComprar = sc.nextDouble();

    public static double ResultValueDolar(){
        return ValueDolar * ValueUserComprar;

    }
   public  static double resultMostrar(){
       double resultValueMostrar = ResultValueDolar();
       System.out.println("O valor do Dólar é de: R$ "+ ValueDolar);
       System.out.println("A quantidade de moedas em dólar é igual a: R$ "+ ValueUserComprar);
       System.out.println("O cliente pagará o total de: R$ "+ resultValueMostrar);
       return resultValueMostrar;
   }

}
