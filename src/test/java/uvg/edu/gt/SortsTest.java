package uvg.edu.gt;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class SortsTest{

    @Test
    public void testGnomeSort() {
        Integer[] array = {10, 3, 2, 40, 1};
        new Sorts<Integer>().gnomeSort(array, array.length);
        assertTrue(isSorted(array));
    }

    @Test
    public void testMergeSort() {
        Integer[] array = {3, 6, 45, 12, 1, -2};
        new Sorts<Integer>().mergeSort(array, array.length);
        assertTrue(isSorted(array));
    }

    @Test
    public void testQuickSort() {
        Integer[] array = {4, 3, 2, 1};
        new Sorts<Integer>().quickSort(array, array.length);
        assertTrue(isSorted(array));
    }

    @Test
    public void testRadixSort() {
        Integer[] array = {170, 45, 75, 90, 802, 24, 2, 66};
        new Sorts<Integer>().radixSort(array, array.length);
        assertTrue(isSorted(array));
    }

    @Test
    public void testBubbleSort() {
        Integer[] array = {64, 34, 25, 12, 22, 11, 90};
        new Sorts<Integer>().bubbleSort(array, array.length);
        assertTrue(isSorted(array));
    }

    // Método auxiliar para verificar si un arreglo está ordenado
    private <T extends Comparable<T>> boolean isSorted(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].compareTo(array[i + 1]) > 0) {
                return false;
            }
        }
        return true;
    }
}

