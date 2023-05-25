<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Iterator;

public class slide18 {
    public static void main(String[] args) {
        ArrayList<Float> arrayListFloats = new ArrayList<>();
        arrayListFloats.add(0, 7f);
        arrayListFloats.add(7, 26f);
        arrayListFloats.add(1, 02f);
        arrayListFloats.add(9, 3f);
        Iterator<Float> iterator = arrayListFloats.iterator();
        System.out.print("cac phan tu trong arrayListFloats la :");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "\t");
        }
    }
=======
import java.util.ArrayList;
import java.util.Iterator;

public class slide18 {
    public static void main(String[] args) {
        ArrayList<Float> arrayListFloats = new ArrayList<>();
        arrayListFloats.add(0, 7f);
        arrayListFloats.add(7, 26f);
        arrayListFloats.add(1, 02f);
        arrayListFloats.add(9, 3f);
        Iterator<Float> iterator = arrayListFloats.iterator();
        System.out.print("cac phan tu trong arrayListFloats la :");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "\t");
        }
    }
>>>>>>> 229829951ab41813e6df6566d33030bad934e2e2
}