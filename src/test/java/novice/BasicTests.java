package novice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by BRIAN.SMITH on 2/28/2018 at 11:08 AM
 * Project: junit5-jupiter-training
 */
public class BasicTests {

    @Test
    public void simpleValidationTest() {

        boolean alwaysTrue = true;

        Assertions.assertTrue(alwaysTrue);
        Assertions.assertTrue(alwaysTrue, "This should always be true.");
    }

    @Test
    public void negativeValidationTest() {

        boolean alwaysFalse = false;

        Assertions.assertFalse(alwaysFalse);
        Assertions.assertFalse(alwaysFalse, "Java cannot add properly.");
    }

    @Test
    public void equalsValidationTest() {

        int i = 100;
        String str = "this";
        float f = 3.14f;

        Assertions.assertEquals(i, i);
        Assertions.assertEquals(str, str);
        Assertions.assertEquals(f, f, "Values should equal each other.");
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
