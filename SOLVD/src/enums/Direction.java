
public enum Direction {
    Right, Left, Up, Down;
    private Direction opposite;

    public Direction getOpposite(){
        return opposite;
    }
    static {
        Right.opposite = Left;
        Left.opposite = Right;
        Up.opposite = Down;
        Down.opposite = Up;
    }
}