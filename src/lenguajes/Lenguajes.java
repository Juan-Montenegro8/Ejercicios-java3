package lenguajes;

import java.util.Scanner;

public class Lenguajes {

    public static void main(String[] args) {
        try (Scanner textoScanner = new Scanner(System.in)) {
            int numero;

            System.out.println("ingrese el numero");
            numero = textoScanner.nextInt();

            Numero numer = new Numero();
        
            numer.setNum(numero);
        
            numer.suma();
        } catch (Exception e) {
            System.out.println("Ocurrio un error: "+e.getMessage());
        }
    }

}
