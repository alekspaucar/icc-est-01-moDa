public class metodoOrdenado {

    public int[] sortBubbleAva(int[] arreglo){
        int n = arreglo.length;
        boolean intercambio=false;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.println("j="+j+"[j]="+arreglo[j]+"j+1="+j+1+"[j+1]="+arreglo[j]);
                if (arreglo[j] > arreglo[j + 1]) { 
                    System.out.println("si hay cambio");// Eliminar el punto y coma aquí
                    // Intercambio
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                    intercambio=true;
            }  
            //si no hubo intercambio ya estuvo ordenado no deberia preguntar mas 
            if (!intercambio){
                break;
            }
        }    
    }
    return arreglo;
}
    
    public void printArreglo(int[] arreglo) {
        for(int num: arreglo){
            System.out.print(num + " ");

        }
    }
}
public

 


    
