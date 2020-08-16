package EncapsulationAndConstructor;

public class Sharpie {
    String color;
    float width;
    float inkAmount = 100f;

    public Sharpie(String color, float width){
        this.color = color;
        this.width = width;
        System.out.println("Your new "+color+" sharpie has width "+width);


    }

    public void use(){
        System.out.println("Writing with this "+color+" sharpie costs you "+width+" of ink !");
        inkAmount = inkAmount-width;
        System.out.println("in "+color+" sharpie left "+inkAmount+" of ink");
    }

}
