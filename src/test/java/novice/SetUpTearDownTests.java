package novice;

import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by BRIAN.SMITH on 3/1/2018 at 11:29 AM
 * Project: junit5-jupiter-training
 */
public class SetUpTearDownTests {

    private static Logger logger;

    @BeforeAll
    public static void setUpBeforeAllTests() {

        logger = LoggerFactory.getLogger(SetUpTearDownTests.class);
        logger.debug("Executes once @BeforeAll tests execute.");
    }

    @AfterAll
    public static void tearDownAfterAllTests() {

        logger.debug("Executes once @AfterAll tests execute.");
    }

    @BeforeEach
    public void setUpBeforeEachTest() {

        logger.debug("Executes @BeforeEach test executes.");
    }

    @AfterEach
    public void tearDownAfterEachTest() {

        logger.debug("Executes @AfterEach test executes.");
    }

    @Test
    public void testOne() {

        logger.debug("First test executes.");
    }

    @Test
    public void testTwo() {

        logger.debug("Second test executes.");
    }
}
