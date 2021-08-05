package ru.geekbrains;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Elephant");

        Dog dog1 = new Dog("Chuppi");
        Cat cat1 = new Cat("Barsik");

        animal.animalInfo();
        dog1.animalInfo();
        cat1.animalInfo();

        cat1.run(450);
        dog1.run(400);
        dog1.swim(9);
        cat1.swim(300);



    }


}
