package ru.geekbrains;

import java.util.Random;

public class Dog extends Animal{

    protected int maxRun = 500;
    protected float maxJump = 0.5f;
    protected int maxSwim = 10;

    @Override
    public int getMaxRun() {
        return maxRun;
    }

    @Override
    public void setMaxRun(int maxRun) {
        int maxRunInterveal = maxRun/3;
        Random random = new Random();
        int somerandom = random.nextInt(maxRunInterveal);
        this.maxRun = maxRun + somerandom ;
    }

    //@Override
    public float getMaxJump() {
        return maxJump;
    }

    public void setMaxJump(float maxJump) {
        this.maxJump = maxJump;
    }

    @Override
    public int getMaxSwim() {
        return maxSwim;
    }

    @Override
    public void setMaxSwim(int maxSwim) {
        this.maxSwim = maxSwim;
    }


    public Dog(String nickname, int age) {
        super(nickname, age);
        setMaxRun(this.maxRun);
        setMaxJump(this.maxJump);
        setMaxSwim(this.maxSwim);
    }

    @Override
    public boolean run(int distance) {
        return distance <= maxRun;
    }

    @Override
    public boolean swim(int distance) {
        return distance <= maxSwim;
    }

    @Override
    public boolean jump(int distance) {
        return distance <= maxJump;
    }
}
