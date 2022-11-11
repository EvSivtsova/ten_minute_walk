package ten_minute_walk;

import org.jetbrains.annotations.NotNull;

public class TenMinuteWalk {
    private int west = 0;

    public Boolean assess( char[] walk_array) {
        this.west = 1;
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
