import java.util.ArrayList;

class LuhnValidator {

    boolean isValid(String candidate) {
        if(candidate.length() <= 1){
            return false;
        }
        if (candidate.contains("[^\\d]")) {
            return false;
        }

        String [] temp = candidate.replaceAll( " ", "").split("");
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <temp.length ; i++) {
            numbers.add(Integer.valueOf(temp[i]));
        }

        ArrayList<Integer> secondNums = new ArrayList<>();
        for (int i = numbers.size()-1; i <=0 ; i-=2) {
            if((numbers.get(i)*2) > 9){
                secondNums.add((numbers.get(i) * 2) - 9);
            }
            secondNums.add((numbers.get(i) * 2));
        }

        int total = 0;
        for (int i = 0; i <secondNums.size() ; i++) {
            total += secondNums.get(i);
        }

        if( total % 10 == 0){
            return true;
        }
        return false;

    }

}
