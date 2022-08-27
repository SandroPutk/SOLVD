package animalClass;

public class Dog extends Animal{
    private String ear;
    private int numberOfFingers;


    public Dog(String ear, int numberOfFingers, String name, int feet, int year) {
        super(year, feet, name);
        this.ear=ear;
        this.numberOfFingers=numberOfFingers;
    }
    public void setEar(String ear) {
        this.ear=ear;
    }
    public void setnumberOfFingers(int numberOfFingers) {
        this.numberOfFingers=numberOfFingers;
    }
    public String getEar(){
        return ear;
    }
    public int getNumberOfFingers() {
        return numberOfFingers;
    }

    @Override
    public void Moving() {
        System.out.println(getName() +" Is Moving From " + " aviarry1 " + " To " + " aviarry2 ");
    }
    public String toString() {
        return super.getFeet() +"\t"+super.getName()+"\t"+super.getYear()+"\t"+getEar()+"\t"+getNumberOfFingers();
    }
}