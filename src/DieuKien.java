import java.util.Scanner;

public class DieuKien {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất ");
        int num1 = input.nextInt();
        System.out.println("Nhập số thứ hai ");
        int num2 = input.nextInt();
        if (num1 != 0 && num1 % num2 == 0) {
            System.out.println(num1 + " chia hết cho " + num2);
        } else {
            System.out.println(num1 + " không chia hết cho " + num2);
        }
    }
}
/*
Bài 2
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tuổi ");
        int age = input.nextInt();
        if (age >= 15) {
            System.out.println("Bạn đủ điều kiện vào lớp 10");
        }else{
            System.out.println("Bạn không đủ điều kiện vào lớp 10");
        }
    }
Bài 3
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số nguyên ");
        int number = input.nextInt();
        if (number > 0) {
            System.out.println("Số " + number + " là số lớn hơn 0.");
        } else if (number < 0) {
            System.out.println("Số " + number + " là số nhỏ hơn 0.");
        } else {
            System.out.println("Số " + number + " là số bằng 0.");
        }
    }
Bài 4
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        int num1 = input.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int num2 = input.nextInt();
        System.out.print("Nhập số thứ ba: ");
        int num3 = input.nextInt();
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        System.out.println("Giá trị lớn nhất trong ba số là: " + max);
    }
Bài 5
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập điểm bài kiểm tra: ");
        double diemBaiKT = input.nextDouble();
        System.out.print("Nhập điểm thi giữa kỳ: ");
        double diemGiuaKy = input.nextDouble();
        System.out.print("Nhập điểm thi cuối kỳ: ");
        double diemCuoiKy = input.nextDouble();
        double diemTrungBinh = (diemBaiKT + diemGiuaKy + diemCuoiKy) / 3;
        String HocLuc;
        if (diemTrungBinh >= 8.0) {
            HocLuc = "Giỏi";
        } else if (diemTrungBinh >= 6.5) {
            HocLuc = "Khá";
        } else if (diemTrungBinh >= 5.0) {
           HocLuc = "Trung bình";
        } else {
           HocLuc = "Yếu";
        }
        System.out.println("Học lực của học sinh là: " + HocLuc);
    }
Bài 6
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập doanh số bán hàng: ");
        double doanhSo = scanner.nextDouble();
        if (doanhSo > 2000 && doanhSo < 5000) {
            System.out.println("Hoa hồng 15%");
        } else if (doanhSo > 5000 && doanhSo < 8000) {
            System.out.println("30% hoa hồng");
        } else if (doanhSo >= 8000) {
            System.out.println("40% hoa hồng");
        } else {
            System.out.println("Không có hoa hồng");
        }
    }
Bài 7
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số cước: ");
        double a = input.nextDouble();
        double b = a * 21000;
        if (b > 0 && b < 20) {
            System.out.println("Phí cước = " + b + " VNĐ");
        } else if (b >= 20 && b < 50) {
            b = a * 24000;
            System.out.println("Phí cước = " + b + " VNĐ");
        } else if (b >= 50 && b < 80) {
            b = a * 26000;
            System.out.println("Phí cước = " + b + " VNĐ");
        } else if (b >= 80) {
            b = a * 27000;
            System.out.println("Phí cước = " + b + " VNĐ");
        } else {
            System.out.println("Phí cước không hợp lệ");
        }
    }
 */
