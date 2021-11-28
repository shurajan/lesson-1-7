package com.geekbrains;

public class HomeWorkApp {
    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Cat 1", 10);
        cats[1] = new Cat("Cat 2", 15);
        cats[2] = new Cat("Cat 3", 5);
        cats[3] = new Cat("Cat 4", 5);
        cats[4] = new Cat("Cat 5", 5);

        Plate plate = new Plate(27);

        System.out.println("============Первая кормежка============");
        plate.info();
        for (Cat cat:cats){
            cat.eat(plate);
            cat.info();
        }
        plate.info();

        System.out.println("============Вторая кормежка============");
        plate.increaseFood(15);

        plate.info();
        for (Cat cat:cats){
            cat.eat(plate);
            cat.info();
        }
        plate.info();

    }
}
