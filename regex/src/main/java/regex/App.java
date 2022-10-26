package regex;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static boolean isValidHumanName(String name){
        if(name == null){
            return false;
        }
        String nameRegex = "([A-Z][a-zA-Z-.']* *)+";
        return name.matches(nameRegex);
    }

    public static boolean isValidEmailAdress(String email) {
        if(email == null){
            return false;
        }
        String emailRegex = "[a-zA-Z]+[0-9/_./]?@[a-zA-Z0-9]+.[a-zA-Z0-9]{3,4}";
        return email.matches(emailRegex);
    }

    public static boolean isValidPhoneNumber(String phone){
        if(phone == null){
            return false;
        }
        String phoneRegex = "[0-9]{0,2}-?[0-9]{3}-[0-9]{3}-[0-9]{4}";
        return phone.matches(phoneRegex);
    }

    public static boolean isValidSSN(String ssn){
        if(ssn == null){
            return false;
        }
        String ssnRegex = "[0-9]{3}-[0-9]{2}-[0-9]{4}";
        return ssn.matches(ssnRegex);
    }

    public static boolean validatePaswordComplexity(String password, int midlength, int minUpper, int minLower, int minNumeric, int minSymbols){
        return false;
    }

    // public static String[] getHTMLTagsContents(String html, String tagName){
        
    // }

    // public static String[] getHTMLLinkURL(String html){
        
    // }
}
