import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i;
        //Nhập số lượng phần tử mảng 1
        System.out.println("Mời bạn nhập số lượng sinh viên");
        int n = scanner.nextInt();
        int arr[] = new int[n];

        //Nhập phần tử mảng 1
        for (i = 0; i < arr.length; i++) {
            System.out.println("Mời bạn nhập điểm sinh viên thứ: " + (i+1));
            arr[i] = scanner.nextInt();
        }
        int count = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] >=5 && arr[i]<=10) {
               count++;
            }
        }
        System.out.println("Số sinh viên qua môn là :" + count);
    }
}
