import java.util.ArrayList;

class LuhnValidator {

    boolean isValid(String candidate) {
        String string = candidate.replaceAll(" ", "");
        if ((string.length() <= 1) || (!string.matches("[\\d]+"))) {
            return false;
        }
        String[] temp = string.split("");
        int total = 0;

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < temp.length; i++) {
            numbers.add(Integer.valueOf(temp[i]));
        }
        for (int i = numbers.size() - 2; i >= 0; i -= 2) {
            numbers.add(i, numbers.get(i)*2);
            if(numbers.get(i)>9){
                numbers.add(i, numbers.get(i)-9);
            }
//            if ((numbers.get(i) * 2) > 9) {
//                numbers.add(i, ((numbers.get(i) * 2) - 9));
//            } else {
//                numbers.add(i, (numbers.get(i) * 2));
//            }
        }
        for (int i = 0; i < numbers.size(); i++) {
            total += numbers.get(i);
        }

        return (total % 10 == 0);
    }

}
