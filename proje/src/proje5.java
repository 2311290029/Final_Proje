import java.util.Scanner;

public class proje5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Beş basamaklı bir sayı girin: ");
        int fiveDigitsNumber = scanner.nextInt();

        String[] array = Integer.toString(fiveDigitsNumber).split("");

        for (String digit : array) {
            System.out.println(digit);
        }
    }
    }