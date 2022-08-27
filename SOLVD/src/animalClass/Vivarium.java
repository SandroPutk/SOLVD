package animalClass;

public class Vivarium {
    private int area;
    private Animal[] animals = new Animal[4];
    private int quantity = 0;
    private String type;

    public Vivarium(int area, Animal[] animals, String type){
        this.animals = animals;
        this.area = area;
        this.type = type;
    }
    public Vivarium(int area, String type){
        this.area = area;
        this.type = type;
    };

    public void addAnimal(Animal animal){
        for(int i = 0; i < animals.length; i++ ){
            if(animals[i] == null){
                animals[i] = animal;
                break;
            }
            quantity++;
        }
    }

    public int getQuantity() {
        return quantity;
    }
    public String getType() {
        return type;
    }

    public void removeAnimal(Animal animal){
        for (int i = 0; i < animals.length; i++) {
            if(animals[i].getName() == animal.getName()){
                animals[i] = null;
                quantity--;
            }
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void displayAnimals(){
        for (Animal animal: animals) {
            System.out.println(animal);
            System.out.println("-----------------");
        }
    }
}