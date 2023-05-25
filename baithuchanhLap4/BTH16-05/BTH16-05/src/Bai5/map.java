<<<<<<< HEAD
package Bai5;

import java.util.HashMap;
import java.util.Scanner;

public class map extends student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, student> SINHVIEN = new HashMap<>();
        int n;
        System.out.print("nhap so luong sinh vien : ");
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("nhap thong tin thu " + (i + 1) + " la: ");
            student std = new student();
            std.nhapthongtin();
            SINHVIEN.put(std.masinhvien, std);
        }
        System.out.print("Nhap ten lop muon tim:");
        String classString = scanner.nextLine();
        for (student sVien : SINHVIEN.values()) {
            if (sVien.lop.equals(classString)) {
                sVien.hienthi();
            }
        }
        System.out.print("Nhap ma sinh vien muon tim:");
        String ma = scanner.nextLine();
        for (student sVien : SINHVIEN.values()) {
            if (sVien.masinhvien.equals(ma)) {
                System.out.printf("Ma Sinh vien %s :", ma);
                System.out.println("Ho va Ten: " + sVien.fullname);
                System.out.println("Lop: " + sVien.lop);
            }
        }
    }
}
=======
package Bai5;

import java.util.HashMap;
import java.util.Scanner;

public class map extends student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, student> SINHVIEN = new HashMap<>();
        int n;
        System.out.print("nhap so luong sinh vien : ");
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("nhap thong tin thu " + (i + 1) + " la: ");
            student std = new student();
            std.nhapthongtin();
            SINHVIEN.put(std.masinhvien, std);
        }
        System.out.print("Nhap ten lop muon tim:");
        String classString = scanner.nextLine();
        for (student sVien : SINHVIEN.values()) {
            if (sVien.lop.equals(classString)) {
                sVien.hienthi();
            }
        }
        System.out.print("Nhap ma sinh vien muon tim:");
        String ma = scanner.nextLine();
        for (student sVien : SINHVIEN.values()) {
            if (sVien.masinhvien.equals(ma)) {
                System.out.printf("Ma Sinh vien %s :", ma);
                System.out.println("Ho va Ten: " + sVien.fullname);
                System.out.println("Lop: " + sVien.lop);
            }
        }
    }
}
>>>>>>> 229829951ab41813e6df6566d33030bad934e2e2
