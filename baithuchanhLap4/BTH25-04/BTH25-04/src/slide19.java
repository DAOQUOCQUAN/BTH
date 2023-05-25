<<<<<<< HEAD
import java.util.ArrayList;
import java.util.ListIterator;

public class slide19 {
    public static void main(String[] args) {
        ArrayList<Character> arrayListChar = new ArrayList<>();
        arrayListChar.add('a');
        arrayListChar.add('e');
        arrayListChar.add('b');
        arrayListChar.add('c');
        ListIterator<Character> listIterator = arrayListChar.listIterator();
        System.out.print("cac phan tu cua ListIterator la : ");
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + "\t");
        }
    }
=======
import java.util.ArrayList;
import java.util.ListIterator;

public class slide19 {
    public static void main(String[] args) {
        ArrayList<Character> arrayListChar = new ArrayList<>();
        arrayListChar.add('a');
        arrayListChar.add('e');
        arrayListChar.add('b');
        arrayListChar.add('c');
        ListIterator<Character> listIterator = arrayListChar.listIterator();
        System.out.print("cac phan tu cua ListIterator la : ");
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + "\t");
        }
    }
>>>>>>> 229829951ab41813e6df6566d33030bad934e2e2
}