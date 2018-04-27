package MarsRover;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MarsRoverTest {

    @Test
    public void stays_in_the_position_when_receives_an_empty_command_sequence() {
        Rover rover = new Rover(0, 0, "N");

        rover.receive("");

        assertThat(rover, is(new Rover(0, 0, "N")));
    }

    @Test
    public void forwards_facing_north() {
        Rover rover = new Rover(0, 0, "N");

        rover.receive("f");

        assertThat(rover, is(new Rover(0, 1, "N")));
    }

    @Test
    public void forwards_facing_east() {
        Rover rover = new Rover(1, 1, "E");

        rover.receive("f");

        assertThat(rover, is(new Rover(2, 1, "E")));
    }

    @Test
    public void forwards_facing_south() {
        Rover rover = new Rover(2, 1, "S");

        rover.receive("f");

        assertThat(rover, is(new Rover(2, 0, "S")));
    }

    @Test
    public void forwards_facing_west() {
        Rover rover = new Rover(2, 2, "W");

        rover.receive("f");

        assertThat(rover, is(new Rover(1, 2, "W")));
    }

    @Test
    public void backwards_facing_north() {
        Rover rover = new Rover(2, 2, "N");

        rover.receive("b");

        assertThat(rover, is(new Rover(2, 1, "N")));
    }
}
