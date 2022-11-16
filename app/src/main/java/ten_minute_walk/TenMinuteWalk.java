package ten_minute_walk;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class TenMinuteWalk {
    private int west;
    private int south;

    public Boolean assess( char[] walk_array) {
        for (char direction : walk_array) {
            this.south++;
            this.west++;
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
        return this.west;
    }

    protected int getSouth() {
        return this.south;
    }
}
