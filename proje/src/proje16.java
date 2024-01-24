import java.util.Scanner;

public class proje16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Aranan karakteri girin: ");
        char givenChar = scanner.next().charAt(0);

        int result = findCountOfLetter(givenChar);
        System.out.println("Karakterin metindeki sayısı: " + result);
    }

    public static int findCountOfLetter(char searchChar) {
        String text = "programlama";
        int count = 0;

        for (char character : text.toCharArray()) {
            if (character == searchChar) {
                count++;
            }
        }

        return count;
    }
}
