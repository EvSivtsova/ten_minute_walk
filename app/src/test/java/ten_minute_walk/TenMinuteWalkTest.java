package ten_minute_walk;

import org.junit.Test;

import static org.junit.Assert.*;

public class TenMinuteWalkTest {
        @Test
        public void shouldReturnFalseIfWalkLengthIsOne() {
                char[] walk_array = {'w'};
                int expectedLength = 1;
                TenMinuteWalk walk = new TenMinuteWalk();
                Boolean result = walk.assess(walk_array);
                assertEquals("Calculates the number of minutes and returns false", expectedLength, walk.getLength(walk_array));
                assertFalse("Calculates the number of minutes and returns false", result);
        }

        @Test
        public void shouldReturnFalseIfWalkLengthIsTwo() {
                char[] walk_array = {'w', 's'};
                int expectedLength = 2;
                TenMinuteWalk walk = new TenMinuteWalk();
                Boolean result = walk.assess(walk_array);
                assertEquals("Calculates the number of minutes and returns false", expectedLength, walk.getLength(walk_array));
                assertFalse("Calculates the number of minutes and returns false", result);
        }

        @Test
        public void shouldReturnFalseIfWalkLengthIsThree() {
                char[] walk_array = {'w', 's', 'n'};
                int expectedLength = 3;
                TenMinuteWalk walk = new TenMinuteWalk();
                Boolean result = walk.assess(walk_array);
                assertEquals("Calculates the number of minutes and returns false", expectedLength, walk.getLength(walk_array));
                assertFalse("Calculates the number of minutes and returns false", result);
        }
}