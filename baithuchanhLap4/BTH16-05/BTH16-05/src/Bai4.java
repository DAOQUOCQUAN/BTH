<<<<<<< HEAD
import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Bai4 {
    private static HashSet<String> strSet1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> strSet = new HashSet<>();
        int n;
        String traicay;
        System.out.print("nhap so loai trai cay can nhap: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("ten loai trai cay thu " + (i + 1) + " la: ");
            traicay = scanner.nextLine();
            strSet.add(traicay);
        }
        System.out.print("danh sach so trai cay la : ");
        System.out.print(strSet);
        System.out.print("So luong trai cay trong danh sach la: ");
        System.out.println(strSet.size());
        System.out.print("Nhap ten trai cay ban muon tim kiem: ");
        Scanner scn = new Scanner(System.in);
        String timkiem = scn.nextLine();
        if (strSet.contains(timkiem)) {
            System.out.printf("Danh sach da co %s", timkiem);
            System.out.println();
        } else {
            System.out.printf("Danh sach khong co %s", timkiem);
            System.out.println();
        }
        System.out.print("Nhap ten trai cay ban muon xoa: ");
        String xoatraicay = scn.nextLine();
        if (strSet.contains(xoatraicay)) {
            strSet.remove(xoatraicay);
            System.out.println("Da xoa %s " + xoatraicay + "khoi danh sach");
            System.out.println("Danh sach con lai cac loai trai cay la:");
            System.out.println(strSet);
        } else {
            System.out.printf("Danh sach khong co trai cay %s", xoatraicay);
            System.out.println();
        }
        HashSet<String> stdSet1 = new HashSet<>();
        String traicays1;
        System.out.print("nhap so loai trai cay can nhap them la: ");
        n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("ten loai trai cay thu" + (i + 1) + "la: ");
            traicays1 = sc.nextLine();
            strSet1.add(traicays1);
        }
    }

    Iterator<String> them = strSet1.iterator();
    {

        while (them.hasNext()) {
            String str = them.next();
            stdSet.add(str);
        }
        System.out.println("Danh sach cac loai trai cay trong stdSet sau khi them la:");
        System.out.println(stdSet);
        stdSet.removeAll(stdSet1);
        System.out.println("Danh sach trai cay trong stdSet1 sau khi xoa la:");
        System.out.println(stdSet);
        System.out.println();

    }
}
=======
import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Bai4 {
    private static HashSet<String> strSet1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> strSet = new HashSet<>();
        int n;
        String traicay;
        System.out.print("nhap so loai trai cay can nhap: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("ten loai trai cay thu " + (i + 1) + " la: ");
            traicay = scanner.nextLine();
            strSet.add(traicay);
        }
        System.out.print("danh sach so trai cay la : ");
        System.out.print(strSet);
        System.out.print("So luong trai cay trong danh sach la: ");
        System.out.println(strSet.size());
        System.out.print("Nhap ten trai cay ban muon tim kiem: ");
        Scanner scn = new Scanner(System.in);
        String timkiem = scn.nextLine();
        if (strSet.contains(timkiem)) {
            System.out.printf("Danh sach da co %s", timkiem);
            System.out.println();
        } else {
            System.out.printf("Danh sach khong co %s", timkiem);
            System.out.println();
        }
        System.out.print("Nhap ten trai cay ban muon xoa: ");
        String xoatraicay = scn.nextLine();
        if (strSet.contains(xoatraicay)) {
            strSet.remove(xoatraicay);
            System.out.println("Da xoa %s " + xoatraicay + "khoi danh sach");
            System.out.println("Danh sach con lai cac loai trai cay la:");
            System.out.println(strSet);
        } else {
            System.out.printf("Danh sach khong co trai cay %s", xoatraicay);
            System.out.println();
        }
        HashSet<String> stdSet1 = new HashSet<>();
        String traicays1;
        System.out.print("nhap so loai trai cay can nhap them la: ");
        n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("ten loai trai cay thu" + (i + 1) + "la: ");
            traicays1 = sc.nextLine();
            strSet1.add(traicays1);
        }
    }

    HashSet<String> stdSet;
    HashSet<String> stdSet1;
    Iterator<String> iterator = strSet1.iterator();
    {

        while (iterator.hasNext()) {
            String eString = iterator.next();
            stdSet.add(eString);
        }
        System.out.println("Danh sach cac loai trai cay trong stdSet sau khi them la:");
        System.out.println(stdSet);
        stdSet.removeAll(stdSet1);
        System.out.println("Danh sach trai cay trong stdSet1 sau khi xoa la:");
        System.out.println(stdSet);
        System.out.println();

    }
}
>>>>>>> 229829951ab41813e6df6566d33030bad934e2e2
