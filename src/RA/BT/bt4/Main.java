package RA.BT.bt4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row of matrix");
        int row = sc.nextInt();
        System.out.println("enter col of matrix");
        int col = sc.nextInt();
        float[][] matrixArr = createMatrix(row,col,sc);
        System.out.println("matrix you just create: ");
        for (int i = 0; i <row ; i++) {
            System.out.println(Arrays.toString(matrixArr[i]));
        }
        maxValue(matrixArr);
    }

    public static float[][] createMatrix (int row, int col, Scanner sc) {
        float [][] arr2w = new float[row][col];
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("enter value of col %d row %d ", i,j);
                arr2w[i][j] = sc.nextInt();
            }
        }
        return  arr2w;
    }
    public static void maxValue (float[][] arr) {
        for (int i = 0; i <arr.length ; i++) {
            float max = arr[i][0];
            int col = 0;
            for (int j = 1; j <arr[i].length ; j++) {
                if(arr[i][j] > max) {
                    max = arr[i][j];
                    col = j;
                }
            }
            System.out.printf("biggest value of row %d col %d is %f  ",i,col,max);
            System.out.println();
        }
    }
}
