package thegardenapp;

import java.util.ArrayList;
import java.util.List;

public class Garden {
    protected List<Plant> garden;

    public Garden(){
        garden = new ArrayList<>();
    }
    public void addPlant(Plant plant){
        garden.add(plant);
    }
    @Override
    public String toString() {
        String sentence = "garden status is:\n";
        String plantList = "";
        for (Plant plant : garden){
            plantList += " - The "+plant.getColor()+" "+plant.getType()+" "+
                    (plant.isThirsty ? "needs water" : "doesn't need" + " water")+"\n";
        }
        return sentence+plantList;
    }
    public void watering(int watering) {
        System.out.println("Watering with "+watering);
        for ( Plant plant : garden){
            if (plant.isThirsty){
                double waterDivide = (double)watering / (double)garden.size();
                plant.waterAmount += waterDivide * plant.getWaterAbsorb();
                if ( plant.waterAmount > plant.waterNeed){
                    plant.isThirsty = false;
                }
            }
        }
    }
    public void status(Garden garden) {
        System.out.println(garden.toString());
    }
}
