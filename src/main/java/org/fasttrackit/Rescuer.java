package org.fasttrackit;

public class Rescuer {
    private String name;
    private double money;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void feed(Animal animal, Food food){
        System.out.println(this.name+" just gave some "+food.getName()+" food to "+animal.getName()+".");
        System.out.println();

        double hungerLevel = animal.getHungerLevel();
        hungerLevel--;
        animal.setHungerLevel(hungerLevel);

        System.out.println(animal.getName()+"`s hunger level is "+animal.getHungerLevel());

        if (food.getName().equals(animal.getFavoriteFoodName())) {
            animal.setHappinessLevel(animal.getHappinessLevel() + 1);
            System.out.println(animal.getName() + "`s happiness level is now " + animal.getHappinessLevel());
        }
        System.out.println();
    }


    public void entertain(Animal animal, EntertainmentActivity activity){
        System.out.println(this.name+" just played "+activity.getName()+" with "+animal.getName()+".");

      int increment;
        if (activity.getName().equals(animal.getFavoriteActivityName())) {
            increment = 2;
        } else {
            increment = 1;
        }

        animal.setHappinessLevel(animal.getHappinessLevel() + increment);

        System.out.println(animal.getName()+"`s happiness level is "+animal.getHappinessLevel());
        System.out.println();
    }
}
