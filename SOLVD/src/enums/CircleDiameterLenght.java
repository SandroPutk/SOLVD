public enum CircleDiameterLenght {
    BIG(10), LARGE(20),HUGE(30),OVERWHELMING(40);
    private int Lenght ;

    static
    {
        System.out.println("static block ");
    }
    {
        System.out.println("instance block");
    }
    private CircleDiameterLenght(int Lenght)
    {
        this.Lenght = Lenght;
        System.out.println(Lenght);
    }
    private CircleDiameterLenght()
    {
        this.Lenght = 20;
        System.out.println(Lenght);
    }
    public int getLenght() {
        return Lenght;
    }
}
