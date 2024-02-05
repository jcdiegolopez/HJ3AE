package uvg.edu.gt;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Random;

public class GeneradorNumeros {

    public static void generarYGuardarNumeros(int n) {
        try (FileWriter writer = new FileWriter("numeros.txt")) {
            Random random = new Random();

            for (int i = 0; i < n; i++) {
                Integer numero = random.nextInt(); // Genera un número entero aleatorio
                writer.write(Integer.toString(numero) + "\n");
            }

            System.out.println("Se generaron y guardaron los números en 'numeros.txt'");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Integer[] leerYGuardarEnArreglo(int n) {
        Integer[] arreglo = new Integer[n];

        try (BufferedReader reader = new BufferedReader(new FileReader("numeros.txt"))) {
            String linea;
            int indice = 0;

            while ((linea = reader.readLine()) != null && indice < n) {
                arreglo[indice] = Integer.parseInt(linea);
                indice++;
            }

            System.out.println("Se leyeron y guardaron los números en un arreglo.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return arreglo;
    }
}

