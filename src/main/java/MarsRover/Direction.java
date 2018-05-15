package MarsRover;

public enum Direction {
    NORTH,
    SOUTH,
    EAST {
        public Point forward(Point point) {
            return point.move(1, 0);
        }
    },
    WEST;

    public static Direction from(String direction) {
        switch (direction) {
            case "N":
                return Direction.NORTH;
            case "S":
                return Direction.SOUTH;
            case "E":
                return Direction.EAST;
        }
        return Direction.WEST;
    }

    @Override
    public String toString() {
        return "Direction{}";
    }

    public Point forward(Point point) {
        return new Point(0,0);
    }
}
