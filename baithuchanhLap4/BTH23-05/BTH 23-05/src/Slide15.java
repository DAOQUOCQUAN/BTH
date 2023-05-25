import java.io.IOException;

public class Slide15 {
    void m() throws IOException {
        throw new IOException("loi thiet bi");
    }

    void n() throws IOException {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("ngoai le duoc su ly");
        }
    }

    public static void main(String[] args) {
        Slide15 std = new Slide15();
        std.p();
        System.out.println("luong binh thuong ......");
    }
}
