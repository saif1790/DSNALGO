import java.util.Base64;

public class MaskChar {

    public static void main(String[] args) {
        String carNumber = "786543889986";
        String s1 = maskChar(carNumber);
        System.out.println("Credit Card Number "+carNumber+" after masking : "+s1);
    }

    public static String maskChar(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 4) {
                sb.append("X");
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
