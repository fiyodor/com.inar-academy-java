package chapters.chapter_07;

import java.util.Arrays;

public class Exercise_22 {

    public static void main(String[] args) {

        int[] chessBoard = new int[8];

        int row = 0;

        int counter = 0;

        while (row < chessBoard.length) {

            counter++;

            if (aPlaceForQueen(chessBoard, row)) {

                placeQueen(chessBoard, row);

                row++;
            }
            else {

                row = 0;
            }
        }
        displayChessBoard(chessBoard, counter);
    }
    public static boolean aPlaceForQueen(int[] chessTable, int row) {

        boolean[] checkChessBoard = new boolean[8];

        Arrays.fill(checkChessBoard, true);

        for (int i = 0; i < row; i++) {

            checkChessBoard[chessTable[i]] = false;

            if (( chessTable[i] + row - i) < 8) {

                checkChessBoard[row - i + chessTable[i]] = false;
            }
            if ((chessTable[i] - (row - i)) > 0) {

                checkChessBoard[chessTable[i] - (row - i)] = false;
            }
        }

        for (int i = 0; i < checkChessBoard.length; i++) {

            if (checkChessBoard[i]) {

                return true;
            }
        }
        return false;
    }
    public static void placeQueen(int[] chessTable, int row) {

        int queensPlace;

        while (true) {

            queensPlace = (int) (Math.random() * 8);

            if (isPlaceEmpty(chessTable, queensPlace, row)) {

                break;
            }
        }
        chessTable[row] = queensPlace;
    }
    private static boolean isPlaceEmpty(int[] chessTable, int queensPlace, int row) {

        boolean[] checkSuitable = new boolean[8];

        Arrays.fill(checkSuitable, true);

        for (int i = 0; i < row; i++) {

            checkSuitable[chessTable[i]] = false;

            if ((row - i + chessTable[i]) < 8) {

                checkSuitable[row - i + chessTable[i]] = false;
            }
            if (chessTable[i] - (row - i) > 0) {

                checkSuitable[chessTable[i] - (row - i)] = false;
            }
        }
        return checkSuitable[queensPlace];
    }
    public static void displayChessBoard(int[] chessTable, int count) {

        for (int i = 0; i < chessTable.length; i++) {

            System.out.print("|");

            for (int j = 0; j < chessTable[i]; j++) {

                System.out.print(" |");
            }
            System.out.print("Q| ");

            for (int j = chessTable[i] + 1; j < chessTable.length; j++) {

                System.out.print("| ");
            }
            System.out.println();
        }
    }
}