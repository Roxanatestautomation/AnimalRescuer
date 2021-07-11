package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private Rescuer rescuer;
    private Animal animal;
    private MedicalStaff medic;

    private List<Food> availableFood = new ArrayList<>();
    private EntertainmentActivity[] availableActivities = new EntertainmentActivity[10];

    private void initFood() {
        Food dogFood = new Food("Purina");
        Food fishFood = new Food("Tetra");
        availableFood.add(dogFood);
        availableFood.add(fishFood);
    }

    private void initActivities(){
        EntertainmentActivity activity1 = new EntertainmentActivity("Running");
        EntertainmentActivity activity2 = new EntertainmentActivity("Swimming");
        availableActivities[0] = activity1;
        availableActivities[1] = activity2;
    }

    public void start() {
        initFood();
        initActivities();

        displayAvailableFood();
        displayAvailableActivities();
    }

    private void displayAvailableFood() {
        System.out.println("Available food:");
        for (Food food : availableFood) {
            if (food != null) {
                System.out.println(food.getName());
            }
        }
    }

    private void displayAvailableActivities() {
        System.out.println("Available activities:");
        for (int i = 0; i < availableActivities.length; i++) {
            if (availableActivities[i] != null) {
                System.out.println(availableActivities[i].getName());
            }
        }
    }

    public Rescuer getRescuer() {
        return rescuer;
    }

    public void setRescuer(Rescuer rescuer) {
        this.rescuer = rescuer;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public MedicalStaff getMedic() {
        return medic;
    }

    public void setMedic(MedicalStaff medic) {
        this.medic = medic;
    }
}
