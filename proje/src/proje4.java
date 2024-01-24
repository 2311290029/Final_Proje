public class proje4 {
    public static void main(String[] args) {
        String first = "";
        String last = "*****";

        for (int i = 0; i < 5; i++) {
            first += "*";
            System.out.println(first);
        }

        for (int k = 5; k > 0; k--) {
            last = last.substring(0, last.length() - 1);
            System.out.println(last);
        }

    }
}