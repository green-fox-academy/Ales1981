package main.java.music;

public class BassGuitar extends StringedInstrument{
    public BassGuitar() {
        this.name = "Bass guitar";
        this.numOfStrings = 4;
    }

    public BassGuitar(int numOfStrings){
        this.numOfStrings = numOfStrings;
    }

    @Override
    public void sound() {
        System.out.println("Duum-duum-duum");
    }
}
