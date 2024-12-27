package controller;

import models.SpiralMatrix;

public class Controller {

    SpiralMatrix spiralMatrix;

    public Controller(int row, int col) {
        spiralMatrix = new SpiralMatrix();
        run(row, col);
    }

    public void run(int row, int col) {
        System.out.println("Matriz Resultado: ");
        int[][] result = spiralMatrix.fillSpiralMatrix(row, col);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                if (result[i][j] < 10)
                    System.out.print(" ");
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        new Controller(5, 3);
    }
}