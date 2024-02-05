package uvg.edu.gt;


import java.util.Arrays;


public class App {

    private static Integer[] numeros; 
    

    public static void main(String[] args) {
        
        System.out.println("Comenzando programa..");
        Sorts<Integer> sortMethods = new Sorts<Integer>();
        
        for(int i = 0; i < 3000; i++){
            GeneradorNumeros.generarYGuardarNumeros(i);
            numeros = GeneradorNumeros.leerYGuardarEnArreglo(i);
            sortMethods.gnomeSort(numeros,i);

            GeneradorNumeros.generarYGuardarNumeros(i);
            numeros = GeneradorNumeros.leerYGuardarEnArreglo(i);
            sortMethods.gnomeSort(numeros,i);

            GeneradorNumeros.generarYGuardarNumeros(i);
            numeros = GeneradorNumeros.leerYGuardarEnArreglo(i);
            sortMethods.gnomeSort(numeros,i);

            GeneradorNumeros.generarYGuardarNumeros(i);
            numeros = GeneradorNumeros.leerYGuardarEnArreglo(i);
            sortMethods.gnomeSort(numeros,i);

            GeneradorNumeros.generarYGuardarNumeros(i);
            numeros = GeneradorNumeros.leerYGuardarEnArreglo(i);
            sortMethods.gnomeSort(numeros,i);

            GeneradorNumeros.generarYGuardarNumeros(i);
            numeros = GeneradorNumeros.leerYGuardarEnArreglo(i);
            sortMethods.gnomeSort(numeros,i);

        }
        
        

        System.out.println("Proceso Finalizado...");
    }
}

