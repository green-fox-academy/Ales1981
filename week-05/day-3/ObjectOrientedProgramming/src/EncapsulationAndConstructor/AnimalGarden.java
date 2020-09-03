package EncapsulationAndConstructor;

public class AnimalGarden {
    public static void main(String[] args) {


        Farm farm = new Farm();
        Animal cow = new Animal(30, 35);
        farm.animalList.add(cow);
        farm.breed();
        farm.breed();
        System.out.println(farm);
        Animal slepice = new Animal(45, 45);
        farm.animalList.add(slepice);
        System.out.println(farm);
        farm.slaughter();
        System.out.println(farm);




    }
}
