package ru.geekbrains;

public class Cat extends Animal{

    protected int maxRun = 200;
    protected float maxJump = 2f;
    //protected int maxSwim = 0;

    public Cat(String nickname, int age) {
        super(nickname, age);
    }

    @Override
    public boolean run(int distance) {
        return distance <= maxRun;
    }

    @Override
    public boolean swim(int distance) {
        System.out.println("Вы что очумели? Котэ не хочет плавать");
        return false;
    }

    @Override
    public boolean jump(int distance) {
        return distance <= maxJump;
    }
}
