package challenges.novice.answers;

import challenges.novice.SetUpTearDownChallengeData;
import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by BRIAN.SMITH on 3/12/2018 at 12:10 PM
 * Project: junit5-jupiter-training
 * Description:
 */
@Disabled
public class SetUpTearDownChallengeTests {

    static Logger logger;
    static SetUpTearDownChallengeData challenges;
    int currentTestNumber;
    int randomNumber;

    @BeforeAll
    public static void setUpAllTests() {
        logger = LoggerFactory.getLogger(SetUpTearDownChallengeTests.class);
        challenges = new SetUpTearDownChallengeData();
    }

    @AfterAll
    public static void tearDownAllTests() {
        logger.debug("Did all tests execute correctly: " + challenges.getCompletionStatus());
    }

    @BeforeEach
    public void setUpTest() {
        currentTestNumber = challenges.getCurrentTestNumber();
    }

    @AfterEach
    public void tearDownTest() {
        challenges.reportUsedValue(currentTestNumber, randomNumber);
    }

    @Test
    public void testFirstNumber() {
        randomNumber = challenges.getNumber(currentTestNumber);
    }

    @Test
    public void testSecondNumber() {
        randomNumber = challenges.getNumber(currentTestNumber);
    }

    @Test
    public void testThirdNumber() {
        randomNumber = challenges.getNumber(currentTestNumber);
    }
}
