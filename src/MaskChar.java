import java.util.Base64;

public class MaskChar {

    public static void main(String[] args) {
        String carNumber = "987612340008";
        String s1 = maskChar(carNumber, 'X');
        System.out.println("Credit Card Number " + carNumber + " after masking : " + s1);
    }

    public static String maskChar(String cardNumber, char maskChar) {
        StringBuilder sb = new StringBuilder();
        int creditCardLength = cardNumber.length();
        if (cardNumber != null && cardNumber.length() > 4) {
            for (int i = 0; i < creditCardLength; i++) {
                if(i <  (creditCardLength - 4)) {
                    sb.append(maskChar);
                }else{
                    sb.append(cardNumber.charAt(i));
                }
            }
            return sb.toString();
        }
        return sb.append(cardNumber).toString();
    }
}
