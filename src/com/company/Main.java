package com.company;

import java.util.ArrayList;

public class Main {
    public static int[][] board;

    public static void main(String[] args) {
        // write your code here
        board = new int[4][4];
        System.out.println(getEmptyCells().get(0)[0]);
    }

    public static int randomNum() {
        if (Math.random() > 0.5) {
            return 2;
        } else {
            return 4;
        }
    }

    public static ArrayList<int[]> getEmptyCells()  {
        ArrayList<int[]> emptyCells = new ArrayList();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (board[i][j] == 0) {
                    emptyCells.add(new int[]{i, j});
                }
            }
        }
        return emptyCells;
    }


}
