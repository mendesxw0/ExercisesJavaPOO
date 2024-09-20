public class ExercicioTrianguloMain {
    public static void main(String[] args) {

        ExercicioTriangulo trianguloMain = new ExercicioTriangulo();

         double areaRetangulo =  trianguloMain.areaRetangulo();
        System.out.println("a base do retangulo é: "+trianguloMain.baseRet);
        System.out.println("a altura do retangulo é: "+trianguloMain.alturaRet);
        System.out.println("O resultado final é: "+areaRetangulo);

         double diagonaisRetangulo = trianguloMain.Diagonaisretangulo();
         System.out.println("O valor de a é: "+trianguloMain.baseRet);
         System.out.println("O valor de b é: "+trianguloMain.alturaRet);
        System.out.println("O resultado final é: "+diagonaisRetangulo);

         double PerimetroRetangulo = trianguloMain.CalcularPerimetroRetangulo();

        System.out.println("O valor de a é: "+trianguloMain.baseRet);
        System.out.println("O valor de b é: "+trianguloMain.alturaRet);
        System.out.println("O valor do perimetro é: "+PerimetroRetangulo);

    }
}
