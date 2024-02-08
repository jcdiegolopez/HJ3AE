package uvg.edu.gt;

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
    
    public T[] mergeSort(T[] array) {
        mergeSort(array, 0, array.length - 1);
        return array;
    }

    private void mergeSort(T[] array, int low, int high) {
        if (low < high) {
            int middle = low + (high - low) / 2;
            mergeSort(array, low, middle);
            mergeSort(array, middle + 1, high);
            mergeSort(array, middle, high);
        }
    }

    @SuppressWarnings({ "unchecked", "unused" })
    private void mergeSort(T[] array, int low, int middle, int high) {
        int n1 = middle - low + 1;
        int n2 = high - middle;

        // Arreglos temporales
        Object[] leftArray = new Object[n1];
        Object[] rightArray = new Object[n2];

        // Copia datos a los arreglos temporales
        for (int i = 0; i < n1; i++) {
            leftArray[i] = array[low + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = array[middle + 1 + j];
        }

        // Índices iniciales del primer y segundo subarray
        int i = 0, j = 0;

        // Índice inicial del subarray fusionado
        int k = low;

        // Fusiona los subarrays
        while (i < n1 && j < n2) {
            if (((T) leftArray[i]).compareTo((T) rightArray[j]) <= 0) {
                array[k] = (T) leftArray[i];
                i++;
            } else {
                array[k] = (T) rightArray[j];
                j++;
            }
            k++;
        }

        // Copia los elementos restantes de leftArray[], si hay alguno
        while (i < n1) {
            array[k] = (T) leftArray[i];
            i++;
            k++;
        }

        // Copia los elementos restantes de rightArray[], si hay alguno
        while (j < n2) {
            array[k] = (T) rightArray[j];
            j++;
            k++;
        }
    }

    public T[] quickSort(T[] array,int size){
        return null;
    }

    public T[] radixSort(T[] array,int size){
        return null;
    }

    public T[] buubleSort(T[] array,int size){
        return null;
    }


    public T[] insertionSort(T[] array) {
        int numSorted = 1; 

        while (numSorted < array.length) {
            
            T temp = array[numSorted];
            
            int index;
            for (index = numSorted; index > 0; index--) {
                if (temp.compareTo(array[index - 1]) < 0) {
                    array[index] = array[index - 1];
                } else {
                    break;
                }
            }

            
            array[index] = temp;
            numSorted++;
        }

        return array;
    }
}
