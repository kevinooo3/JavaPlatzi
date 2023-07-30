public class Funciones {
    public static void main(String[] args) {
        int estadoLuz = 1; // arrancamos con la luz encendida.
        apagarTodo(estadoLuz); // aqui se cambia de estado a false
        System.out.println(estadoLuz); // debe imprimir false
        System.out.println("\n");
        System.out.println(mensajeFelicidad());

    }
  //EJEMPLO DE COMO USAR UN JAVADOC
    // Si es la primera vez para javadoc debe activarlo en File-settings-editor-general-code completion-y activar show the documentation popup
    /**
     * Descripcion : Funcion que apaga y setea a false todo lo q le pases
     * @param x valor entero para pasar.
     * @retyrb no retorna ni pincho.
        * */
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
