import java.util.ArrayList;
import java.util.Arrays;

class Proverb {

    public String[] words;

    public Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
       if(this.words.length == 0){
           return "";
       }
       if(this.words.length == 1){
           return "And all for the want of a " + this.words[0] +".";
       }
        ArrayList<String> firstWord = new ArrayList<>(Arrays.asList(this.words));
        firstWord.remove(firstWord.size()-1);

        ArrayList<String> secondWord = new ArrayList<>(Arrays.asList(this.words));
        secondWord.remove(0);

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < firstWord.size(); i++){
            sb.append(
                    String.format("For want of a %s the %s was lost.\n",
                            firstWord.get(i), secondWord.get(i)));
        }
        sb.append(String.format("And all for the want of a %s.",
                firstWord.get(0)));
        return sb.toString();
    }

}
