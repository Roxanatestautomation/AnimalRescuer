package org.fasttrackit;

import java.time.LocalDateTime;

public class App
{
    public static void main( String[] args ) {

        Rescuer rescuer = new Rescuer();
        rescuer.name = "John";
        rescuer.money = 300;

        Animal animal = new Animal();
        animal.name = "Chaika";
        animal.age = 4.5;
        animal.healthLevel = 10;
        animal.happinessLevel = 10;
        animal.favoriteActivityName = "Running";
        animal.favoriteFoodName = "Pizza";

        EntertainmentActivity activity = new EntertainmentActivity();
        activity.name = "Running";

        Food food = new Food();
        food.name = "Purina";
        food.quantity = 10;
        food.price = 79.99;
        food.inStock = true;
        food.expiryDate = LocalDateTime.of(2018, 12, 31, 12, 0, 0);

        MedicalStaff medic = new MedicalStaff();
        medic.name = "Dr. Who";
        medic.specialization = "General Medicine";

        Game game = new Game();
        game.rescuer = rescuer;
        game.animal = animal;
        game.medic = medic;
    }
}
