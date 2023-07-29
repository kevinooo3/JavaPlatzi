public class Condicionales {
    public static void main(String[] args) {
        // Ejercicio de costo de la play 3
            int costoPlay = 0 ;

            if(costoPlay > 1000){
                System.out.println("nicagando la compro esta muy caro");
            }
            else if( 500 < costoPlay && costoPlay<=1000){
                System.out.println("Se puede comprar pero esperemos a que baje");
            }
            else if( 0 < costoPlay || costoPlay <=500){
                System.out.println("Podemos comprar la play , es ahora o nunca papu");
            }
            else {
                System.out.println("no hay precio de la play, no existe play");
            }
        // Existe un nuevo metodo
            System.out.println();
            String variable1 = ((2+2)==4)?"eres inteligente":"eres tontito";
            System.out.println("nueva forma de condicion: "+variable1);
    }
}
