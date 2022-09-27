
package conversiondetipo;

import java.util.Scanner;

/**
 *
 * @author jonat
 */
public class ConversionDeTipo {

    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("Dame un número: ");
        String txt = teclado.nextLine();
        
        System.out.println("El numero se guardo como una cadena de texto: '" + txt + "'");
        System.out.print("Ahora se transforma la cadena a un int.\nPulse ENTER para continuar...");
        teclado.nextLine();
        
        int num = Integer.parseInt(txt);
        System.out.print("\nLa cadena ahora es un int \nPara comprobar dame otro numero para sumar ambos: ");
        int num2 = teclado.nextInt();
        System.out.println("La suma entre " + num + " y " + num2 + " es igual a " + (num+num2));
    }
    
}
