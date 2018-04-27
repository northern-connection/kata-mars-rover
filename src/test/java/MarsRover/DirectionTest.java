package MarsRover;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DirectionTest {

    @Test
    public void create_directions() {
        assertThat(Direction.create("N"), is(Direction.NORTH));
        assertThat(Direction.create("E"), is(Direction.EAST));
        assertThat(Direction.create("S"), is(Direction.SOUTH));
        assertThat(Direction.create("W"), is(Direction.WEST));
    }
}
