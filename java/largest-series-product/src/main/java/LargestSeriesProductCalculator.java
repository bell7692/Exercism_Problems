import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

class LargestSeriesProductCalculator {

    public String inputNumber;

    public LargestSeriesProductCalculator(String inputNumber) {
        if(inputNumber.contains("[^0-9]")){
            throw new IllegalArgumentException("String to search may only contain digits.");
        }
        this.inputNumber = inputNumber;
    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) {
        if(inputNumber.length()< numberOfDigits){
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        }
        if(numberOfDigits < 0){
            throw new IllegalArgumentException("Series length must be non-negative.");
        }
        if(numberOfDigits == 0) {
            return 1;
        }

        long total = 1;
        long highestValue = 0;
        for(int i =0; i <= inputNumber.length()-numberOfDigits; i++ ){
            String subString = inputNumber.substring(i, i+numberOfDigits);
            String[] temp = subString.split("");
            for (String str: temp) {
                total *= Integer.valueOf(str);
            }
                if(total > highestValue){
                    highestValue = total;
                    total = 1;
             }
                total = 1;


        }
        return highestValue;


    }
}
