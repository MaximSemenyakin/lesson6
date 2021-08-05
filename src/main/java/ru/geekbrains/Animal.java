package ru.geekbrains;

public class Animal {

    protected String name;
    protected static int count;
    protected int id;
    {
        id = (count++) + 1;
    }


    public Animal(String name) {
        this.name = name;
    }

    public void animalInfo() {
        System.out.println("Животное: " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void countAnimal() {
        System.out.println("Животных всего: " + count);
    }
}
