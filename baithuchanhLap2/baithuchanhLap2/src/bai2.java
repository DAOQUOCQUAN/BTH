
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap mot so: ");
        int n = sc.nextInt();
        // Kiểm tra số chẵn hay lẻ bằng cách xem n có chia hết cho 2 không
        if (n % 2 == 0) {
            System.out.println(n + " la so chan");
        } else {
            System.out.println(n + " la so le");
        }
    }
}