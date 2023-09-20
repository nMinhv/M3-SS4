package RA.BT.bt3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter amount of value in arr 1");
        int arr1L = sc.nextInt();
        System.out.println("enter amount of value in arr 2");
        int arr2L = sc.nextInt();
        int [] arr1 = createArr(arr1L,sc);
        int [] arr2 = createArr(arr2L,sc);
        int [] arr3 = new int[arr1L + arr2L];
        for (int i = 0; i < arr3.length; i++) {
            if(i >= arr1L) {
                arr3[i] = arr2[i - arr1L];
            }else {
                arr3[i] = arr1[i];
            }
        }
        System.out.println(Arrays.toString(arr3));
     }
    public static int[] createArr(int length , Scanner sc) {
        int[] arr = new int[length];
        for (int i = 0; i <arr.length ; i++) {
            System.out.printf("please enter value of arr %1d ",i);
            arr[i] = sc.nextInt();
        }
        System.out.println("end");
        return arr;
    }
}
