public class Slide13 {
    static void validate(int tuoi) {
        try {
            if (tuoi < 18)
                throw new ArithmeticException("not valid");
            else
                System.out.println("welcome");
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        validate(13);
        System.out.println("rest of the code .....");
    }
}
