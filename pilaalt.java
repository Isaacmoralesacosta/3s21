// es una lila aleatoria de 8 digitos los cuales el primer digito sea mayuscula 
//los siguientes tres sean letras minusculas 
//en la posicion 6,7 sea de forma aleatoria '*', '+', '-', '/', '@', '?', '!'
//  y en las ultimas pocisiones sean numeros 
//mostramos el menu y mandamos a llamar las cadenas 
import java.util.Scanner;

public class pilass {
    static int tam = 8; 
    static char[] pila = new char[tam]; // Pila de tamaño 8
    static char[] especiales = {'*', '+', '-', '/', '@', '?', '!'}; // los vectores definidos

    // Generar elementos aleatorios según las posiciones
    public static void generarPila() {
        // Primer letra en mayuscula
        pila[0] = (char) (Math.random() * 26 + 'A');
        
        //para letras 1,2,3 minusculas 
        for (int i = 1; i <= 3; i++) {
            pila[i] = (char) (Math.random() * 26 + 'a');
        }

        // Posiciones 4, 5 vectores definidos
        for (int i = 4; i <= 5; i++) {
            int Especial = (int) (Math.random() * especiales.length);
            pila[i] = especiales[indiceEspecial];
        }

        // Posiciones 6, 7 números aleatorios
        for (int i = 6; i <= 7; i++) {
            pila[i] = (char) (Math.random() * 10 + '0');
        }
        
        System.out.println("Pila generada con éxito.");
    }

    // Mostrar la pila
    public static void mostrar() {
        if (pila[0] == '\u0000') {
            System.out.println("La pila está vacía.");
        } else {
            System.out.println("Elementos en la pila:");
            for (int i = 0; i < tam; i++) {
                System.out.println(pila[i]);
            }
        }
    }

    // Eliminar elementos de la pila
    public static void eliminar() {
        if (pila[0] != '\u0000') {
            pila[tam - 1] = '\u0000'; // Reiniciar el último valor
            System.out.println("Último dato eliminado.");
        } else {
            System.out.println("La pila está vacía.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char opt; // Para el menú

        do {
            System.out.println("\n1- Generar pila\n"
            + "2- Mostrar pila\n"
            + "3- Eliminar último dato\n"
            + "4- Salir");
            opt = sc.next().charAt(0);

            switch (opt) {
                case '1': // Generar pila
                    generarPila();
                    break;
                case '2': // Mostrar pila
                    mostrar();
                    break;
                case '3': // Eliminar último dato
                    eliminar();
                    break;
                case '4': // Salir
                    System.out.println("Salir del ciclo.");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opt != '4');

        sc.close();
    }
}