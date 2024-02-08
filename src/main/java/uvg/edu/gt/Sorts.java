package uvg.edu.gt;

import java.util.Arrays;

public class Sorts<T extends Comparable<T>> {
    
    public T[] gnomeSort(T[] array,int size){
        int index = 0;

        while (index < size) {
            if (index == 0 || array[index].compareTo(array[index - 1]) >= 0)
                index++;
            else {
                T temp = array[index];
                array[index] = array[index - 1];
                array[index - 1] = temp;
                index--;
            }
        }
        return array;

    }
    
        public T[] mergeSort(T[] array, int size) {
        if (size < 2) {
            return array;
        }

        int middle = size / 2;
        T[] leftArray = Arrays.copyOfRange(array, 0, middle);
        T[] rightArray = Arrays.copyOfRange(array, middle, size);

        mergeSort(leftArray, middle);
        mergeSort(rightArray, size - middle);
        merge(array, leftArray, rightArray, middle, size - middle);

        return array;
    }

    private void merge(T[] array, T[] leftArray, T[] rightArray, int leftSize, int rightSize) {
        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftArray[i].compareTo(rightArray[j]) <= 0) {
                array[k] = leftArray[i];
                k++;
                i++;
            } else {
                array[k] = rightArray[j];
                k++;
                j++;
            }
        }

        while (i < leftSize) {
            array[k++] = leftArray[i++];
        }

        while (j < rightSize) {
            array[k++] = rightArray[j++];
        }
    }

    public T[] quickSort(T[] array, int size) {
        quickSortHelper(array, 0, size - 1);
        return array;
    }

    private void quickSortHelper(T[] array, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(array, low, high);

            quickSortHelper(array, low, partitionIndex - 1);
            quickSortHelper(array, partitionIndex + 1, high);
        }
    }

    private int partition(T[] array, int low, int high) {
        T pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j].compareTo(pivot) <= 0) {
                i++;

                T temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        T temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    public T[] radixSort(T[] array, int size) {
        // Encuentra el valor máximo para determinar el número de dígitos
        T max = Arrays.stream(array).max(Comparable::compareTo).orElse(null);

        if (max == null) {
            return array;
        }

        // Realiza el Radix Sort
        for (int exp = 1; ((Integer)max).intValue() / exp > 0; exp *= 10) {
            countSort(array, size, exp);
        }

        return array;
    }

    private void countSort(T[] array, int size, int exp) {
        T[] output = Arrays.copyOf(array, size);
        int[] count = new int[10];
        Arrays.fill(count, 0);

        // Conteo de ocurrencias de dígitos en el lugar actual
        for (int i = 0; i < size; i++) {
            count[((Integer)array[i]).intValue() / exp % 10]++;
        }

        // Ajuste del conteo para obtener las posiciones finales de los dígitos
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Construcción del array ordenado
        for (int i = size - 1; i >= 0; i--) {
            output[count[((Integer)array[i]).intValue() / exp % 10] - 1] = array[i];
            count[((Integer)array[i]).intValue() / exp % 10]--;
        }

        // Copia el array ordenado de vuelta al array original
        System.arraycopy(output, 0, array, 0, size);
    }

    public T[] bubbleSort(T[] array, int size) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

}
