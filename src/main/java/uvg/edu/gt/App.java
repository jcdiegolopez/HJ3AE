package uvg.edu.gt;


import java.util.Arrays;


public class App {

    private static Integer[] numeros; 
    

    public static void main(String[] args) {
        
        System.out.println("Comenzando programa..");
        
        Sorts<Integer> sortMethods = new Sorts<Integer>();
        
        for (int i = 10; i <= 3000; i += 10) {
    GeneradorNumeros.generarYGuardarNumeros(i);
    numeros = GeneradorNumeros.leerYGuardarEnArreglo(i);

    // Gnome Sort
    long gnomeStartTime = System.nanoTime();
    sortMethods.gnomeSort(Arrays.copyOf(numeros, i), i);
    long gnomeEndTime = System.nanoTime();
    System.out.println("Gnome Sort - " + i + " elementos: " + (gnomeEndTime - gnomeStartTime) + " nanosegundos");

    // Merge Sort 
    long mergeStartTime = System.nanoTime();
    sortMethods.mergeSort(Arrays.copyOf(numeros, i));
    long mergeEndTime = System.nanoTime();
    System.out.println("Merge Sort - " + i + " elementos: " + (mergeEndTime - mergeStartTime) + " nanosegundos");

    // Quick Sort 
    long quickStartTime = System.nanoTime();
    sortMethods.quickSort(Arrays.copyOf(numeros, i));
    long quickEndTime = System.nanoTime();
    System.out.println("Quick Sort - " + i + " elementos: " + (quickEndTime - quickStartTime) + " nanosegundos");

    // Radix Sort
    long radixStartTime = System.nanoTime();
    sortMethods.radixSort(Arrays.copyOf(numeros, i));
    long radixEndTime = System.nanoTime();
    System.out.println("Radix Sort - " + i + " elementos: " + (radixEndTime - radixStartTime) + " nanosegundos");

    // Insertion Sort 
    long insertionStartTime = System.nanoTime();
    sortMethods.insertionSort(Arrays.copyOf(numeros, i));
    long insertionEndTime = System.nanoTime();
    System.out.println("Insertion Sort - " + i + " elementos: " + (insertionEndTime - insertionStartTime) + " nanosegundos");

    GeneradorNumeros.limpiarArchivo();
}
        

        System.out.println("Proceso Finalizado...");
    }
}

