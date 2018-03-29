package challenges.novice.answers;

import challenges.novice.BasicTestsChallenge;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by Brian Smith on 3/28/18.
 * Description:
 */
@Disabled()
public class BasicChallengeTests {

    @Test
    public void sumOfOneAndTwoEqualsThreeIsTrue() {
        Assertions.assertTrue(BasicTestsChallenge.sumOf(1, 2, 3));
    }

    @Test
    public void sumOfTwoFivesEqualsTen() {
        assertEquals(10, BasicTestsChallenge.returnSumOf(5, 5));
    }

    @Test
    public void twoStringsJoinedEqualsString() {
        assertEquals("test everything", BasicTestsChallenge.joinString("test ", "everything"));
    }

    @Test
    public void newArrayEqualsOriginalArrayReversed() {
        assertArrayEquals(new String[] {"c", "b", "a"}, BasicTestsChallenge.returnReversed(new String[] {"a", "b", "c"}));
    }
}
