package gr.aueb.cf.ch7;

public class EncryptionApp {
    public static void main(String[] args) {

        String s = "Athens";

        for (int i = 0; i < s.length(); i++) {
            char c = (char) (s.charAt(i) + 1);

            System.out.print(c);
        }
    }
}