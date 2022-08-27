package animalClass;

public class Cat extends Animal {
    private int yearsOld;
    private String catColor;

    public Cat(String name, int feet, int year, String catColor, int yearsOld){
        super(year, feet, name);
        this.yearsOld=yearsOld;
        this.catColor=catColor;
    }
    public void setYearsOld(int yearsOld) {
        this.yearsOld=yearsOld;
    }
    public void setCatColor(String catColor) {
        this.catColor=catColor;
    }
    public int getYearsOld() {
        return yearsOld;
    }
    public String getCatColor() {
        return catColor;
    }
    @Override
    public void Moving() {
        System.out.println(getName() +" Is Moving From " + " aviarry1 " + " To " + " aviarry2 ");
    }
    public String toString() {
        return super.getFeet() +"\t"+super.getName()+"\t"+super.getYear()+"\t"+getYearsOld()+"\t"+getCatColor();
    }
}