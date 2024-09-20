public class ControllerApplication {
    public static void main(String[] args) {

        double resultCircunferenciaValueProduct = ValueApplication.CircunferenciaValueProduct();
        double resultvolumeCircunferenciaProduct = ValueApplication.VolumeCircunferenciaProduct();


        System.out.println("Digite um valor do raio abaixo: ");
        String pi = "Value PI: "+ValueApplication.valuePi;
        String circunferencia = "Value Circunferencia: "+resultCircunferenciaValueProduct;
        String volume = "Value volume total: "+resultvolumeCircunferenciaProduct;
        System.out.println(pi);
        System.out.println(circunferencia);
        System.out.println(volume);

    }
}
