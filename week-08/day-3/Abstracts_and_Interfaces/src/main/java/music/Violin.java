package main.java.music;

public class Violin extends StringedInstrument {
    public Violin() {
        this.name = "Violin";
        this.numOfStrings = 4;

    }

    @Override
    public void sound() {
        System.out.println("Screech");
    }
}
