public enum Direction_2 {
    Right, Left, Up, Dowm;

    public Direction getOpposite()
    {
        switch (this){
            case Right:
                return Left.getOpposite();
            case Left:
                return Right.getOpposite();
            case Up:
                return Dowm.getOpposite();
            case Dowm:
                return Up.getOpposite();
            default: //This will never happen
                return null;
        }
    }
}