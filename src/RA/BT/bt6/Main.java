package RA.BT.bt6;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many row you want in matrix?");
        int row = sc.nextInt();
        System.out.println("How many col?");
        int col = sc.nextInt();
        float[][] matrix = createMatrix(row,col,sc);
        System.out.println("Matrix you just create:");
        for (int i = 0; i <row ; i++) {

        System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println("Which col you want to calculate?");
        int cC;
        do {
            cC = sc.nextInt();
        if(cC <= col) {

        float sumC = sumCol(matrix, cC);
        System.out.printf("Sum of col %d is %f ", cC,sumC);
        }else {
            System.out.println("your matrix you create don't have col " + cC + " please enter again");
        }
        }while (cC > col);
    }
    public static float[][] createMatrix (int row, int col, Scanner sc) {
        float[][] arr = new float[row][col];
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                System.out.printf("set value for element row %d col %d " ,i+1,j+1);
                arr[i][j] = sc.nextFloat();
            }
        }
        return arr;
    }
    public static float sumCol (float[][] matrix , int col) {
        float sum = 0;
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                if(j == col - 1) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }
}
