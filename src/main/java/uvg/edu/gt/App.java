package uvg.edu.gt;


import java.util.Arrays;
import java.util.Scanner;


public class App {

    private static Integer[] numeros;
    private static Integer[] numerosOrdenados; 
    

    public static void main(String[] args) {
        
        System.out.println("Comenzando programa..");
        Sorts<Integer> sortMethods = new Sorts<Integer>();
        
        GeneradorNumeros.generarYGuardarNumeros(3000);
        numeros = GeneradorNumeros.leerYGuardarEnArreglo(3000);
        numerosOrdenados = sortMethods.bubbleSort(numeros,3000);

        boolean running = true;
        Scanner scanner = new Scanner(System.in);

        while(running){

            System.out.println("1.Ordenar listas desornadas");
            System.out.println("2. Ordernar lista ya ordenada");
            System.out.println("3. Salir");
            String opt = scanner.next();

            switch (opt) {
                case "1":
                    System.out.println("Ordenamiento de listas no ordenadas...");         
                    for(int i = 10; i < 3000; i++){
                
                        sortMethods.gnomeSort(Arrays.copyOfRange(numeros, 0, i),i);
            
            
                        sortMethods.mergeSort(Arrays.copyOfRange(numeros, 0, i),i);
            
            
                        sortMethods.quickSort(Arrays.copyOfRange(numeros, 0, i),i);
            
                
                        sortMethods.radixSort(Arrays.copyOfRange(numeros, 0, i),i);
            
            
                        sortMethods.bubbleSort(Arrays.copyOfRange(numeros, 0, i),i);
            
            
                    }
                    break;
                case "2":
                    System.out.println("Ordenamiento de listas ordenadas...");         
                    for(int i = 10; i < 3000; i++){
                
                        sortMethods.gnomeSort(Arrays.copyOfRange(numerosOrdenados, 0, i),i);
            
            
                        sortMethods.mergeSort(Arrays.copyOfRange(numerosOrdenados, 0, i),i);
            
            
                        sortMethods.quickSort(Arrays.copyOfRange(numerosOrdenados, 0, i),i);
            
                
                        sortMethods.radixSort(Arrays.copyOfRange(numerosOrdenados, 0, i),i);
            
            
                        sortMethods.bubbleSort(Arrays.copyOfRange(numerosOrdenados, 0, i),i);
            
            
                    }
                    break;
            
                default:
                    running = false;
                    break;
                
                
            }
            System.out.println("Proceso Finalizado...");
            
        }
        
        

        System.out.println("Saliendo del programa...");
    }
}


