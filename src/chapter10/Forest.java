package chapter10;

public class Forest {
    public static void main(String[] args) {
        Animal [] animals = new Animal[4];
        animals[0] = new Fish();
        animals[1] = new Bird();
        animals[2] = new Frog();
        animals[3] = new Animal();

        for (Animal animal: animals){
            animal.move(); 
        }
    }
}
