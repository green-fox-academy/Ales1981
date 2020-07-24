public class Bmi {
    public static void main(String [] args){
        // this program should calculate Bmi according to given values
        double massInKg = 81.2; // given weight
        double heightInM = 1.78 ; // given height
        double Bmi = massInKg / (heightInM*heightInM); // this is the formula for BodyMassIndex

        System.out.println("Bmi according to given values is: "+Bmi);
    }
}
