package chapters.chapter_08;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_09 {

    public static void main(String[] args) {

        char[][] table = new char[3][3];

        playTicToc(table, ' ');

        boolean isXTurn = true;

        boolean isDraw = true;

        while (!isTheBoardFull(table)) {

            displayTable(table);

            promptThePLayerTicOrToe(table, isXTurn);

            if (checkWins(table)) {

                displayTable(table);

                System.out.println((isXTurn ? "X" : "Y") + " player won");

                isDraw = false;

                break;
            }
            isXTurn = !isXTurn;
        }
        if (isDraw) {

            displayTable(table);

            System.out.println("Game is over! It's draw!");
        }
    }
    public static void playTicToc(char[][] table, char ch) {

        for (int row = 0; row < table.length; row++) {

            Arrays.fill(table[row], ch);
        }
    }
    public static boolean isTheBoardFull(char[][] table) {

        for (int r = 0; r < table.length; r++) {

            for (int c = 0; c < table[r].length; c++) {

                if (table[r][c] == ' ') {

                    return false;
                }
            }
        }
        return true;
    }
    public static boolean checkWins(char[][] table) {

        return (checkRows(table) || checkCols(table) || checkMajDia(table) || checkSubDia(table));
    }
    public static void displayTable ( char[][] table){

        for (int row = 0; row < table.length; row++) {

            System.out.println("-------------");

            for (int col = 0; col < table[row].length; col++) {

                System.out.print("| " + table[row][col] + " ");
            }
            System.out.println("|");
        }
        System.out.println("-------------");
    }
    public static void promptThePLayerTicOrToe ( char[][] table, boolean XTurn){

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.print("Enter a row (0, 1, 2) for player ");

            System.out.print(XTurn ? "X:" : "Y:");

            int row = input.nextInt();

            System.out.print("Enter a col (0, 1, 2) for player ");

            System.out.print(XTurn ? "X:" : "Y:");

            int col = input.nextInt();

            if (0 > col || col > 2 || 0 > row || row > 2) {

                System.out.println("Choose another place!");

                continue;
            }
            if (table[row][col] == ' ') {

                table[row][col] = (XTurn ? 'X' : 'Y');

                break;
            }
            System.out.println("Choose another place!");
        }
    }
    public static boolean checkRows(char[][] table){

        for (int r = 0; r < table.length; r++) {

            for (int c = 0; c < table[r].length - 1; c++) {

                if (table[r][0] != ' ' && table[r][c] != table[r][c + 1])

                    return false;
            }
        }
        return true;
    }
    public static boolean checkCols(char[][] table) {

        for (int c = 0; c < table.length; c++) {

            for (int r = 0; r < table[r].length - 1; r++) {

                if (table[c][0] != ' ' && table[r][c] != table[r + 1][c])

                    return false;
            }
        }
        return true;
    }
    public static boolean checkMajDia(char[][] table) {

        for (int rAndC = 0; rAndC < table.length - 1; rAndC++) {

            if (table[rAndC][rAndC] != ' ' && table[rAndC][rAndC] != table[rAndC + 1][rAndC + 1]){

                return false;
            }
        }
        return true;
    }
    public static boolean checkSubDia(char[][] table) {

        for (int r = 0, c = table.length - 1; r < table.length - 1; r++, c--) {

            if (table[r][c] != ' ' && table[r][c] != table[r + 1][c - 1]){

                return false;
            }
        }
        return false;
    }
}