package MarsRover;

import java.util.Objects;

class Rover {
    private int x;
    private int y;
    private Point point;
    private Direction newDirection;

    public Rover(int x, int y, String direction) {
        this.point = new Point(x, y);
        this.newDirection = Direction.from(direction);
    }

    public void receive(String commands) {
        if (commands.isEmpty()) {
            return;
        }

        if (commands.equals("b")) {
            this.move(0, -1);

        } else {
            if (newDirection == Direction.EAST) {
                this.move(1, 0);
            } else if (newDirection == Direction.SOUTH) {
                this.move(0, -1);
            } else if (newDirection == Direction.WEST) {
                this.move(-1, 0);
            } else {
                this.move(0, 1);
            }
        }
    }

    private void move(int incX, int incY) {
        this.point = new Point(this.point.getX() + incX, this.point.getY() + incY);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rover rover = (Rover) o;
        return Objects.equals(point, rover.point) &&
                newDirection == rover.newDirection;
    }

    @Override
    public int hashCode() {

        return Objects.hash(point, newDirection);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
