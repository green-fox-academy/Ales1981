package thegardenapp;

public class GardenApp {
    public static void main(String[] args) {
        Garden garden = new Garden();
        Flower yellow = new Flower("yellow");
        Flower blue = new Flower("blue");
        Tree orange = new Tree("orange");
        Tree purple = new Tree("purple");
        garden.addPlant(yellow);
        garden.addPlant(blue);
        garden.addPlant(orange);
        garden.addPlant(purple);
        garden.status(garden);
        garden.watering(40);
        garden.status(garden);
        garden.watering(70);
        garden.status(garden);
    }
}
