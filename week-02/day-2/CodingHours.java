public class CodingHours {
    public static void main(String [] args){
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

        int daillycoding = 6; // number of hours spent dailly by coding
        int semester = 17; // number of weeks on a semester
        int daysofweek = 7; // all days of the week
        int workingdays = daysofweek - 2; // working days only


        int attendee = daillycoding * workingdays * semester; // calculates all the hours spent by coding during the semester
        System.out.println("Attendee spends with coding :" + attendee + " hours in a semester, if the attendee codes only on working days.");

        int averagehours = 52 ; // average number of working hours per 1 week
        int averagecoding = daillycoding * workingdays ; // number of coding hours during 1 week

        int percentage = ((100 * averagecoding)/averagehours); // calculation of percentage amount of working hours spend by coding weekly
        System.out.println("Percentage of hours spend in 1 week by coding is " + percentage + "%, if the average work hours weekly is 52.");



    }
}
