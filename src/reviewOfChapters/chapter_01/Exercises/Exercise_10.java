package reviewOfChapters.chapter_01.Exercises;

public class Exercise_10 {

    public static void main(String[] args) {

        double totalSeconds = ((45 * 60) + 30);
        double totalHours = totalSeconds / 60 / 60; // / 60 => minutes / 60 => hours
        double lengthInKm = 14;
        double lengthInMiles = lengthInKm * 1.6;
        double averageSpeedInMilesPerHour = lengthInMiles / totalHours;

        System.out.println("Average speed per hour: " + averageSpeedInMilesPerHour);
    }
}
