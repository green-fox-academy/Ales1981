package EncapsulationAndConstructor;

import java.util.Random;

public class Animal {
    private static int idGenerator;
    private int hunger;
    private int thirst;
    private int id;
    private Random random = new Random();

    public Animal(){
        this.hunger = random.nextInt(50);
        this.thirst = random.nextInt(50);
        this.id = ++idGenerator;
    }

    public Animal ( int hunger,int thirst){
        this.hunger = hunger;
        this.thirst = thirst;
        this.id = ++idGenerator;
    }

    public void eat(){
        hunger--;
    }

    public void drink(){
        thirst--;
    }

    public void play(){
        hunger++;
        thirst++;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getId() {
        return id;
    }
}
