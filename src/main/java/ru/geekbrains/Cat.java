package ru.geekbrains;

public class Cat extends Animal implements Runnable{

    {
        id = (count++) + 1;
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void animalInfo() {
        System.out.println("Имя собаки: " + name);
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не плавает!");
    }

    @Override
    public void run(int distance) {

        if (distance <= 200 && distance >= 0) {
            System.out.println(name + " пробежал: " + distance);
        } else {
            System.out.println("Слишком большое расстояние для кота!");
        }

    }

    public static void countCat() {
        System.out.println("Кошек всего: " + count);
    }
}
