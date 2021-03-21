package ru.job4j.puzzle;


public class Win {
    public static boolean check(int[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1 && (isHorizontalWin(board, i) || isVerticalWin(board, i))) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean isHorizontalWin(int[][] board, int row) {
        boolean result = true;
        for (int cell = 0; cell < board.length; cell++) {
            if (board[row][cell] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean isVerticalWin(int[][] board, int cell) {
        boolean result = true;
        for (int row = 0; row < board.length; row++) {
            if (board[row][cell] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }
}
