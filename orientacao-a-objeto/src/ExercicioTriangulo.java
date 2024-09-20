import java.util.Scanner;

public class ExercicioTriangulo {

    Scanner sc = new Scanner(System.in);

    public double baseRet = sc.nextDouble();
    public double alturaRet = sc.nextDouble();

    public  double areaRetangulo(){
      double result = baseRet * alturaRet;
      return result;
    }

    public double Diagonaisretangulo(){

        double valueBase = Math.sqrt(baseRet);
        double valueAltura = Math.sqrt(alturaRet);
        double resultend = valueAltura * valueBase;
        return resultend;
    }


    public double CalcularPerimetroRetangulo(){

        double valueUm = baseRet + baseRet + alturaRet + alturaRet;
        return valueUm;

    }

}
