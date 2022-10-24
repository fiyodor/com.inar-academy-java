package chapters.chapter_08;

public class Exercise_18 {

    public static void main(String[] args) {

        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};

        displayArray(m);

        shuffle(m);

        System.out.println();

        displayArray(m);


    }
    public static void shuffle(int[][] m){

        int temp;

        for (int i = 0; i < m.length; i++) {

            int random = (int)(Math.random() * m.length);

            temp = m[i][0];

            m[i][0] = m[random][0];

            m[random][0] = temp;
        }



    }

    public static void displayArray(int[][] array){

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                System.out.print(array[i][j] + " ");
            }
            System.out.print("   ");
        }
    }
}
