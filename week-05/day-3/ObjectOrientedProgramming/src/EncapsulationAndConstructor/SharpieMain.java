package EncapsulationAndConstructor;

public class SharpieMain {
    public static void main(String[] args){
        Sharpie sharpie1 = new Sharpie("blue", 2.5f);
        sharpie1.use();

        Sharpie sharpie2 = new Sharpie("red",1);
        sharpie2.use();
        sharpie1.use();
        sharpie1.use();
        sharpie2.use();
    }
}
