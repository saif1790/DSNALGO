package ValidationUtilities;

public class ValidMobileNumber {

  public static void main(String[] args) {

    String mobileNumber = "6908595821";
    String regex = "^[6-9]\\d{9}$";
    boolean matches = mobileNumber.matches(regex);
    System.out.println(matches);
  }
}
