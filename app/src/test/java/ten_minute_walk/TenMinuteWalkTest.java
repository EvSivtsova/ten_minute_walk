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
                assertEquals("Evaluates the length of the array", expectedLength, walk.getLength(walk_array));
                assertFalse("Calculates the number of minutes and returns false", result);
        }

        @Test
        public void shouldReturnFalseIfWalkLengthIsTwo() {
                char[] walk_array = {'w', 's'};
                int expectedLength = 2;
                TenMinuteWalk walk = new TenMinuteWalk();
                Boolean result = walk.assess(walk_array);
                assertEquals("Evaluates the length of the array", expectedLength, walk.getLength(walk_array));
                assertFalse("Calculates the number of minutes and returns false", result);
        }

        @Test
        public void shouldReturnFalseIfWalkLengthIsThree() {
                char[] walk_array = {'w', 's', 'n'};
                int expectedLength = 3;
                TenMinuteWalk walk = new TenMinuteWalk();
                Boolean result = walk.assess(walk_array);
                assertEquals("Evaluates the length of the array", expectedLength, walk.getLength(walk_array));
                assertFalse("Calculates the number of minutes and returns false", result);
        }

        @Test
        public void shouldReturnTrueForAcceptableWalk() {
                char[] walk_array = {'w', 's', 'e', 'e', 'n', 'n', 'e', 's', 'w', 'w'};
                int expectedLength = 10;
                TenMinuteWalk walk = new TenMinuteWalk();
                Boolean result = walk.assess(walk_array);
                assertEquals("Evaluates the length of the array", expectedLength, walk.getLength(walk_array));
                assertTrue ("Calculates the number of minutes and returns true", result);
        }

        @Test
        public void shouldIncreaseWestValue_WhenDirectedWest() {
                char[] walk_array = {'w'};
                int expectedWestValue = 1;
                TenMinuteWalk walk = new TenMinuteWalk();
                walk.assess(walk_array);
                assertEquals("Evaluates the step west", expectedWestValue, walk.getWest());
        }

        @Test
        public void shouldIncreaseWestValue_WhenDirectedWest2() {
                char[] walk_array = {'w', 'w'};
                int expectedWestValue = 2;
                TenMinuteWalk walk = new TenMinuteWalk();
                walk.assess(walk_array);
                assertEquals("Evaluates the step west", expectedWestValue, walk.getWest());
        }
}
