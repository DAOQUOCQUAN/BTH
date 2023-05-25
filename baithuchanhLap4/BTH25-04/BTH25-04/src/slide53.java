<<<<<<< HEAD
import java.util.HashSet;
import java.util.Scanner;

public class slide53 {
    public static void main(String[] args) {
        int number;
        HashSet<Integer> hashSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        hashSet.add(0);
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(4);
        hashSet.add(2);
        hashSet.add(8);
        System.out.print("cac phan tu trong hashSet : ");
        System.out.print(hashSet);
        System.out.print("nhap phan tu can them : ");
        number = sc.nextInt();
        if (!hashSet.contains(number)) {
            hashSet.add(number);
            System.out.println("them thanh cong ! ");
            System.out.println("cac phan tu trong hashSet sau khi them : ");
            System.out.println(hashSet);
        } else {
            System.out.println("phan tu " + number + " da ton tai!");
        }
    }
}
=======
import java.util.HashSet;
import java.util.Scanner;

public class slide53 {
    public static void main(String[] args) {
        int number;
        HashSet<Integer> hashSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        hashSet.add(0);
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(4);
        hashSet.add(2);
        hashSet.add(8);
        System.out.print("cac phan tu trong hashSet : ");
        System.out.print(hashSet);
        System.out.print("nhap phan tu can them : ");
        number = sc.nextInt();
        if (!hashSet.contains(number)) {
            hashSet.add(number);
            System.out.println("them thanh cong ! ");
            System.out.println("cac phan tu trong hashSet sau khi them : ");
            System.out.println(hashSet);
        } else {
            System.out.println("phan tu " + number + " da ton tai!");
        }
    }
}
>>>>>>> 229829951ab41813e6df6566d33030bad934e2e2
