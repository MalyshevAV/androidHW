package com.android;

import java.util.Arrays;

public class Matrica {

  public static void main(String args[]) {
      double[][] matrix1 = new double[][]{{1.5, 5.0}, {1.9, 7.2}};
      double[][] matrix2 = new double[][]{{8.0, 4.9}, {3.5, 1.5}};
      
      double[][] sum = sum(matrix1, matrix2);
      for (double[] aSum : sum) {
          System.out.printf(Arrays.toString(aSum));
      }
      System.out.println();

      double[][] muliply = multiply(matrix1,2);
      for (double[] mult : muliply) {
          System.out.printf(Arrays.toString(mult));
      }
  }

    public static double[][] sum(double[][] matrix1, double[][] matrix2) {
        double[][] sum = new double[2][2];
        for (int i = 0; i < matrix1.length; i++)
            for (int j = 0; j < matrix2.length; j++)
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
        return sum;
    }
    private static double [][] multiply(double[][] matrix1, double m) {
        double array[][] = new double [matrix1.length][];
        for (int i = 0; i < matrix1.length; i++) {
            array[i] = new double [matrix1[i].length];
            for (int j = 0; j < matrix1[i].length; j++) {
                array[i][j] = matrix1[i][j] * m;
            }
        }
        return array;
    }
}
