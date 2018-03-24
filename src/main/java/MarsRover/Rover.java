package MarsRover;

class Rover {
    public int x;
    public int y;
    public String direction;

    public Rover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void receive(String commands) {
        if (commands.isEmpty()) {
            return;
        }
        this.y += 1;
    }
}
