package MarsRover;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MarsRoverTest {

    @Test
    public void stays_in_the_position_when_receives_an_empty_command_sequence() {
        Rover rover = new Rover(0,0,"N");

        rover.receive("");

        assertThat(rover.x, is(0));
        assertThat(rover.y, is(0));
        assertThat(rover.direction, is("N"));
    }
}
