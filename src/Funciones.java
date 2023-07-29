public class Funciones {
    public static void main(String[] args) {
        int estadoLuz = 1; // arrancamos con la luz encendida.
        apagarTodo(estadoLuz); // aqui se cambia de estado a false
        System.out.println(estadoLuz); // debe imprimir false
        System.out.println("\n");
        System.out.println(mensajeFelicidad());

    }
    // funcion que no retorna nada por eso void
    public static void apagarTodo(int x){
        x++ ;
        System.out.println(x);
    }
    // funcion que retorna un valor , debemos especificar que tipo de valor retornara despues de static
    public static String mensajeFelicidad(){
        return "Estos son unos csm";
    }
}
