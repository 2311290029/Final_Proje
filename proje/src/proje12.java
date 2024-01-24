public class proje12 {
    public static void main(String[] args) {
        String text = "Programlama";
        char[] firstArray = text.toCharArray();

        int i = 0;
        String str;

        System.out.println(text);

        while (i < 3) {
            str = "";
            char firstChar = Character.toLowerCase(firstArray[0]);
            System.arraycopy(firstArray, 1, firstArray, 0, firstArray.length - 1);
            firstArray[firstArray.length - 1] = firstChar;

            for (char c : firstArray) {
                str += c;
            }

            System.out.println(str);
            i++;
        }
    }
}
