package MarsRover;

import java.util.Objects;

class Rover {
    private int x;
    private int y;
    private String direction;

    public Rover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.setDirection(direction);
    }

    public void receive(String commands) {
        if (commands.isEmpty()) {
            return;
        }

        if (commands.equals("b")) {
            this.y -= 1;
        } else {
            if (getDirection().equals("E")) {
                this.x += 1;
            } else if (getDirection().equals("S")) {
                this.y -= 1;
            } else if (getDirection().equals("W")) {
                this.x -= 1;
            } else {
                this.y += 1;
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rover rover = (Rover) o;
        return x == rover.x &&
                y == rover.y &&
                Objects.equals(getDirection(), rover.getDirection());
    }

    @Override
    public int hashCode() {

        return Objects.hash(x, y, getDirection());
    }

    @Override
    public String toString() {
        return "Rover{" +
                "x=" + x +
                ", y=" + y +
                ", direction='" + getDirection() + '\'' +
                '}';
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
