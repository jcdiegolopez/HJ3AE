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
    
    public T[] mergeSort(T[] array,int size){
        return null;
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
}
