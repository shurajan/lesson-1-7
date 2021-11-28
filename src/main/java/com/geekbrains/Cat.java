package com.geekbrains;


public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        //Сытый кот не ест
        if (!satiety) {
            satiety = p.decreaseFood(appetite);
        }
    }

    public void info(){
        System.out.print("cat: " + name);
        System.out.print(" appetite: " + appetite);
        System.out.println(" satiety: " + satiety);
    }
}