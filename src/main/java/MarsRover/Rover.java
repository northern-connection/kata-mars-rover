package MarsRover;

import java.util.Objects;

class Rover {
    private Point point;
    private Direction direction;

    public Rover(int x, int y, String direction) {
        this.direction = Direction.create(direction);
        setPoint(x,y);
    }

    private void setPoint(int x, int y) {
        point = new Point(x, y);
    }

    public void receive(String commands) {
        if (commands.isEmpty()) {
            return;
        }

        if (commands.equals("b")) {
            setPoint(getX(),getY() - 1);
        } else {
            if (direction.equals(Direction.EAST)) {
                setPoint(getX() + 1, getY());
            } else if (direction.equals(Direction.SOUTH)) {
                setPoint(getX(), getY() - 1);
            } else if (direction.equals(Direction.WEST)) {
                setPoint(getX() - 1, getY());
            } else {
                setPoint(getX(), getY() + 1);
            }
        }
    }

    private int getX() {
        return point.getX();
    }

    private int getY() {
        return point.getY();
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
