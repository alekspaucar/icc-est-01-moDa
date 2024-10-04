import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

            public static int leerEnteroValido(Scanner scanner,
                                               String mensaje,
                                               boolean permitirNegativos) {
                int numero;
                do {
                    System.out.print(mensaje);
                    while (!scanner.hasNextInt()) {
                        System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
                        System.out.print(mensaje);
                        scanner.next(); // Limpiar la entrada incorrecta
                    }
                    numero = scanner.nextInt();
        
                    // Si no se permiten negativos y el número es negativo, lo solicitamos de nuevo
                    if (!permitirNegativos && numero < 0) {
                        System.out.println("No se permiten números negativos. Por favor, ingrese un número positivo.");
                    }
        
                } while (!permitirNegativos && numero < 0); // Repetir si los negativos no están permitidos y el número es negativo
        
                return numero;
            }
        }



     /*    metodoOrdenado mO = new metodoOrdenado();
        int[] arreglo = {5, 8, 9, 3, 0}; 
        mO.sortBubbleAva(arreglo);
        mO.printArreglo(arreglo);
        
       Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del arreglo");

        int tamanio = 0; 
        */



        /*Scanner scanner = new Scanner(System.in);
        int tamanio =0;
        do {
            System.out.println("Ingrese el tamaño que sea entero positivo");
            while (!scanner.hasNextInt()) {
                System.out.println("Te pedí un número entero válido");
                System.out.println("Ingrese el tamaño del arreglo (entero positivo)");
                scanner.next();
            }
            tamanio = scanner.nextInt();
            if (tamanio <= 0) {
                System.out.println("El tamaño debe ser entero positivo");
            }

        } while (tamanio <= 0);

        int[] nuevoArreglo = new int[tamanio]; 

        scanner.close();
    }
}

*/