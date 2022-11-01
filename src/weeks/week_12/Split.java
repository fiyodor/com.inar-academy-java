package weeks.week_12;

public class Split {

    public static void main(String[] args) {

        String str1 = "I love Inar Academy";

        String[] array = str1.split(" ");

        for(int i = 0; i < array.length; i++) {

            System.out.print(array[i] + "       ");

        }
        System.out.println("---------------------");
        findJavaInCV();
    }
    public static void findJavaInCV(){

        String cv = "Java and Pyton Java Ertuğrul Java Java Dönmez Java Java 4208 Java Java Java Java Java Java Java Java Java ";

        String[] array = cv.trim().split("Java");

        for(int i = 0; i < array.length; i++) {

            System.out.print(array[i] + "       ");

        }
        int counter = array.length;
        System.out.println("\nThere are " + counter + " 'Java' in your CV.");
    }
}
