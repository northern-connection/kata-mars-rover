package MarsRover;

import java.util.Objects;

class Rover {
    private int x;
    private int y;
    private Direction newDirection;

    public Rover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.newDirection = Direction.from(direction);
    }

    public void receive(String commands) {
        if (commands.isEmpty()) {
            return;
        }

        if (commands.equals("b")) {
            this.y -= 1;
        } else {
            if (newDirection == Direction.EAST) {
                this.setPoint(this.x + 1, this.y);
            } else if (newDirection == Direction.SOUTH) {
                this.y -= 1;
            } else if (newDirection == Direction.WEST) {
                this.x -= 1;
            } else {
                this.y += 1;
            }
        }
    }

    private void setPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rover rover = (Rover) o;
        return x == rover.x &&
                y == rover.y &&
                newDirection == rover.newDirection;
    }

    @Override
    public int hashCode() {

        return Objects.hash(x, y, newDirection);
    }

    @Override
    public String toString() {
        return "Rover{" +
                "x=" + x +
                ", y=" + y +
                ", newDirection=" + newDirection +
                '}';
    }
}
