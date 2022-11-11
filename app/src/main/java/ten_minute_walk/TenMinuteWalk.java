package ten_minute_walk;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class TenMinuteWalk {
    private int west = 0;

    public Boolean assess( char[] walk_array) {
        char[] west_array_one = {'w'};
        if (Arrays.equals(walk_array, west_array_one)) {
            this.west = 1;
        } else {
            this.west = 2;
        }
        if (this.getLength(walk_array) < 10) {
            return false;
        }
        return true;
    }

    protected int getLength(char @NotNull [] walk_array) {
        return walk_array.length;
    }

    protected int getWest() {
        return west;
    }
}
