import java.util.Arrays;

public class StreamTask {

    public static int getSumSquareEven(int[] numbers) {
        // TODO replace return with your code
        return Arrays.stream(numbers)
                .filter(param -> param%2==0)
                .map(param -> param*param)
                .sum();
    }

    public static int[] getSortedOddsArray(int[] numbers) {
        // TODO replace return with your code
        return Arrays.stream(numbers)
                .filter(param ->param%2!=0)
                .sorted()
                .toArray();
    }
}
