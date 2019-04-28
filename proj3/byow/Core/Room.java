package byow.Core;

public class Room {

    public int width;
    public int height;
    public Position pos; // Bottom left position.

    public Room(Position pos, int width, int height) {
        this.width = width;
        this.height = height;
        this.pos = pos;
    }
}
