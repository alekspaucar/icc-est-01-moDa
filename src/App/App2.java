package App;
public class App2 {
    public static void main(String[] args) throws Exception {
        arreglo[i] = leerEnteroValido(scanner, "Elemento " + (i + 1) + ":");
        
        for (int i : arreglo) {
            System.out.println(i);
        }
        
        scanner.close();
    }

    // Método para validar si la entrada es un número entero
    public static int leerEnteroValido(Scanner scanner,
                                       String mensaje,
                                       boolean permitirNegativos) {
        // Código a completar
    }
}