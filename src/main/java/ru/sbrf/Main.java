package ru.sbrf;

public class Main {

    public static void main(String[] args) {
        Animal cat1 = new Animal();
        cat1.set("мяукает", "двигается", "жрёт", "лазает", "не плавает");
        Animal dog1 = new Animal();
        dog1.set("гавкает", "двигается", "сырое мясо", "не лазает", "плавает");

        System.out.println(dog1.Text());
    }
}
