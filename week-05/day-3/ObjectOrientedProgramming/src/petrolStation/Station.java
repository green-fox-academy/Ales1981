package petrolStation;

public class Station {
    int gasAmount;

    public Station(int gasAmount){
        this.gasAmount=gasAmount;
    }


    public void reFill(Car car) {
        this.gasAmount = this.gasAmount-car.capacity;
        car.gasAmount = car.capacity;
    }
}
