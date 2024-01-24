public class proje10 {
    public static void main(String[] args) {
        int primeCount = 20;
        printPrimes(primeCount);
    }

    public static void printPrimes(int count) {
        int[] primeNumbers = new int[count];
        int index = 0;

        for (int i = 2; ; i++) {
            boolean isPrime = true;

            for (int k = 2; k < i; k++) {
                if (i % k == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primeNumbers[index++] = i;
            }

            if (index == count) {
                printArray(primeNumbers);
                return;
            }
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
