import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        Set<String> set = new HashSet<String>();
        String string = phrase.replaceAll("[^A-Za-z]", "");
        String[] temp = string.toLowerCase().split("");
        for (String str : temp) {
            set.add(str);
        }

        if (set.size() == temp.length) {
            return true;
        }
        return false;

    }

}
