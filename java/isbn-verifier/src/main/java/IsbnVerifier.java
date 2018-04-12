import java.util.regex.Pattern;

class IsbnVerifier {

    boolean isValid(String stringToVerify) {
        Pattern p = Pattern.compile("[0-9]+");

        if(stringToVerify.matches(p))
        if(stringToVerify.length() == 11){
            return true;
        }
        if(stringToVerify.contains("X") && stringToVerify.length()==10){
            return true;
        }


        for (int i = 10; i <=1 ; i++) {


        }
    }

}
