package ejercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysUtilsTest {

    @Test
    void sumItemsOfArray() {
        int[] array1 = {1, 2, 3, 4};
        assertEquals(10, ArraysUtils.sumItemsOfArray(array1));
        assertEquals(1, ArraysUtils.sumItemsOfArray(new int[]{1}));
        assertNotEquals(11, ArraysUtils.sumItemsOfArray(array1));
        assertEquals(0, ArraysUtils.sumItemsOfArray(new int[]{}) );
        assertNull(ArraysUtils.sumItemsOfArray(null));
    }

    @Test
    void getMinimumMaximumOfArray() {
        assertArrayEquals(new int[]{1, 4}, ArraysUtils.getMinimumMaximumOfArray(new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{4, 4}, ArraysUtils.getMinimumMaximumOfArray(new int[]{4, 4, 4, 4}));
        assertArrayEquals(new int[]{4, 4}, ArraysUtils.getMinimumMaximumOfArray(new int[]{4}));
        assertArrayEquals(new int[]{}, ArraysUtils.getMinimumMaximumOfArray(new int[]{}));
        assertNull(ArraysUtils.getMinimumMaximumOfArray(null));

    }

    @Test
    void getArrayWithoutDuplicates() {
        //sin duplicados
        assertArrayEquals(new int[]{1,3,4}, ArraysUtils.getArrayWithoutDuplicates(new int[]{1,3,4}));
        assertArrayEquals(new int[]{1,3,4}, ArraysUtils.getArrayWithoutDuplicates(new int[]{1,4,3}));
        //con duplicados
        assertArrayEquals(new int[]{1,3,4}, ArraysUtils.getArrayWithoutDuplicates(new int[]{1,4,1,3}));
        //un solo elemento
        assertArrayEquals(new int[]{1}, ArraysUtils.getArrayWithoutDuplicates(new int[]{1}));
        //sin elementos
        assertArrayEquals(new int[]{}, ArraysUtils.getArrayWithoutDuplicates(new int[]{}));
        //null
        assertNull(ArraysUtils.getArrayWithoutDuplicates(null));
    }

    @Test
    void rotatePositionsInArrays() {
        int[] array = {0,1,2,3};
        assertArrayEquals(new int[]{3,0,1,2}, ArraysUtils.rotatePositionsInArrays(array, 5));
        assertArrayEquals(new int[]{0,1,2,3}, ArraysUtils.rotatePositionsInArrays(array, 4));
        assertArrayEquals(new int[]{1,2,3,0}, ArraysUtils.rotatePositionsInArrays(array, 3));
        assertArrayEquals(new int[]{0,1,2,3}, ArraysUtils.rotatePositionsInArrays(array, 0));
        assertArrayEquals(new int[]{1,2,3,0}, ArraysUtils.rotatePositionsInArrays(array, -1));
        assertArrayEquals(new int[]{3,0,1,2}, ArraysUtils.rotatePositionsInArrays(array, -3));
        assertArrayEquals(new int[]{0,1,2,3}, ArraysUtils.rotatePositionsInArrays(array, -4));
        assertArrayEquals(new int[]{1,2,3,0}, ArraysUtils.rotatePositionsInArrays(array, -5));
        assertArrayEquals(new int[]{1}, ArraysUtils.rotatePositionsInArrays(new int[]{1}, 15));
        assertArrayEquals(new int[]{}, ArraysUtils.rotatePositionsInArrays(new int[]{}, 15));
        assertArrayEquals(new int[]{}, ArraysUtils.rotatePositionsInArrays(new int[]{}, -15));
        assertNull(ArraysUtils.rotatePositionsInArrays(null, -1));
        assertNull(ArraysUtils.rotatePositionsInArrays(null, -0));
    }
}