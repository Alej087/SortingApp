package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class SortingAppTest {
    protected SortingApp sorting = new SortingApp();
    private int[] input;
    private int[] expectedOutput;

    public SortingAppTest(int[] input, int[] expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }


    @Parameterized.Parameters(name = "Test case: {index}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{}, null},
                {new int[]{5}, new int[]{5}},
                {new int[]{5, 3, 9, 1, 7, 2, 6, 8, 4, 0}, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}},
                {new int[]{5, 3, 9, 1, 7, 16, 2, 5, 8, 1, 2}, null}
        });
    }

    @Test
    public void testSort() {
        try {
            int[] result = sorting.sort(input);
            Assert.assertArrayEquals(expectedOutput, result);
        } catch (IllegalArgumentException e) {
            Assert.assertNull("Expected IllegalArgumentException", expectedOutput);
        }
    }
}
