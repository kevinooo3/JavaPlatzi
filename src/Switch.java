import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        String ingresoFruta = "";

        switch(ingresoFruta){
            case "platano":
                System.out.println("Escogiste un platano");
                break;
            case "mango":
                System.out.println("Escogiste un mango");
                break;
            case "fresa":
                System.out.println("Escogiste un fresa");
                break;
            case "piña":
                System.out.println("Escogiste un piña");
                break;
            default:
                System.out.println("No hay fruta escogida");
                break;

        }


    }
}
