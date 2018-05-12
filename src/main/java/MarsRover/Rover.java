package MarsRover;

import java.util.Objects;

class Rover {
    private Point point;
    private Direction direction;

    public Rover(int x, int y, String direction) {
        this.direction = Direction.create(direction);
        point = new Point(x, y);
    }

    public void receive(String commands) {
        if (commands.isEmpty()) {
            return;
        }

        if (commands.equals("b")) {
            point = direction.moveBackwards(point);
        } else {
            point = direction.moveForward(point);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rover rover = (Rover) o;
        return Objects.equals(point, rover.point) &&
                direction == rover.direction;
    }

    @Override
    public int hashCode() {

        return Objects.hash(point, direction);
    }

    @Override
    public String toString() {
        return "Rover{" +
                "point=" + point +
                ", direction=" + direction +
                '}';
    }
}
