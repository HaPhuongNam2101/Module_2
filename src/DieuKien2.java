import java.util.Scanner;

public class DieuKien2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập độ C");
       double C = input.nextDouble();
       double F = (C *9/5)+32;
        System.out.println("Nhiệt độ sau khi chuyển đổi " + F);
    }
}
/*
Bài 2
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập met ");
        double m = sc.nextDouble();
        double ft = m * 3.2808;
        System.out.println(" = " + ft + " ft ");
    }
Bài 3
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cạnh ");
        double a = sc.nextDouble();
        double b = (a * a);
        System.out.println("Diện tích hình vuông là " + b);
    }
Bài 4
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài ");
        double a = sc.nextDouble();
        System.out.println("Nhập chiều rộng ");
        double b = sc.nextDouble();
        double c = (a * b);
        System.out.println("Diện tích hình chữ nhật là " + c);
    }
Bài 5
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài ");
        double a = sc.nextDouble();
        System.out.println("Nhập chiều rộng ");
        double b = sc.nextDouble();
        double c = (a * b) / 2;
        System.out.println("Diện tích tam giác vuông " + c);

    }
Bài 6
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Nhập số a:");
        double a = inputNumber.nextDouble();
        System.out.println("Nhập số b:");
        double b = inputNumber.nextDouble();
        if (a != 0) {
            double x = -b / a;
            System.out.println("Phương trình có nghiệm là: " + x);
        } else {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        }
    }
Bài 7
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập hệ số a: ");
        double a = input.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = input.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = input.nextDouble();
        double delta = b * b - 4 * a * c;
        if (a == 0) {
            if (b != 0) {
                double x = -c / b;
                System.out.println("Phương trình có một nghiệm: x = " + x);
            } else {
                if (c == 0) {
                    System.out.println("Phương trình có vô số nghiệm.");
                } else {
                    System.out.println("Phương trình vô nghiệm.");
                }
            }
        } else {
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có hai nghiệm phân biệt: x1 = " + x1 + ", x2 = " + x2);
            } else if (delta == 0) {
                double x3 = -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép: x = " + x3);
            } else {
                System.out.println("Phương trình vô nghiệm thực.");
            }
        }
    }
Bài 8
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tuổi ");
        int age = sc.nextInt();
        if(age > 0 && age <120){
            System.out.println("Đây là độ tuổi của một người ") ;
        }else{
            System.out.println("Đây không phải tuổi của 1 người " );
        }
    }
Bài 9
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập cạnh b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập cạnh c: ");
        double c = scanner.nextDouble();
        if (a > 0 && b > 0 && c > 0 && (a + b > c) && (b + c > a) && (a + c > b)) {
            System.out.println("Đây là 3 cạnh của 1 tam giác.");
        } else {
            System.out.println("Đây không phải 3 cạnh của 1 tam giác.");
        }
    }
Bài 10
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số điện tiêu thụ: ");
        double soDien = scanner.nextDouble();
        double giaTien = 0;
        if (soDien > 0 && soDien < 50) {
            giaTien = soDien * 3500;
            System.out.println("Giá tiền điện *3.500 1 số là: " + giaTien);
        } else if (soDien >= 50) {
            giaTien = soDien * 4500;
            System.out.println("Giá tiền điện *4.500 1 số là: " + giaTien);
        } else {
            System.out.println("Hãy nhập đúng số điện");
        }
    }


 */
