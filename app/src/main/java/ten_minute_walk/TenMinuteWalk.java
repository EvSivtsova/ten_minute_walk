package ten_minute_walk;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class TenMinuteWalk {
    private int west;
    private int south;
    private int north;
    private int east;

    public Boolean assess( char[] walk_array) {
        for (char direction : walk_array) {
            if (direction == 's') {
                this.south++;
            } else if (direction == 'w') {
                this.west++;
            } else if (direction == 'n') {
                this.north++;
            } else {
                this.east++;
            }
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

    public int getNorth() {
        return this.north;
    }

    public int getEast() {
        return this.east;
    }
}
