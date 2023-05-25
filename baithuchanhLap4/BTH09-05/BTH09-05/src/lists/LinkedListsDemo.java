<<<<<<< HEAD
package lists;

import java.util.LinkedList;
import java.util.Scanner;

import Student.student;

public class LinkedListsDemo {
    public static void main(String[] args) throws Exception {
        LinkedList<student> stdLists = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        student std = new student();
        std.Add(stdLists, 4);
        std.hienthithongtin(stdLists);
        std.SuaThongTin(stdLists);
        std.XoaThongTin(stdLists);

    }
}
=======
package lists;

import java.util.LinkedList;
import java.util.Scanner;

import Student.student;

public class LinkedListsDemo {
    public static void main(String[] args) throws Exception {
        LinkedList<student> stdLists = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        student std = new student();
        std.Add(stdLists, 4);
        std.hienthithongtin(stdLists);
        std.SuaThongTin(stdLists);
        std.XoaThongTin(stdLists);

    }
}
>>>>>>> 229829951ab41813e6df6566d33030bad934e2e2
