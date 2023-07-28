public class Operadores {
    public static void main(String[] args) {
        int j = 3;
        j++;
        System.out.println(j); // imprime 4
        j--;
        System.out.println(j); // imprime 3
        // valor actual j
        System.out.println("valor actual " + j);
        // sufijo
        System.out.println("sufijo resta "+ (100+ j--)); // imprime el ultimo valor de j , no le importa si poner mas o menos cuando usas como variable.
        System.out.println("sufijo summa "+ (100+ j++)); // imprime el ultimo valor de j , no le importa si poner mas o menos cuando usas como variable.
        // prefijo
        System.out.println("prefijo summa "+ (100+ ++j));


    }
}
