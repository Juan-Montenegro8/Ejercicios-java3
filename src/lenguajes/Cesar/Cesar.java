package lenguajes.Cesar;

import java.util.Scanner;

public class Cesar {

    public static void main(String[] args) {
        
        try (Scanner textoScanner = new Scanner(System.in)) {
            System.out.print("Ingresa el mensaje a cifrar: ");
            String mensaje = textoScanner.nextLine();
        
            System.out.print("Ingresa la cantidad de desplazamiento: ");
            int desplazamiento = textoScanner.nextInt();
        
            String mensajeCifrado = cifrar(mensaje, desplazamiento);
            System.out.println("El mensaje cifrado es: " + mensajeCifrado);    
        } catch (Exception e) {
            System.out.println("Ocurrio un error: "+e.getMessage());
        }
    }
    public static String cifrar(String mensaje, int desplazamiento) {
        String resultado = "";
        int longitudAlfabeto = 26;
        for (int i = 0; i < mensaje.length(); i++) {
            char letra = mensaje.charAt(i);
            if (Character.isLetter(letra)) {
                int posicion = (int) letra - 65; 
                posicion = (posicion + desplazamiento) % longitudAlfabeto;
                if (posicion < 0) {
                    posicion += longitudAlfabeto;
                }
                letra = (char) (posicion + 65);
            }
            resultado += letra;
        }
        return resultado;
    }
}
 