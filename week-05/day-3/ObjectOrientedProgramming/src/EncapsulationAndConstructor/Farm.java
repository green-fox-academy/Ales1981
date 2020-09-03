package EncapsulationAndConstructor;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    protected List<Animal> animalList = new ArrayList<>();
    protected int freeSlots = 4; // defines the number of free places for animals

    public Farm(){

    }

    public void breed(){ // creates a new animal if there's place for it

        if ( freeSlots > 0 ){
            animalList.add(new Animal());
            System.out.println("You can add animal.There are "+freeSlots+" space(s) for animals.");
            freeSlots--;
        } else {
            System.out.println("The farm has full capacity.You can not add another one...");
        }
    }

    @Override
    public String toString() {
        String numOfAnimals = "Farm has "+animalList.size()+" animals.\n";
        String animalsStored = "";
        for ( Animal animal : animalList ) {
            animalsStored += " - "+animal.getId()+" animal has level of hunger at "+animal.getHunger()+
                    " and level of thirst at " +animal.getThirst()+"\n";
        }
        return numOfAnimals +animalsStored;
    }

    public void slaughter(){ //removes the least hungry animal
        int minHungerPos = 0;
        int minHunger = animalList.get(0).getHunger();
        for ( int i = 0 ; i < animalList.size() ; i++){
            if ( minHunger >= animalList.get(i).getHunger() ){
                minHunger = animalList.get(i).getHunger();
                minHungerPos = i;
            }
        }
        animalList.remove(minHungerPos);

    }
}
