package thegardenapp;

public class Plant {
    protected String color;
    protected String type;
    protected int waterNeed;
    protected double waterAbsorb;
    protected double waterAmount;
    protected boolean isThirsty = true;

    public String getColor() {
        return color;
    }

    public double getWaterAbsorb() {
        return waterAbsorb;
    }

    public String getType() {
        return type;
    }
}
