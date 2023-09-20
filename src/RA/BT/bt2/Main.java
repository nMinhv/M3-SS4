package RA.BT.bt2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arrInt = {1,2,3,4,5,6,7,8,9};
        System.out.println("Array number:" + Arrays.toString(arrInt));
        System.out.println("Enter number want to add:");
        int newNumb = sc.nextInt();
        System.out.println("position?");
        int index = sc.nextInt();
        if(index > 0 && index < arrInt.length ) {

        int [] newArr = Arrays.copyOf(arrInt,arrInt.length+1);
        newArr[index] = newNumb;
        for (int i = index + 1; i <newArr.length ; i++) {
            newArr[i] = arrInt[i - 1];
        }
        System.out.println(Arrays.toString(newArr));
        }else {
            System.out.println("not in range of array");
        }
    }
}
