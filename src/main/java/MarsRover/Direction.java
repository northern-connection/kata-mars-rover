package MarsRover;

public enum Direction {
    NORTH {
        public Point moveForward(Point point) {
            return point.addY(1);
        }
    },
    EAST {
        public Point moveForward(Point point) {
            return point.addX(1);
        }
    },
    SOUTH {
        public Point moveForward(Point point) {
            return point.addY(-1);
        }
    },
    WEST {
        public Point moveForward(Point point) {
            return point.addX(-1);
        }
    };

    public static Direction create(String direction) {
        if (direction.equals("E"))
            return EAST;
        if (direction.equals("S"))
            return SOUTH;
        if (direction.equals("W"))
            return WEST;
        return NORTH;
    }

    public abstract Point moveForward(Point point);

    public Point moveBackwards(Point point) {
        return point.addY(-1);
    }
}
