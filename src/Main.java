import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Array - mảng là khái niệm dùng để lưu trũ danh sách các giá trị cùng kiểu dữ liệu
        // cú pháp : tường minh
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(arr));
        System.out.println("Phần tử tại vị trí index = 0 " + arr[0]);
        // gán lại giá trị
        System.out.println("phần tử tại vị trí index 2 trc khi thay đổi :" + arr[1]);
        arr[1] = 7;
        System.out.println("phần tử tại vị trí index 2 sau khi thay đổi :" + arr[1]);
        // cú pháp : sử dụng từ khóa new
        int[] newArr = new int[10];
        System.out.println(Arrays.toString(newArr));
        Double[] arrObj = new Double[10];
        System.out.println(Arrays.toString(arrObj));
        // duyệt mảng
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("phần tử tại vị trí index = %d là %d\n", i, arr[i]);
        }
        // forEach : duyệt theo giá trị
        for (int valueArr : arr
        ) {
            System.out.println(valueArr);
        }
        // kiểm tra các số chia hết cho 2
        System.out.println("các phần tử chia hết cho 2");
        for (int arrValue : arr
        ) {
            if (arrValue % 2 == 0) {
                System.out.println(arrValue);
            }
        }
        // kiểm tra vị trí index các phần tử chia hết cho 2
        System.out.println("vị trí index các phần tử chia hết cho 2");
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            if (value % 2 == 0) {
                System.out.println("vị trí index các phần tử chia hết cho 2 là :" + i);
            }
        }
        // mảng 2 chiều là gì: mảng chứa danh sách các mảng khác
        // tường minh
        int[][] arr2side = {{1, 2, 3}, {4, 5, 6, 8}};
        for (int[] arr2s : arr2side
        ) {
            System.out.println(Arrays.toString(arr2s));
        }
        int[][] intArr2S = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        // sử dụng từ khóa new
        System.out.println("Sử dụng từ khóa new");
        int[][] arr2side2 = new int[3][4];
        for (int[] arr2s2 : arr2side2
        ) {
            System.out.println(Arrays.toString(arr2s2));
        }
        // duyệt theo ma trận
        System.out.println("Duyệt theo ma trận");
        for (int i = 0; i < intArr2S.length; i++) {
            for (int j = 0; j < intArr2S[i].length; j++) {
                System.out.printf("%2d ", intArr2S[i][j]);
            }
            System.out.println();
        }
        // nhập, xuất dữ liệu mảng 2 chiều
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số hàng m = ");
        int m = sc.nextInt();
        System.out.println("nhập vào số cột n = ");
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("\nNhập giá trị cho matrix[%d][%d] = ", i, j);
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("các giá trị vừa nhập là: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%2d ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}