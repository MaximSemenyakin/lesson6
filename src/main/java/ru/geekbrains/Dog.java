package ru.geekbrains;

public class Dog extends Animal implements Runnable{

    {
        id = (count++) + 1;
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void animalInfo() {
        System.out.println("Имя кота: " + name);
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10 && distance >= 0) {
            System.out.println(name + " проплыла: " + distance);
        } else {
            System.out.println(name + " столько не проплывет!");
        }
    }

    @Override
    public void run(int distance) {
        if (distance <= 500 && distance >= 0) {
            System.out.println(name + " пробежала: " + distance);
        } else {
            System.out.println("Слишком большое расстояние для " + name);
        }
    }

    public static void countDog() {
        System.out.println("Собак всего: " + count);
    }
}
