package introduction;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by BRIAN.SMITH on 2/28/2018 at 11:08 AM
 * Project: junit5-jupiter-training
 */
public class BasicTests {

    @Test
    public void simpleValidationTest() {

        Assertions.assertTrue(true);
        Assertions.assertTrue(true, "This should always be true.");
    }

    @Test
    public void negativeValidationTest() {

        Assertions.assertFalse(false);
        Assertions.assertFalse(false, "Java cannot add properly.");
    }

    @Test
    public void equalsValidationTest() {

        Assertions.assertEquals(100, 100);
        Assertions.assertEquals("this", "this");
        Assertions.assertEquals(3.14, 3.14, "Floats should equal each other.");
    }

    @Test
    public void arrayContentValidationTest() {

        int[] arrayOne = new int[] {1,2,3};
        int[] arrayTwo = new int[] {1,2,3};

        Assertions.assertArrayEquals(arrayOne, arrayTwo);
        Assertions.assertArrayEquals(arrayOne, arrayTwo, "Contents are not equal.");
    }

    @Test
    public void forcedFailTest() {

        Assertions.fail("This test always fails.");
    }
}
