package petrolStation;

public class petrolApp {
    public static void main(String[] args){
        Car car = new Car();
        Station station = new Station(1000);

        station.reFill(car);
        System.out.println(station.gasAmount);
        System.out.println(car.gasAmount);

    }
}
