import java.util.Scanner;

public class proje3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk sayıyı girin: ");
        double num1 = scanner.nextDouble();

        System.out.print("İşlemi seçin (+, -, *, /): ");
        String operator = scanner.next();

        System.out.print("İkinci sayıyı girin: ");
        double num2 = scanner.nextDouble();

        double result;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Hata: Sıfıra bölme hatası!");
                    return;
                }
                break;
            default:
                System.out.println("Geçersiz operatör");
                return;
        }

        System.out.println("Sonuç: " + result);
    }
}
