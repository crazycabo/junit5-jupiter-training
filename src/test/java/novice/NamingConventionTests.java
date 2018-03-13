package novice;

import org.junit.jupiter.api.Test;

/**
 * Created by BRIAN.SMITH on 3/12/2018 at 12:27 PM
 * Project: junit5-jupiter-training
 * Description: This displays typical naming conventions for test methods.
 */
public class NamingConventionTests {

    @Test
    public void simpleNameOfApplicationFunction() {
        // This is an example of a simple name describing the feature being tested
    }

    @Test
    public void divide_divisorEqualsZero_exceptionCaught() {
        // This example splits the unit of work, input, and output giving a clear definition of what's expected
    }

    @Test
    public void given_myAgeIsUnderSixteen_when_accountCreationAttempted_then_minimumAgeWarningDisplays() {
        /* Describe a feature using BDD, or behavior driven development. This course
           will explain BDD in more detail within a separate module of the advanced track.
         */
    }
}
