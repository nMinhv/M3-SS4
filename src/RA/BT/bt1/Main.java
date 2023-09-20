package RA.BT.bt1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arrInt = {1,2,3,4,5,6,7,8,9,1};
        System.out.println("Enter number want to delete :");
        int deleteInt = sc.nextInt();
        int indexDelete = -1;
        for (int i = 0; i <arrInt.length ; i++) {
            if(arrInt[i] == deleteInt) {
                indexDelete = i;
            }
        }
        if (indexDelete != -1) {
            System.out.println("Arr before Delete : " + Arrays.toString(arrInt));
            for (int i = indexDelete; i < arrInt.length-1 ; i++) {
                arrInt[i] = arrInt[i + 1];
            }
            arrInt = Arrays.copyOf(arrInt, arrInt.length-1);
            System.out.println("Arr after Delete : " + Arrays.toString(arrInt));
        }else {
            System.out.println("Number you enter not in there");
        }
    }
}
