package lenguajes;

import java.util.Scanner;

public class Lenguajes {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int n;

        System.out.println("ingrese el numero");
        n = t.nextInt();

        Numero numer = new Numero();
        
        numer.setNum(n);
        
        numer.suma();
    }

}
