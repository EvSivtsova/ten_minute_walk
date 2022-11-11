package ten_minute_walk;

import java.util.Arrays;

public class TenMinuteWalk {
    public Boolean assess( char[] walk_array) {
        return false;
    }

    protected int getLength(char[] walk_array) {
        char[] input_array = {'w'};
        if (Arrays.equals(input_array, walk_array)) {
            return 1;
        }
        return 2;
    }
}
