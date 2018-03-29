package challenges.novice;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by BRIAN.SMITH on 3/12/2018 at 12:10 PM
 * Project: junit5-jupiter-training
 * Description: Use this template to complete the setup / teardown challenge tests exercise.
 * You will create both annotated class and test setup and teardown methods, along with 3 tests.
 * See README file for more information.
 */
public class SetUpTearDownChallengeTests {

    static Logger logger;
    static SetUpTearDownChallengeData challenges;

    @BeforeAll
    public static void setUpAllTests() {
        logger = LoggerFactory.getLogger(SetUpTearDownChallengeTests.class);
        challenges = new SetUpTearDownChallengeData();
    }

    @AfterAll
    public static void tearDownAllTests() {
        Assertions.assertTrue(challenges.getCompletionStatus(), "All tests did not execute correctly.");
    }

    // Setup Test

    // Tear down Test

    // Tests(3)
}
