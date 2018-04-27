package MarsRover;

public enum Direction {
    NORTH, EAST, SOUTH, WEST;

    public static Direction create(String direction) {
        if (direction.equals("E"))
            return EAST;
        if (direction.equals("S"))
            return SOUTH;
        if (direction.equals("W"))
            return WEST;
        return NORTH;
    }
}
