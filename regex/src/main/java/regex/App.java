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

    }

    public static boolean isValidEmailAdress(String email) {
        
    }

    public static boolean isValidPhoneNumbedr(String phone){
        if(phone == null){
            return false;
        }
        String regexPhoneString = "[0-9]{0,2}-?[0-9]{3}-[0-9]{3}-[0-9]{4}";
        return phone.matches(regexPhoneString);
    }

    public static boolean isValidSSN(String ssn){

    }

    public static boolean validatePaswordComplexity(String password, int midlength, int minUpper, int minLower, int minNumeric, int minSymbols){

    }

    public static String[] getHTMLTagsContents(String html, String tagName){

    }

    public static String[] getHTMLLinkURL(String html){
        
    }
}
