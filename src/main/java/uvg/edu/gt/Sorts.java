package uvg.edu.gt;

import java.util.Vector;

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
        quickSort(array, 0, array.length - 1);
        return array;
    }

    private void quickSort(T[] array, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(array, left, right);

            quickSort(array, left, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, right);
        }
    }

    private int partition(T[] array, int left, int right) {
        while (true) {
            // Move right "pointer" toward left
            while (left < right && array[left].compareTo(array[right]) < 0) {
                right--;
            }
            if (left < right) {
                swap(array, left++, right);
            } else {
                return left;
            }

            // Move left pointer toward right
            while (left < right && array[left].compareTo(array[right]) < 0) {
                left++;
            }
            if (left < right) {
                swap(array, left, right--);
            } else {
                return right;
            }
        }
    }

    private void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public T[] radixSort(T[] array,int size){
        int maxDigits = getMaxDigits(array);

        for (int digitPlace = 0; digitPlace < maxDigits; digitPlace++) {
            bucketPass(array, digitPlace);
        }

        return array;
    }

    private int getMaxDigits(T[] array) {
        int maxDigits = 0;
        for (T element : array) {
            int numDigits = countDigits(element);
            if (numDigits > maxDigits) {
                maxDigits = numDigits;
            }
        }
        return maxDigits;
    }

    private int countDigits(T element) {
        int count = 0;
    
        if (element instanceof Number) {
            long value = ((Number) element).longValue(); // Convertir a un tipo numérico que soporte la operación
    
            while (value > 0) {
                value /= 10;
                count++;
            }
        } else {
            
        }
    
        return count;
    }
    

    private void bucketPass(T[] array, int digitPlace) {
        int n = array.length;
        Vector<Vector<T>> bucket = new Vector<>(10);
        bucket.setSize(10);

        for (int j = 0; j < 10; j++) {
            bucket.set(j, new Vector<T>());
        }

        for (int i = 0; i < n; i++) {
            T value = array[i];
            int j = digit(value, digitPlace);
            bucket.get(j).add(value);
        }

        int i = 0;
        for (int j = 0; j < 10; j++) {
            while (!bucket.get(j).isEmpty()) {
                array[i++] = bucket.get(j).remove(0);
            }
        }
    }

    private int digit(T value, int digitPlace) {
        for (int i = 0; i < digitPlace; i++) {
            value = (T) (Integer.valueOf(value.toString()) / 10);
        }
        return (Integer.parseInt(value.toString())) % 10;
    }
    

    public T[] buubleSort(T[] array,int size){
        // Dentro de la clase Sorts
        int n = array.length;
        boolean swapped;

        do {
         swapped = false;
            for (int i = 1; i < n; i++) {
             if (array[i - 1].compareTo(array[i]) > 0) {
                // Realizar intercambio
                T temp = array[i - 1];
                array[i - 1] = array[i];
                array[i] = temp;
                swapped = true;
            }
        }
    } while (swapped);

    return array;
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


