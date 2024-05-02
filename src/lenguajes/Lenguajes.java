package lenguajes;

import java.util.Scanner;

public class Lenguajes {

    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);

        int n;

        System.out.println("ingrese el numero");
        n = text.nextInt();

        Numero numer = new Numero();
        
        numer.setNum(n);
        
        numer.suma();
    }

}
