package EncapsulationAndConstructor;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    String name;
    private ArrayList<Sharpie> sharpies;

    public SharpieSet(String name){
        sharpies = new ArrayList<>();
        this.name = name;
    }
    public void addSharpie(Sharpie sharpie){
        sharpies.add(sharpie);
    }
    @Override
    public String toString() {
        String mainDescription = "SharpieSet "+this.name+" has "+sharpies.size()+" sharpies.\n";
        String sharpieList = "";
        for ( Sharpie sharpie : sharpies ) {
            sharpieList += " - "+sharpie.color+" sharpie has "+sharpie.inkAmount+" of ink.Writing costs you "
                    +sharpie.width+" of ink."+"\n";
        }
        return mainDescription+sharpieList;
    }
    public void countUsable() {
        int usable = 0;
        int unUsable = 0;
        for ( Sharpie sharpie : sharpies ) {
            if ( sharpie.inkAmount > sharpie.width){
                usable++;
            } else {
                unUsable++;
            }
        }
        System.out.println("There are "+usable+" usable and "+unUsable+" unusable sharpies in the set.");
    }
    public void removeTrash(){
        List<Sharpie> toTrash = new ArrayList<>();
        for (Sharpie sharpie : sharpies) {
            if ( sharpie.inkAmount < sharpie.width ){
                System.out.println("Unusable "+sharpie.color+" sharpie has been removed from the set.");
                toTrash.add(sharpie);
            }
        }
        sharpies.removeAll(toTrash);
    }
}
