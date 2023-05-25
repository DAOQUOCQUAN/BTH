import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so thu nhat: ");
        float a = sc.nextFloat();
        System.out.println("nhap vao so thu hai: ");
        float b = sc.nextFloat();
        // Tính tổng, hiệu, tích, thương, chia lấy dư của 2 số
        float tong = a + b;
        float hieu = a - b;
        float tich = a * b;
        double thuong = (double) a / b;
        float du = a % b;
        // In kết quả ra màn hình
        System.out.println("tong cua hai so la: " + tong);
        System.out.println("hieucua hai so la: " + hieu);
        System.out.println("tich cua hai so la:" + tich);
        System.out.println("thuong cua hai so la: " + thuong);
        System.out.println("chia lay du cua hai so la: " + du);

        // Sử dụng các toán tử so sánh để so sánh 2 số
        if (a > b) {
            System.out.println(a + " lon hon" + b);
        } else if (a < b) {
            System.out.println(a + " nho hon " + b);
        } else {
            System.out.println(a + " bang " + b);
        }
    }
}