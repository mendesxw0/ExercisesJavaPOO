import java.util.Scanner;

public class ValueApplication {
  static   Scanner sc = new Scanner(System.in);

    public static double valueUserRadius = sc.nextDouble();
    public static double valuePi = 3.14;

    public static double CircunferenciaValueProduct(){
        double resultValue = 2 * valuePi * valueUserRadius;
        return resultValue;
    }

    public static double VolumeCircunferenciaProduct(){
        double resultvalueVolume = 4 * valuePi * (valueUserRadius * valueUserRadius * valueUserRadius) / 3;
        return resultvalueVolume;
    }
}
