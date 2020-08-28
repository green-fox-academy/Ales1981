package EncapsulationAndConstructor;

public class Sharpie {
    String color;
    float width;
    float inkAmount = 6f;

    public Sharpie(String color, float width){
        this.color = color;
        this.width = width;
        System.out.println("Your new "+color+" sharpie has width "+width);
    }
    public void use(){
        if (inkAmount < width){
            System.out.println("You can not write! This "+color+" sharpie has not enough ink!");
        }else {
            System.out.println("Writing with "+color+" sharpie costs you "+width+" of ink!");
            inkAmount -= width;
            System.out.println("This "+color+" sharpie has "+inkAmount+" of ink.");
        }
    }
}
