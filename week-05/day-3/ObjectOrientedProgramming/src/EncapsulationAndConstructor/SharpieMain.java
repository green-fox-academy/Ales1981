package EncapsulationAndConstructor;

public class SharpieMain {
    public static void main(String[] args){
        Sharpie blue = new Sharpie("blue", 2.5f);
        Sharpie red = new Sharpie("red",1);
        Sharpie green = new Sharpie("green",2);
        Sharpie yellow = new Sharpie("yellow",1.5f);
        SharpieSet set = new SharpieSet("Set");
        set.addSharpie(blue);
        set.addSharpie(red);
        set.addSharpie(green);
        set.addSharpie(yellow);
        System.out.println(set.toString());
        blue.use();
        red.use();
        yellow.use();
        blue.use();
        red.use();
        System.out.println(set.toString());
        set.countUsable();
        blue.use();
        set.removeTrash();
        System.out.println(set.toString());
    }
}
