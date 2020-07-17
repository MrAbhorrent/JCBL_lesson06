package ru.geekbrains;

public class Animal {
    protected String nickname;
    protected int age;
    protected int maxRun;
    protected float maxJump;
    protected int maxSwim;

    public Animal(String nickname, int age) {
        setNickname(nickname);
        setAge(age);
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age <=40) {
            this.age = age;
        }
    }

    public boolean run(int distance) {

        return distance <= maxRun;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public void setMaxRun(int maxRun) {
        this.maxRun = maxRun;
    }

    public float getMaxJump() {
        return maxJump;
    }

    public void setMaxJump(int maxJump) {
        this.maxJump = maxJump;
    }

    public int getMaxSwim() {
        return maxSwim;
    }

    public void setMaxSwim(int maxSwim) {
        this.maxSwim = maxSwim;
    }

    public boolean swim(int distance) {

        return distance <= maxSwim;
    }

    public boolean jump(int distance) {

        return distance <= maxJump;
    }
}
