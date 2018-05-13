package cn.itcase.demo44;

public abstract class Animal {
    public abstract void eat();
    public static Animal getInstance(){
        return new Cat();
    }
}
