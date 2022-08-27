package animalClass;

public class Zebra extends Animal{
    private String skin;
    private String gender;
    private double weight;

    public Zebra(int year, int feet, String name, String skin, String gender, double weight) {
        super(year, feet,name);
        this.skin=skin;
        this.gender=gender;
        this.weight=weight;
    }
    public void setSkin(String skin) {
        this.skin=skin;
    }
    public void setGender(String gender) {
        this.gender=gender;
    }
    public void setWeight(double weight) {
        this.weight=weight;
    }
    public String getSkin() {
        return skin;
    }
    public String getGender() {
        return gender;
    }
    public double getWeight() {
        return weight;
    }
    @Override
    public void Moving() {
        System.out.println(getName() +" Is Moving From " + " aviarry1 " + " To " + " aviarry2 ");
    }
    public String toString() {
        return super.getFeet() +"\t"+super.getName()+"\t"+super.getYear()+"\t"+getSkin()+"\t"+getGender()+"\t"+getWeight();
    }
}