package animalClass;

public abstract class Animal {

    private int year;

    private int feet;

    private String name;


    public Animal(int year, int feet, String name) {
        this.year=year;
        this.name=name;
        this.feet=feet;
    }

    public void setYear(int year) {
        this.year=year;
    }
    public void setName(String name) {
        this.name=name;
    }
    public void setFeet(int feet) {
        this.feet=feet;
    }
    public int getYear() {
        return year;
    }
    public int getFeet() {
        return feet;
    }
    public String getName() {
        return name;
    }

    public abstract void Moving();

}
