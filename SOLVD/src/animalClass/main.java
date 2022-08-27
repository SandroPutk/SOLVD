package animalClass;

public class main {

    public static void main(String[] args) {

        Dog dog = new Dog("2", 16, "jack", 4, 2010);
        System.out.println(dog);
        dog.Moving();
        System.out.println("\n");

        Cat cat = new Cat("cat1", 4 , 2020 , "grey", 2);
        System.out.println(cat);
        cat.Moving();
        System.out.println("\n");

        Zebra zebra = new Zebra(2018, 4, "zebra1" , "black and white ", " female ", 123.45);
        System.out.println(zebra);
        zebra.Moving();
        System.out.println("\n");

        Monkey monkey = new Monkey(2015, 4, "monkey1", 2, 10, 153.30, "black");
        System.out.println(monkey);
        monkey.Moving();
    }

}