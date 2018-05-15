package MarsRover;

public enum Direction {
    NORTH {
        public Point forward(Point point) {
            return point.move(0, 1);
        }
    },
    SOUTH {
        public Point forward(Point point) {
            return point.move(0, -1);
        }
    },
    EAST {
        public Point forward(Point point) {
            return point.move(1, 0);
        }
    },
    WEST {
        public Point forward(Point point) {
            return point.move(-1, 0);
        }
    };

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

    public abstract Point forward(Point point);
}
