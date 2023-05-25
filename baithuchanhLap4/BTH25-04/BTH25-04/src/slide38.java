<<<<<<< HEAD
import java.util.LinkedList;

public class slide38 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");
        LinkedList<String> listA = new LinkedList<String>();
        listA.addAll(list);
        System.out.print("listA:");
        showList(listA);
        LinkedList<String> listB = new LinkedList<>();
        listB.add("Java");
        listA.retainAll(listB);
        System.out.print("listA:");
        list.removeAll(listB);
        System.out.print("list");
        showList(list);
    }

    private static void showList(LinkedList<String> list) {
        for (String obj : list) {
            System.out.print("\t" + obj + ",");
        }
        System.out.println();
    }
}
=======
import java.util.LinkedList;

public class slide38 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");
        LinkedList<String> listA = new LinkedList<String>();
        listA.addAll(list);
        System.out.print("listA:");
        showList(listA);
        LinkedList<String> listB = new LinkedList<>();
        listB.add("Java");
        listA.retainAll(listB);
        System.out.print("listA:");
        list.removeAll(listB);
        System.out.print("list");
        showList(list);
    }

    private static void showList(LinkedList<String> list) {
        for (String obj : list) {
            System.out.print("\t" + obj + ",");
        }
        System.out.println();
    }
}
>>>>>>> 229829951ab41813e6df6566d33030bad934e2e2
