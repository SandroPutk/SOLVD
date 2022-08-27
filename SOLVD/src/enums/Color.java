public enum Color {
    RED(5), GREEN(10), BLUE(15);
    private final int value;
    Color(int value)
    {
        this.value = value;
    }
    public static Color valueOf(int value)
    {
        for (Color color : values()) {
            if (color.value == value) {
                return color;
            }
        }
        return null;
    }
}