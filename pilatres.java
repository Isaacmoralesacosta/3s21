import java.util.Scanner;

public class pilatres {
    static int tam = 8; 
    static char[] pila = new char[tam]; // Pila de tamaño 8
    static char[] especiales = {'*', '+', '-', '/', '@', '?', '!'}; // vectores especiales
    static int tope = -1; // Índice del último elemento en la pila

    
    public static void llenarPila() {
        if (tope == tam - 1) { 
            System.out.println("La pila ya está llena.");
            return;
        }

        
        tope = tam - 1;
        //colocar en la primer pocicion lettra mayuscula
        
        pila[0] = (char) (Math.random() * 26 + 'A');

        // en las pociciones 1,2,3 letras minusculas
        for (int i = 1; i <= 3; i++) {
            pila[i] = (char) (Math.random() * 26 + 'a');
        }

        // Posiciones 4, 5 son vectores  especiales
        for (int i = 4; i <= 5; i++) {
            int indiceEspecial = (int) (Math.random() * especiales.length);
            pila[i] = especiales[indiceEspecial];
        }

        // en la pocicion  6, 7 con números aleatorios
        for (int i = 6; i <= 7; i++) {
            pila[i] = (char) (Math.random() * 10 + '0');
        }

        System.out.println("Pila llenada");
    }

    
    public static void mostrar() {
        if (tope == -1) {
            System.out.println("La pila está vacía");
        } else {
            System.out.print("Elementos en la pila: ");
            for (int i = 0; i <= tope; i++) {
                System.out.print(pila[i] + " "); 
            }
            System.out.println(); 
        }
    }

    // eliminar los datos de la pila
    public static void eliminar() {
        if (tope == -1) {
            System.out.println("La pila ya está vacía, no se puede eliminar más.");
        } else {
            pila[tope] = '\u0000'; // 
            tope--; 
            System.out.println("Último dato eliminado.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char opt; // crear menu

        do {
            System.out.println("\n1- llenar pila\n"
            + "2- Mostrar pila\n"
            + "3- Eliminar último dato\n"
            );
            opt = sc.next().charAt(0);

            switch (opt) {
                case '1': // llenar pila
                    llenarPila();
                    break;
                case '2': // Mostrar pila
                    mostrar();
                    break;
                case '3': // Eliminar el  último dato
                    eliminar();
                    break;
                case '4': // Salir
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opt != '4');

        sc.close();
    }
}
