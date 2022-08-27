package animalClass;

public class Monkey extends Animal {
    private int numOfHand;
    private int numberOfHandFingers;
    private double height;
    private String colorOfSkin;

    public Monkey(int year, int feet, String name, int numOfHand, int numberOfHandFingers, double height, String colorOfSkin) {
        super(year,feet,name);
        this.numOfHand=numOfHand;
        this.numberOfHandFingers=numberOfHandFingers;
        this.height=height;
        this.colorOfSkin=colorOfSkin;
    }
    public void setNumOfHand(int numOfHand) {
        this.numOfHand=numOfHand;
    }
    public void setNumberOfHandFingers(int numberOfHandFingers) {
        this.numberOfHandFingers=numberOfHandFingers;
    }
    public void setHeight(double height) {
        this.height=height;
    }
    public void setColorOfSkin(String colorOfSkin) {
        this.colorOfSkin=colorOfSkin;
    }
    public int getNumOfHand() {
        return numOfHand;
    }
    public int getNumberOfHandFingers() {
        return numberOfHandFingers;
    }
    public double getHeight() {
        return height;
    }
    public String getColorOfSkin() {
        return colorOfSkin;
    }

    @Override
    public void Moving() {
        System.out.println(getName() +" Is Moving From " + " aviarry1 " + " To " + " aviarry2 ");
    }
    public String toString() {
        return super.getFeet() +"\t"+super.getName()+"\t"+super.getYear()+"\t"+getNumOfHand()+"\t"+getNumberOfHandFingers()+"\t"+ getHeight()+"\t"+getColorOfSkin();
    }


}