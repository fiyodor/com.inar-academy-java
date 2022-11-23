package chapters.chapter_07.Exercises;

public class Exercise_23 {

    public static void main(String[] args) {

        boolean[] doorStatus = new boolean[100];

        changeLock(100, doorStatus);

        System.out.print("Open door numbers are : ");

        printOpenLockerNumber(doorStatus);
    }
    public static void changeLock(int numberOfStudent, boolean[] doorStatus) {

        for(int i = 1; i <= numberOfStudent; i++) {

            for (int j = (i - 1) ; j < doorStatus.length; j += i) {

                if(doorStatus[j] == false) {

                    doorStatus[j] = true;
                }
                else {

                    doorStatus[j] = false;
                }
            }
        }
    }
    public static void printOpenLockerNumber(boolean[] unlocked) {

        for (int i = 0; i < unlocked.length; i++) {

            if (unlocked[i]) {

                System.out.print((i + 1) + " ");
            }
        }
    }
}