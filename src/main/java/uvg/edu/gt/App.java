package uvg.edu.gt;


import java.util.Arrays;
import java.util.Scanner;


public class App {

    private static Integer[] numeros; 
    

    public static void main(String[] args) {
        
        System.out.println("Comenzando programa..");
        Sorts<Integer> sortMethods = new Sorts<Integer>();
        
        GeneradorNumeros.generarYGuardarNumeros(3000);
        numeros = GeneradorNumeros.leerYGuardarEnArreglo(3000);

        boolean running = true;
        Scanner scanner = new Scanner(System.in);

        while(running){

            System.out.println("Ingrese Enter para comenzar los sorts...(Ingrese 1 para salir)");
            String opt = scanner.next();

            switch (opt) {
                case "1":
                    running = false;
                    break;
            
                default:
                System.out.println("Comenzando analisis");         
                for(int i = 10; i < 3000; i++){
            
                    sortMethods.gnomeSort(Arrays.copyOfRange(numeros, 0, i),i);
        
        
                    sortMethods.mergeSort(Arrays.copyOfRange(numeros, 0, i),i);
        
        
                    sortMethods.quickSort(Arrays.copyOfRange(numeros, 0, i),i);
        
            
                    sortMethods.radixSort(Arrays.copyOfRange(numeros, 0, i),i);
        
        
                    sortMethods.bubbleSort(Arrays.copyOfRange(numeros, 0, i),i);
        
        
                }
                    break;
            }
            
        }
        
        

        System.out.println("Proceso Finalizado...");
    }
}

