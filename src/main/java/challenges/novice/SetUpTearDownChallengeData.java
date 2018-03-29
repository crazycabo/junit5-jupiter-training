package challenges.novice;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Brian Smith on 3/11/18.
 * Project: junit5-jupiter-training
 * Description: Use these methods with the setup and teardown challenges.
 */
public class SetUpTearDownChallengeData {

    private int[] assignedNumbers;
    private int currentTestNumber;
    private int firstNumber;
    private int secondNumber;
    private int thirdNumber;

    public SetUpTearDownChallengeData() {
        this.assignedNumbers = new int[]{0, 0, 0};
        this.currentTestNumber = 1;
    }

    public int getCurrentTestNumber() {
        return currentTestNumber;
    }

    public int getNumber(int number) {
        switch (number) {
            case 1:
                firstNumber = getRandomNumber(1, 100);
                return firstNumber;
            case 2:
                secondNumber = getRandomNumber(101, 1000);
                return secondNumber;
            case 3:
                thirdNumber = getRandomNumber(1001, 10000);
                return thirdNumber;
            default:
                return -1;
        }
    }

    public void reportUsedValue(int number, int value) {
        switch (number) {
            case 1:
                assignedNumbers[0] = value;
                break;
            case 2:
                assignedNumbers[1] = value;
                break;
            case 3:
                assignedNumbers[2] = value;
                break;
            default:
                throw new Error("You did not specify a correct number, 1-3 only");
        }

        currentTestNumber += 1;
    }

    public boolean getCompletionStatus() {
        return Arrays.equals(assignedNumbers, new int[]{firstNumber, secondNumber, thirdNumber});
    }

    private int getRandomNumber(int lowerBound, int upperBound) {
        Random rand = new Random();
        return rand.nextInt(upperBound - lowerBound) + lowerBound;
    }
}
