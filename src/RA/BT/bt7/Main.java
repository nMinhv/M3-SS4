package RA.BT.bt7;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("column and row of matrix you want?");
        int size = sc.nextInt();
        int [][] sMatrix = createMatrix(size,sc);
        System.out.println("matrix you create:");
        for (int[] arr:sMatrix
             ) {
            System.out.println(Arrays.toString(arr));

        }
        int ltr = 0;
        int rtl = 0;
        for (int i = 0; i <size ; i++) {
           ltr += sMatrix[i][i];
            for (int j = size-1; j >= 0 ; j--) {
                if(i + j == size - 1){
                    System.out.println(sMatrix[i][j]);
                    rtl+= sMatrix[i][j];
                }
            }
        }
        System.out.println("sum of diagonal line from top left to bottom right is :" + ltr);
        System.out.println("sum of diagonal line from top right to bottom left is :" + rtl);
    }
    public static int[][] createMatrix(int size, Scanner sc) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <size ; j++) {
                System.out.printf("set value for element row %d col %d ",i,j);
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }
}
