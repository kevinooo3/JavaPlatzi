public class Castings {
    public static void main(String[] args) {
        int x =5;
        int y= 2;
        double resultadoExacto = (double)x/y;
        double resultadoExactoSinCast = x/y;
        System.out.println(resultadoExacto);
        System.out.println(resultadoExactoSinCast);
        // el casting en este caso sirve para la precision.
    }
}
