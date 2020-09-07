package main.java.music;

public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar() {
        this.name = "Electric guitar";
        this.numOfStrings = 6;
    }

    public ElectricGuitar(int numOfStrings){
        this.numOfStrings = numOfStrings;
    }

    @Override
    public void sound() {
        System.out.println("Twang");
    }
}
