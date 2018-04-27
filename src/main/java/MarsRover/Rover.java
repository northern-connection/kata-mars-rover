package MarsRover;

import java.util.Objects;

class Rover {
    private int x;
    private int y;
    private String direction;

    public Rover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void receive(String commands) {
        if (commands.isEmpty()) {
            return;
        }
        this.y += 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rover rover = (Rover) o;
        return x == rover.x &&
                y == rover.y &&
                Objects.equals(direction, rover.direction);
    }

    @Override
    public int hashCode() {

        return Objects.hash(x, y, direction);
    }
}
