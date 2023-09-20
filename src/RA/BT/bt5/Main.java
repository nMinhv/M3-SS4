package RA.BT.bt5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter amount of element want in arr");
        int arrL = sc.nextInt();
        int[] arr = new int[arrL];
        for (int i = 0; i <arrL ; i++) {
            System.out.printf("enter value for element %d ",i+1);
            arr[i] = sc.nextInt();
            System.out.println();
        }
        int min = arr[0];
        for (int i = 1; i <arrL ; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.printf("%d is smallest element in arr you just create", min);
    }
}
