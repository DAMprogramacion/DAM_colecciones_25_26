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
    }

    @Test
    void rotatePositionsInArrays() {
    }
}