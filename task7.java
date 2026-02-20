public class ReverseString {

    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String text = "hello";
        System.out.println("Original: " + text);
        System.out.println("Reversed: " + reverse(text));
    }
}
