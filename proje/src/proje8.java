public class proje8 {
    public static void main(String[] args) {
        int[] fibonacci = {0, 1};
        int count = 20;

        for (int i = 0; i < count - 2; i++) {
            int nextNumber = i + 1;
            int nextFibonacci = fibonacci[i] + fibonacci[nextNumber];
            int[] newArray = new int[fibonacci.length + 1];

            System.arraycopy(fibonacci, 0, newArray, 0, fibonacci.length);
            newArray[fibonacci.length] = nextFibonacci;

            fibonacci = newArray;
        }

        for (int num : fibonacci) {
            System.out.print(num + " ");
        }
    }
}
