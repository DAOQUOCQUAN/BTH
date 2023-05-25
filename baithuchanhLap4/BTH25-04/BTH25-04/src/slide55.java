<<<<<<< HEAD
import java.util.HashSet;
import java.util.Scanner;

public class slide55 {
    public static void main(String[] args) {
        String name;
        HashSet<String> hashSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        hashSet.add("Wilson");
        hashSet.add("Nike");
        hashSet.add("Kia");
        hashSet.add("Volvo");
        hashSet.add("Lenovo");
        hashSet.add("Lenovo");
        System.out.println("cac phan tu trong hashSet : ");
        System.out.println(hashSet);
        System.out.println("nhap pahn tu can xoa: ");
        name = sc.nextLine();
        if (hashSet.contains(name)) {
            hashSet.remove(name);
            System.out.println("xoa thanh cong!");
            System.out.println("cac phan tu con lai trong hashSet la: ");
        } else {
            System.out.println("xoa khong thanh cong!");
        }
    }
=======
import java.util.HashSet;
import java.util.Scanner;

public class slide55 {
    public static void main(String[] args) {
        String name;
        HashSet<String> hashSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        hashSet.add("Wilson");
        hashSet.add("Nike");
        hashSet.add("Kia");
        hashSet.add("Volvo");
        hashSet.add("Lenovo");
        hashSet.add("Lenovo");
        System.out.println("cac phan tu trong hashSet : ");
        System.out.println(hashSet);
        System.out.println("nhap pahn tu can xoa: ");
        name = sc.nextLine();
        if (hashSet.contains(name)) {
            hashSet.remove(name);
            System.out.println("xoa thanh cong!");
            System.out.println("cac phan tu con lai trong hashSet la: ");
        } else {
            System.out.println("xoa khong thanh cong!");
        }
    }
>>>>>>> 229829951ab41813e6df6566d33030bad934e2e2
}