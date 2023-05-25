<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Scanner;

public class slide22 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("nhap so phan tu cua ArrayList : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("nhap phan tu thu " + i + ": ");
            number = sc.nextInt();
            arrayList.add(number);
        }
        int max = arrayList.get(0);
        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i).compareTo(max) > 0) {
                max = arrayList.get(i);
            }
        }
        System.out.print("phan tu lon nhat trong arraylist = " + max);
    }
}
=======
import java.util.ArrayList;
import java.util.Scanner;

public class slide22 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("nhap so phan tu cua ArrayList : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("nhap phan tu thu " + i + ": ");
            number = sc.nextInt();
            arrayList.add(number);
        }
        int max = arrayList.get(0);
        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i).compareTo(max) > 0) {
                max = arrayList.get(i);
            }
        }
        System.out.print("phan tu lon nhat trong arraylist = " + max);
    }
}
>>>>>>> 229829951ab41813e6df6566d33030bad934e2e2
