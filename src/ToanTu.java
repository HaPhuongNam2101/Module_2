import java.util.Scanner;

public class ToanTu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất: ");
        int num1 = input.nextInt();
        System.out.println("Nhập số thứ hai: ");
        int num2 = input.nextInt();
        int tong = num1 + num2;
        int tich = num1 * num2;
        int hieu = num1 - num2;
        int thuong = num1 / num2;
        int chialaydung = num1 % num2;
        System.out.println("Tổng của 2 số là " + tong);
        System.out.println("Tích của 2 số là " + tich);
        System.out.println("Hiệu của 2 số là " + hieu);
        System.out.println("Thương của 2 số là " + thuong);
        System.out.println("Số dư của 2 số là " + chialaydung);
    }
}
/*
Bài 2
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất ");
        int num1 = input.nextInt();
        System.out.println("Nhập số thứ hai ");
        int num2 = input.nextInt();
        int tong = num1;
        tong += num2;
        System.out.println("Tổng của hai số (sử dụng +=): " + tong);
        int hieu = num1;
        hieu -= num2;
        System.out.println("Hiệu của hai số (sử dụng -=): " + hieu);
        int tich = num1;
        tich *= num2;
        System.out.println("Tích của hai số (sử dụng *=): " + tich);
        int thuong = num1;
        thuong /= num2;
        System.out.println("Thương của hai số (sử dụng /=): " + thuong);
    }
Bài 3
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào một số :");
        int number = input.nextInt();
        System.out.println("Giá trị ban đầu của số: " + number);
        number++;
        System.out.println("Sau khi tăng lên 1: " + number);
        number--;
        System.out.println("Sau khi giảm xuống 1: " + number);
    }
Bài 4
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        // Nhập vào hai số nguyên từ người dùng
        System.out.println("Nhập số thứ nhất:");
        int number1 = input.nextInt();
        System.out.println("Nhập số thứ hai:");
        int number2 = input.nextInt();
        System.out.println(number1 + " < " + number2 + " là " + (number1 < number2));
        System.out.println(number1 + " > " + number2 + " là " + (number1 > number2));
        System.out.println(number1 + " <= " + number2 + " là " + (number1 <= number2));
        System.out.println(number1 + " >= " + number2 + " là " + (number1 >= number2));
        System.out.println(number1 + " == " + number2 + " là " + (number1 == number2));
        System.out.println(number1 + " != " + number2 + " là " + (number1 != number2));
    }

 */
