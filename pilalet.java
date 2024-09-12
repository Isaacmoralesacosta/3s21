import java.util.Scanner;

public class pilalet {

    static int tope = 0;
    static int t = 27;
    static char[] pila = new char[27]; // que sea de tamaño 27

    //para gregar letras 
    public static void agregar(char let) {
        pila[tope] = let;
        tope++;
        System.out.println("Dato agregado: " + let);
    }

    // para que ponga letras aleatorias
    public static void llenar() {
        for (int i = tope; i < 27; i++) {
            char b = (char) (Math.random() * 26 + 'a');
            pila[i] = b;
            tope++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char opt; //para hacer el menu

        do {
            System.out.println("\n1- Aggletra\n"
            + "2- Mostrar pila\n"
            + "3- Eliminar letra\n"
            + "4- Salir");
            opt = sc.next().charAt(0); 

            if (opt == '1') { // Agregar una letra
                if (tope < t) {
                    System.out.println("Ingresa una letra minúscula: ");
                    char letra = sc.next().charAt(0); 

                    if (letra >= 'a' && letra <= 'z') { // que solo sirva con letras minusculas
                        agregar(letra); // agg letra
                    } else {
                        System.out.println("Solo se aceptan letras minúsculas.");
                    }
                } else {
                    System.out.println("La pila está llena.");
                }
            } else if (opt == '2') { 
                if (tope == 0) {
                    System.out.println("La pila está vacía.");
                } else {
                    System.out.println("Elementos en la pila:");
                    for (int i = tope - 1; i >= 0; i--) {
                        System.out.println(pila[i]);
                    }
                }
            } else if (opt == '3') { 
                if (tope > 0) {
                    tope--; 
                    System.out.println("Letra eliminada.");
                } else {
                    System.out.println("La pila está vacía.");
                }
            } else if (opt != '4') { 
                System.out.println("Opción no válida.");
            }
        } while (opt != '4'); //salir del ciclo

        System.out.println("Salir del ciclo");
    }
}
