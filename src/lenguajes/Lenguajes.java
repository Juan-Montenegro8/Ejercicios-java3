package lenguajes;

import java.util.Scanner;

public class Lenguajes {

    public static void main(String[] args) {
        Scanner textoScanner = new Scanner(System.in);

        int numero;

        System.out.println("ingrese el numero");
        numero = textoScanner.nextInt();

        Numero numer = new Numero();
        
        numer.setNum(numero);
        
        numer.suma();
    }

}
