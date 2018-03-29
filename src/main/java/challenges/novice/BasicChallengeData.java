package challenges.novice;

/**
 * Created by Brian Smith on 3/10/18.
 * Description:
 */
public class BasicChallengeData {

    public static boolean sumOf(int first, int second, int equals) {
        return first + second == equals;
    }

    public static int returnSumOf(int first, int second) {
        return first + second;
    }

    public static String joinString(String s, String withString) {
        return s + withString;
    }

    public static String[] returnReversed(String[] s) {
        int length = s.length;
        String[] stringsReversed = new String[length];

        for (int i = 0; i < length; i++) {
            stringsReversed[i] = s[length - 1 - i];
        }

        return stringsReversed;
    }
}
