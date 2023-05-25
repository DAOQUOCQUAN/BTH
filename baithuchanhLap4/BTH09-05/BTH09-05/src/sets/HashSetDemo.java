<<<<<<< HEAD
package sets;

import Student.student;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class HashSetDemo {

    public static void main(String[] args) {
        HashSet<student> hashSet = new HashSet<>();
        student std = new student();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap vao so luong sinh vien: ");
        n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            student stdent = new student();
            System.out.println("Nhap sinh vien thu " + (i + 1) + ":");
            std.nhapthongtin();
            hashSet.add(stdent);
        }
        std.hienthithongtin(hashSet);
        std.SuaThongTin(hashSet);
        std.XoaThongTin(hashSet);
    }
}
=======
package sets;

import Student.student;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class HashSetDemo {

    public static void main(String[] args) {
        HashSet<student> hashSet = new HashSet<>();
        student std = new student();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap vao so luong sinh vien: ");
        n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            student stdent = new student();
            System.out.println("Nhap sinh vien thu " + (i + 1) + ":");
            std.nhapthongtin();
            hashSet.add(stdent);
        }
        std.hienthithongtin(hashSet);
        std.SuaThongTin(hashSet);
        std.XoaThongTin(hashSet);
    }
}
>>>>>>> 229829951ab41813e6df6566d33030bad934e2e2
