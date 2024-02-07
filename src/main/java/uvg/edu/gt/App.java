package uvg.edu.gt;


import java.util.Arrays;


public class App {

    private static Integer[] numeros; 
    

    public static void main(String[] args) {
        
        System.out.println("Comenzando programa..");
        Sorts<Integer> sortMethods = new Sorts<Integer>();
        
        GeneradorNumeros.generarYGuardarNumeros(3000);
        numeros = GeneradorNumeros.leerYGuardarEnArreglo(3000);

        for(int i = 10; i < 3000; i++){
            
            sortMethods.gnomeSort(Arrays.copyOfRange(numeros, 0, i),i);


            sortMethods.gnomeSort(Arrays.copyOfRange(numeros, 0, i),i);


            sortMethods.gnomeSort(Arrays.copyOfRange(numeros, 0, i),i);

    
            sortMethods.gnomeSort(Arrays.copyOfRange(numeros, 0, i),i);


            sortMethods.gnomeSort(Arrays.copyOfRange(numeros, 0, i),i);


        }
        
        

        System.out.println("Proceso Finalizado...");
    }
}

