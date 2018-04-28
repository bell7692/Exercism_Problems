import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {

        List<String > list = new ArrayList<>();
        for (int i = 0; i <rnaSequence.length() ; i++) {
            list.add()
        }


    }

    static String canConstruct(int[] a) {
        // Return "Yes" or "No" denoting whether you can construct the required number.
        String[] tempArr = Arrays.toString(a).split("");

        int total = 0;
        for(int n = 0; n < tempArr.length; n++){

            total += Integer.valueOf(tempArr[n]);
        }
        if(total%3==0){
            return "Yes";
        }
        return "No";
    }

}