package ten_minute_walk;

import org.jetbrains.annotations.NotNull;

public class TenMinuteWalk {
    public Boolean assess( char[] walk_array) {
        if (this.getLength(walk_array) < 10) {
            return false;
        }
        return true;
    }

    protected int getLength(char @NotNull [] walk_array) {
        return walk_array.length;
    }
}
