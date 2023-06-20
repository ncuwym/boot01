package com.yuming.boot.utils;

import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author wangyuming
 */
@Component
public class EightQueens {
    private static final int BOARD_SIZE = 8;
    private int[] queens;

    public EightQueens() {
        queens = new int[BOARD_SIZE];
    }

    public void solve() {
        placeQueens(0);
        printBoard();
    }

    private void placeQueens(int row) {
        if (row == BOARD_SIZE) {
            // All queens have been successfully placed
            return;
        }

        for (int col = 0; col < BOARD_SIZE; col++) {
            if (isValidPlacement(row, col)) {
                queens[row] = col;
                placeQueens(row + 1);
            }
        }
    }

    private boolean isValidPlacement(int row, int col) {
        for (int i = 0; i < row; i++) {
            // Check if there is a queen in the same column or diagonals
            if (queens[i] == col || queens[i] - col == i - row || queens[i] - col == row - i) {
                return false;
            }
        }
        return true;
    }

    private void printBoard() {
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                if (queens[row] == col) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        EightQueens eightQueens = new EightQueens();
        eightQueens.solve();
    }
}
