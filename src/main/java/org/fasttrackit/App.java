package org.fasttrackit;

import java.time.LocalDateTime;

public class App
{
    public static void main( String[] args ) {
        Rescuer rescuer = new Rescuer();
        rescuer.setName("Jhon");
        rescuer.setMoney(300);

        Animal animal = new Animal();
        animal.setName("Chaika");
        animal.setAge(4.5);
        animal.setHealthLevel(10);
        animal.setHappinessLevel(10);
        animal.setFavoriteActivityName("Running");
        animal.setFavoriteFoodName("Pizza");

        EntertainmentActivity activity = new EntertainmentActivity("Running");

        Food food = new Food("Purina");
        food.setQuantity(10);
        food.setPrice(79.99);
        food.setInStock(true);
        food.setExpiryDate(LocalDateTime.of(2018, 12, 31, 12, 0, 0));

        MedicalStaff medic = new MedicalStaff();
        medic.setName("Dr Who");
        medic.setSpecialization("General Medicine");

        Game game = new Game();
        game.setRescuer(rescuer);
        game.setAnimal(animal);
        game.setMedic(medic);

        rescuer.feed(animal,food);
        rescuer.entertain(animal, activity);
    }
}
