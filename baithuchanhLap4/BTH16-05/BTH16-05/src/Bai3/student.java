<<<<<<< HEAD
package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class student {
    Scanner sc = new Scanner(System.in);
    public String fullname;
    public float diem;

    public void NhapThongTin() {
        System.out.print("Nhap FullName: ");
        fullname = sc.nextLine();
        System.out.print("Nhap Diem: ");
        diem = sc.nextFloat();
    }

    public void HienThiThongTin(ArrayList<student> stdList) {
        System.out.println("\nDanh sach sinh vien trong danh sach la: ");
        for (int i = 0; i < stdList.size(); i++) {
            System.out.printf("Sinh vien thu %d la: ", i + 1);
            System.out.println();
            System.out.print("Ho va ten: " + stdList.get(i).fullname);
            System.out.println();
            System.out.print("Diem: " + stdList.get(i).diem);
            System.out.println();
        }
    }

    public void Dem(ArrayList<student> stdList) {
        int count = 0;
        System.out.println("Nhung sinh vien co diem <= 5 phai thi lai la:");
        for (int i = 0; i < stdList.size(); i++) {
            if (stdList.get(i).diem <= 5) {
                count++;
                System.out.println("Sinh vien stt " + (i + 1) + ":");
                System.out.println(stdList.get(i).fullname);
                System.out.println(stdList.get(i).diem);
            }
        }
        System.out.printf("So sinh vien thi lai trong danh sach la: %d", count);
        System.out.println();
    }

    public void HienThiDiemCao(ArrayList<student> stdList) {
        Float maxDiem;
        String nameDiemCao;
        maxDiem = stdList.get(0).diem;
        nameDiemCao = stdList.get(0).fullname;
        System.out.println("Danh sach sinh vien diem cao la:");
        for (int i = 0; i < stdList.size(); i++) {
            if (stdList.get(i).diem > maxDiem) {
                maxDiem = stdList.get(i).diem;
                nameDiemCao = stdList.get(i).fullname;
            }
        }
        System.out.println("FullName: " + nameDiemCao);
        System.out.println("Diem " + maxDiem);
    }

    public void TimKiem(ArrayList<student> stdList) {
        String findName;
        System.out.println("Nhap ten sinh vien can tim kiem:");
        findName = sc.nextLine();
        for (int i = 0; i < stdList.size(); i++) {
            if (findName.equals(stdList.get(i).fullname)) {
                System.out.println("Sinh vien ban vua tim co thong tin la:");
                System.out.println("Ho va Ten: " + stdList.get(i).fullname);
                System.out.println("Diem: " + stdList.get(i).diem);
                return;
            }
        }
    }
}
=======
package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class student {
    Scanner sc = new Scanner(System.in);
    public String fullname;
    public float diem;

    public void NhapThongTin() {
        System.out.print("Nhap FullName: ");
        fullname = sc.nextLine();
        System.out.print("Nhap Diem: ");
        diem = sc.nextFloat();
    }

    public void HienThiThongTin(ArrayList<student> stdList) {
        System.out.println("\nDanh sach sinh vien trong danh sach la: ");
        for (int i = 0; i < stdList.size(); i++) {
            System.out.printf("Sinh vien thu %d la: ", i + 1);
            System.out.println();
            System.out.print("Ho va ten: " + stdList.get(i).fullname);
            System.out.println();
            System.out.print("Diem: " + stdList.get(i).diem);
            System.out.println();
        }
    }

    public void Dem(ArrayList<student> stdList) {
        int count = 0;
        System.out.println("Nhung sinh vien co diem <= 5 phai thi lai la:");
        for (int i = 0; i < stdList.size(); i++) {
            if (stdList.get(i).diem <= 5) {
                count++;
                System.out.println("Sinh vien stt " + (i + 1) + ":");
                System.out.println(stdList.get(i).fullname);
                System.out.println(stdList.get(i).diem);
            }
        }
        System.out.printf("So sinh vien thi lai trong danh sach la: %d", count);
        System.out.println();
    }

    public void HienThiDiemCao(ArrayList<student> stdList) {
        Float maxDiem;
        String nameDiemCao;
        maxDiem = stdList.get(0).diem;
        nameDiemCao = stdList.get(0).fullname;
        System.out.println("Danh sach sinh vien diem cao la:");
        for (int i = 0; i < stdList.size(); i++) {
            if (stdList.get(i).diem > maxDiem) {
                maxDiem = stdList.get(i).diem;
                nameDiemCao = stdList.get(i).fullname;
            }
        }
        System.out.println("FullName: " + nameDiemCao);
        System.out.println("Diem " + maxDiem);
    }

    public void TimKiem(ArrayList<student> stdList) {
        String findName;
        System.out.println("Nhap ten sinh vien can tim kiem:");
        findName = sc.nextLine();
        for (int i = 0; i < stdList.size(); i++) {
            if (findName.equals(stdList.get(i).fullname)) {
                System.out.println("Sinh vien ban vua tim co thong tin la:");
                System.out.println("Ho va Ten: " + stdList.get(i).fullname);
                System.out.println("Diem: " + stdList.get(i).diem);
                return;
            }
        }
    }
}
>>>>>>> 229829951ab41813e6df6566d33030bad934e2e2
