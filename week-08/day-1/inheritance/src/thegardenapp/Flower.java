package thegardenapp;

public class Flower extends Plant {

    public Flower(String color){
        this.color = color;
        this.type = "flower";
        this.waterNeed = 5;
        this.waterAbsorb = 0.75;
    }
}
