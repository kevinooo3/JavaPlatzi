public class For {
    public static void main(String[] args) {
        // for simple
        for (int i = 0; i <10 ; i++) {
            if(i==7){
                continue; // continue hace q la iteracion se redirija a la condicional y deje de ejecutar las sentencias que seguian abajo.
                //break; // break por otra parte rompe todo y termina inmediatamente la ejecucion .
            }
            System.out.println("numero: "+i);
        }

        // FOREACH
        String[] nombres = new String[5];
        nombres[0]=  "kevin";
        nombres[1]=  "Cristhian";
        nombres[2]=  "Maxwell";
        nombres[3]=  "Di Maria";
        nombres[4]=  "Messi";
        for (String nombre:nombres) {
            System.out.println(" Hola "+nombre+ " como estas raaa. \n");
        }


    }
}
