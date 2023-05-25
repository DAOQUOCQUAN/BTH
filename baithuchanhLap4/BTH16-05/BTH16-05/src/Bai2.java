<<<<<<< HEAD
import java.util.LinkedList;
import java.util.Scanner;

public class Bai2 {
    Scanner sc = new Scanner(System.in);
    LinkedList<Integer> list = new LinkedList<>();
    int n;
    int number;

    public void nhap() {
        System.out.print("nhap vao so luong so nguyen duong: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap vao phan tu thu " + (i + 1) + ": ");
            number = sc.nextInt();
            list.add(number);
        }
    }

    public void HienThi() {
        System.out.println("Cac phan tu trong List la");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Phan tu thu " + (i + 1) + " la: " + list.get(i));
        }
    }

    public void TBC() {
        int tbc = 0;
        int sochia = 0;
        for (Integer nb : list) {
            if (nb % 2 == 0) {
                tbc += nb;
                sochia++;
            } else if (nb == list.size() && nb % 2 == 1)
                System.out.println("Danh sach khong co phan tu chia het cho 2");
        }
        tbc = tbc / sochia;
        System.out.printf("Trung binh cong cac so trong danh sach la: %d", tbc);
        System.out.println();
    }

    public static void main(String[] args) {
        Bai2 b2 = new Bai2();
        b2.nhap();
        b2.TBC();
    }

}
=======
import java.util.LinkedList;
import java.util.Scanner;

public class Bai2 {
    Scanner sc = new Scanner(System.in);
    LinkedList<Integer> list = new LinkedList<>();
    int n;
    int number;

    public void nhap() {
        System.out.print("nhap vao so luong so nguyen duong: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap vao phan tu thu " + (i + 1) + ": ");
            number = sc.nextInt();
            list.add(number);
        }
    }

    public void HienThi() {
        System.out.println("Cac phan tu trong List la");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Phan tu thu " + (i + 1) + " la: " + list.get(i));
        }
    }

    public void TBC() {
        int tbc = 0;
        int sochia = 0;
        for (Integer nb : list) {
            if (nb % 2 == 0) {
                tbc += nb;
                sochia++;
            } else if (nb == list.size() && nb % 2 == 1)
                System.out.println("Danh sach khong co phan tu chia het cho 2");
        }
        tbc = tbc / sochia;
        System.out.printf("Trung binh cong cac so trong danh sach la: %d", tbc);
        System.out.println();
    }

    public static void main(String[] args) {
        Bai2 b2 = new Bai2();
        b2.nhap();
        b2.TBC();
    }

}
>>>>>>> 229829951ab41813e6df6566d33030bad934e2e2
