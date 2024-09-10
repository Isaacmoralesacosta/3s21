import java.util.Scanner;
public class pilass {
    
   static int tope=0;
   static int t=0;
   static int opt=0;
    
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("tamaño de pila");
        t=sc.nextInt();     
        int [] pila = new int[t];
        do{
            System.out.println("a- add\n"
                    + "2-show\n"
                    + "3-eliminar\n"
                    + "4-salir\n");
            opt=sc.nextInt();
            
            switch(opt){
                
                

                case 1:
                    if(tope<t) {
                        System.out.println("agrega el valor (solo numeros): ");
                    pila[tope] = sc.nextInt();
                    tope++; 
                } else {
                    System.out.println("la pila esta llena");
                }
                    break;

                


                case 2:
                    if(tope==0){
                        System.out.println("pila vacia");
                    } else {
                        for (int i = tope-1; i >=0; i--) {
                        System.out.println(pila[i]);
                    }
                    }                
                    break;
                



                case 3:
                    if(tope>0){
                         tope--;
                        System.out.println("numero eliminado");
                    }
                   
                    break;
            }
        }while(opt!=4);
        }
    }
