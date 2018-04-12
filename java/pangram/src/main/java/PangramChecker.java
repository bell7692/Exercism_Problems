public class PangramChecker {

    public boolean isPangram(String input) {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            if (input.indexOf(ch) < 0
                    && input.indexOf((char) (ch + 32)) < 0) {
                return false;
            }
        }

        return true;
    }


}
