package ru.geekbrains;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String cat_nickname = "Барсик";
        String dog_nickname = "Шарик";
        System.out.println("Тернировка кота ");
        Cat cat1 = new Cat(cat_nickname, 3);
        System.out.println("Бег : " + cat1.run(150));
        System.out.println("Прыжки : " + cat1.jump(2));
        System.out.println("Плавание : " + cat1.swim(3));
        System.out.println("Тренировка собаки");
        Dog dog1 = new Dog(dog_nickname, 4);
        System.out.println("maxRun = " + dog1.getMaxRun());
        System.out.println("Бег : " + dog1.run(150));
        System.out.println("Прыжки : " + dog1.jump(1));
        System.out.println("Плавание : " + dog1.swim(7));

    }
}
