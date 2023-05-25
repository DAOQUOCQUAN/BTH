<<<<<<< HEAD
package Student;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class student {
    public String fullname;
    public int age;
    Scanner sc = new Scanner(System.in);

    public void nhapthongtin() {
        System.out.print("fullname = ");
        fullname = sc.nextLine();
        System.out.print("age =");
        age = sc.nextInt();
    }

    public void hienthithongtin(List<student> stdList) {
        for (int i = 0; i < stdList.size(); i++) {
            System.out.println(stdList.get(i).fullname);
            System.out.println(stdList.get(i).age);
        }
    }

    public void SuaThongTin(List<student> stdList) {
        System.out.println("Nhap stt muon chinh sua");
        int stt = sc.nextInt();
        student std = new student();
        for (int i = 0; i < stdList.size(); i++) {
            if (i + 1 == stt) {
                std.nhapthongtin();
                stdList.set(i, std);
                std.hienthithongtin(stdList);
            }
        }
    }

    public void XoaThongTin(List<student> stdList) {
        System.out.println("Nhap stt muon chinh xoa");
        int stt = sc.nextInt();
        student std = new student();
        for (int i = 0; i < stdList.size(); i++) {
            if (i + 1 == stt) {
                std.nhapthongtin();
                stdList.remove(i);
                std.hienthithongtin(stdList);
            }
        }
    }

    public void Add(List<student> stdList, int n) {
        for (int i = 0; i < n; i++) {
            student std = new student();
            std.nhapthongtin();
            stdList.add(std);
        }
    }

    public void hienthithongtin(HashSet<student> hashSet) {
        for (int i = 0; i < hashSet.size(); i++) {
            System.out.println(((List<student>) hashSet).get(i).fullname);
            System.out.println(((List<student>) hashSet).get(i).age);
        }
    }

    public void SuaThongTin(HashSet<student> hashSet) {
        System.out.println("Nhap stt muon chinh sua");
        int stt = sc.nextInt();
        student std = new student();
        for (int i = 0; i < hashSet.size(); i++) {
            if (i + 1 == stt) {
                std.nhapthongtin();
                ((List<student>) hashSet).set(i, std);
                std.hienthithongtin(hashSet);
            }
        }
    }

    public void XoaThongTin(HashSet<student> hashSet) {
        System.out.println("Nhap stt muon chinh xoa");
        int stt = sc.nextInt();
        student std = new student();
        for (int i = 0; i < hashSet.size(); i++) {
            if (i + 1 == stt) {
                std.nhapthongtin();
                hashSet.remove(i);
                std.hienthithongtin(hashSet);
            }
        }
    }

    public void Add(HashSet<student> hashSet, int n) {
        for (int i = 0; i < n; i++) {
            student std = new student();
            std.nhapthongtin();
            hashSet.add(std);
        }
    }
}
=======
package Student;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class student {
    public String fullname;
    public int age;
    Scanner sc = new Scanner(System.in);

    public void nhapthongtin() {
        System.out.print("fullname = ");
        fullname = sc.nextLine();
        System.out.print("age =");
        age = sc.nextInt();
    }

    public void hienthithongtin(List<student> stdList) {
        for (int i = 0; i < stdList.size(); i++) {
            System.out.println(stdList.get(i).fullname);
            System.out.println(stdList.get(i).age);
        }
    }

    public void SuaThongTin(List<student> stdList) {
        System.out.println("Nhap stt muon chinh sua");
        int stt = sc.nextInt();
        student std = new student();
        for (int i = 0; i < stdList.size(); i++) {
            if (i + 1 == stt) {
                std.nhapthongtin();
                stdList.set(i, std);
                std.hienthithongtin(stdList);
            }
        }
    }

    public void XoaThongTin(List<student> stdList) {
        System.out.println("Nhap stt muon chinh xoa");
        int stt = sc.nextInt();
        student std = new student();
        for (int i = 0; i < stdList.size(); i++) {
            if (i + 1 == stt) {
                std.nhapthongtin();
                stdList.remove(i);
                std.hienthithongtin(stdList);
            }
        }
    }

    public void Add(List<student> stdList, int n) {
        for (int i = 0; i < n; i++) {
            student std = new student();
            std.nhapthongtin();
            stdList.add(std);
        }
    }

    public void hienthithongtin(HashSet<student> hashSet) {
        for (int i = 0; i < hashSet.size(); i++) {
            System.out.println(((List<student>) hashSet).get(i).fullname);
            System.out.println(((List<student>) hashSet).get(i).age);
        }
    }

    public void SuaThongTin(HashSet<student> hashSet) {
        System.out.println("Nhap stt muon chinh sua");
        int stt = sc.nextInt();
        student std = new student();
        for (int i = 0; i < hashSet.size(); i++) {
            if (i + 1 == stt) {
                std.nhapthongtin();
                ((List<student>) hashSet).set(i, std);
                std.hienthithongtin(hashSet);
            }
        }
    }

    public void XoaThongTin(HashSet<student> hashSet) {
        System.out.println("Nhap stt muon chinh xoa");
        int stt = sc.nextInt();
        student std = new student();
        for (int i = 0; i < hashSet.size(); i++) {
            if (i + 1 == stt) {
                std.nhapthongtin();
                hashSet.remove(i);
                std.hienthithongtin(hashSet);
            }
        }
    }

    public void Add(HashSet<student> hashSet, int n) {
        for (int i = 0; i < n; i++) {
            student std = new student();
            std.nhapthongtin();
            hashSet.add(std);
        }
    }
}
>>>>>>> 229829951ab41813e6df6566d33030bad934e2e2
