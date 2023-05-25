import java.util.Scanner;

public class slide35 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Nhap he so bac 2, a = ");
        int a = slide35.scanner.nextInt();
        System.out.print("Nhap he so bac 1, b = ");
        int b = slide35.scanner.nextInt();

        slide35.TimSoNhoNhat(a, b);

    }

    public static void TimSoNhoNhat(int a, int b) {
        int MinNumber = a < b ? a : b;
        System.out.print("So nho nhat la " + MinNumber);
    }

}