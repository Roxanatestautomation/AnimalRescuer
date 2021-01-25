package org.fasttrackit;

public class Fish extends Animal {

    private int wingsCount;

    public int getWingsCount() {
        return wingsCount;
    }

    public void setWingsCount(int wingsCount) {
        this.wingsCount = wingsCount;
    }

    public void expressJoy(){
        System.out.println(getName() + " is swimming playfully.");
    }
}
