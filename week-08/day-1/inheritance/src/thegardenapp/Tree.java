package thegardenapp;

public class Tree extends Plant {

    public Tree(String color){
        this.color = color;
        this.type = "tree";
        this.waterNeed = 10;
        this.waterAbsorb = 0.4;
    }
}
