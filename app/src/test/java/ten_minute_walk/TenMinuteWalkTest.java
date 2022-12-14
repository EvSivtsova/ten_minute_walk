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

        @Test
        public void shouldIncreaseWestValue_WhenDirectedWest3() {
                char[] walk_array = {'w', 'w', 'w'};
                int expectedWestValue = 3;
                TenMinuteWalk walk = new TenMinuteWalk();
                walk.assess(walk_array);
                assertEquals("Evaluates the step west", expectedWestValue, walk.getWest());
        }

        @Test
        public void shouldIncreaseSouthValue_WhenDirectedSouth() {
                char[] walk_array = {'s'};
                int expectedSouthValue = 1;
                TenMinuteWalk walk = new TenMinuteWalk();
                walk.assess(walk_array);
                assertEquals("Evaluates the step south", expectedSouthValue, walk.getSouth());
        }

        @Test
        public void shouldIncreaseSouthValue_WhenDirectedSouthTwice() {
                char[] walk_array = {'s', 's'};
                int expectedSouthValue = 2;
                TenMinuteWalk walk = new TenMinuteWalk();
                walk.assess(walk_array);
                assertEquals("Evaluates the step south", expectedSouthValue, walk.getSouth());
        }

        @Test
        public void shouldIncreaseSouthValue_WhenDirectedSouthThrice() {
                char[] walk_array = {'s', 's', 's'};
                int expectedSouthValue = 3;
                TenMinuteWalk walk = new TenMinuteWalk();
                walk.assess(walk_array);
                assertEquals("Evaluates the step south", expectedSouthValue, walk.getSouth());
        }

        @Test
        public void shouldIncreaseDirectionValues_WhenStepsSouthAndWest() {
                char[] walk_array = {'s', 'w', 's'};
                int expectedSouthValue = 2;
                int expectedWestValue = 1;

                TenMinuteWalk walk = new TenMinuteWalk();
                walk.assess(walk_array);
                assertEquals("Evaluates the steps south", expectedSouthValue, walk.getSouth());
                assertEquals("Evaluates the steps west", expectedWestValue, walk.getWest());
        }

        @Test
        public void shouldIncreaseDirectionValues_WhenStepsNorthSouthAndWest() {
                char[] walk_array = {'s', 'w', 's', 'n', 'n', 'n'};
                int expectedSouthValue = 2;
                int expectedWestValue = 1;
                int expectedNorthValue = 3;

                TenMinuteWalk walk = new TenMinuteWalk();
                walk.assess(walk_array);
                assertEquals("Evaluates the steps south", expectedSouthValue, walk.getSouth());
                assertEquals("Evaluates the steps west", expectedWestValue, walk.getWest());
                assertEquals("Evaluates the steps north", expectedNorthValue, walk.getNorth());
        }

        @Test
        public void shouldIncreaseDirectionValues_WhenStepsEastNorthSouthAndWest() {
                char[] walk_array = {'s', 'w', 's', 'n', 'n', 'n', 'e', 'e', 'e', 'e'};
                int expectedSouthValue = 2;
                int expectedWestValue = 1;
                int expectedNorthValue = 3;
                int expectedEastValue = 4;

                TenMinuteWalk walk = new TenMinuteWalk();
                walk.assess(walk_array);
                assertEquals("Evaluates the steps south", expectedSouthValue, walk.getSouth());
                assertEquals("Evaluates the steps west", expectedWestValue, walk.getWest());
                assertEquals("Evaluates the steps north", expectedNorthValue, walk.getNorth());
                assertEquals("Evaluates the steps north", expectedEastValue, walk.getEast());
        }

        @Test
        public void shouldReturnFalse_WhenWalkDoesNotReturnToStartingPoint() {
                char[] walk_array = {'w', 's', 'e', 'n', 'n', 'e', 's', 'w', 'w', 'w'};
                TenMinuteWalk walk = new TenMinuteWalk();
                assertFalse("Returns false if the walk doesn't return to the starting point", walk.assess(walk_array));
        }

}
