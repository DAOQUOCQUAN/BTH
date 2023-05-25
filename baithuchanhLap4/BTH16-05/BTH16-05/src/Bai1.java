<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {
    /**
     * @param args
     */
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> numbers = new ArrayList<>();

    public void nhapthongtin() {
        int n;
        System.out.print("nhap so phan tu : ");
        n = sc.nextInt();
        System.out.print("nhap day so: ");
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            numbers.add(number);
        }
    }

    public void HienThi() {
        System.out.println("Cac phan tu trong List la");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Phan tu thu " + (i + 1) + " la: " + numbers.get(i));
        }
    }

    public void solonnhat() {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        System.out.printf("so nguyen co gia tri lon nhat la : %d", max);
    }

    public void xoaphantu() {
        int soCanTim;
        System.out.println("Nhap so can xoa trong List");
        soCanTim = sc.nextInt();
        for (Integer nb : numbers) {
            if (soCanTim == nb) {
                numbers.remove(nb);
            }
        }
        System.out.printf("Danh sach sau khi xoa phan tu la:", numbers);
    }

    public void sapxep() {
        numbers.sort(null);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("cac phan tu duoc sap xep la: " + numbers.get(i));
        }
    }

    public static void main(String[] args) {
        Bai1 b1 = new Bai1();
        b1.nhapthongtin();
        b1.HienThi();
        b1.solonnhat();
        b1.xoaphantu();
        b1.HienThi();
        b1.sapxep();

    }
}
=======
import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {
    /**
     * @param args
     */
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> numbers = new ArrayList<>();

    public void nhapthongtin() {
        int n;
        System.out.print("nhap so phan tu : ");
        n = sc.nextInt();
        System.out.print("nhap day so: ");
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            numbers.add(number);
        }
    }

    public void HienThi() {
        System.out.println("Cac phan tu trong List la");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Phan tu thu " + (i + 1) + " la: " + numbers.get(i));
        }
    }

    public void solonnhat() {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        System.out.printf("so nguyen co gia tri lon nhat la : %d", max);
    }

    public void xoaphantu() {
        int soCanTim;
        System.out.println("Nhap so can xoa trong List");
        soCanTim = sc.nextInt();
        for (Integer nb : numbers) {
            if (soCanTim == nb) {
                numbers.remove(nb);
            }
        }
        System.out.printf("Danh sach sau khi xoa phan tu la:", numbers);
    }

    public void sapxep() {
        numbers.sort(null);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("cac phan tu duoc sap xep la: " + numbers.get(i));
        }
    }

    public static void main(String[] args) {
        Bai1 b1 = new Bai1();
        b1.nhapthongtin();
        b1.HienThi();
        b1.solonnhat();
        b1.xoaphantu();
        b1.HienThi();
        b1.sapxep();

    }
}
>>>>>>> 229829951ab41813e6df6566d33030bad934e2e2
