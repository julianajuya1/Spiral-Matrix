package models;

public class SpiralMatrix {

    public int[][] fillSpiralMatrix(int row, int column) {
        int[][] matrixResult = new int[row][column];
        int top = 0, bottom = row - 1, left = 0, right = column - 1;
        int count = 1;

        while (top <= bottom && left <= right) {
            
            for (int i = left; i <= right; i++) {
                matrixResult[top][i] = count++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                matrixResult[i][right] = count++;
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrixResult[bottom][i] = count++;
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrixResult[i][left] = count++;
                }
                left++;
            }
        }
        return matrixResult;
    }
}