package MarsRover;

import java.util.Objects;

class Rover {
    private Point point;
    private Direction direction;

    public Rover(int x, int y, String direction) {
        this.point = new Point(x, y);
        this.direction = Direction.from(direction);
    }

    public void receive(String commands) {
        if (commands.isEmpty()) {
            return;
        }

        if (commands.equals("b")) {
            this.point = point.move(0, -1);

        } else {
            if (direction == Direction.EAST) {
                this.point = direction.move(point);
            } else if (direction == Direction.SOUTH) {
                this.point = point.move(0, -1);
            } else if (direction == Direction.WEST) {
                this.point = point.move(-1, 0);
            } else {
                this.point = point.move(0, 1);
            }
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
}
