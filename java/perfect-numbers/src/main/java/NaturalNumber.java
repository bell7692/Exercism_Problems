import java.util.ArrayList;

class NaturalNumber {

    public int number;

    public NaturalNumber(int number) {
        this.number = number;
    }

    public ArrayList<Integer> getFactorsNotIncludingOneAndItself (){
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 1; i < this.number; i++) {
            if(this.number % i == 0){
                factors.add(i);
            }
        }
        return factors;
    }

    public Classification getClassification() throws IllegalArgumentException{

        if(this.number <= 0){
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }

        ArrayList<Integer> factors = getFactorsNotIncludingOneAndItself();
        int sum = 0;

        for (int i = 0; i < factors.size(); i++) {
            sum += factors.get(i);
        }

        if(sum == this.number){
            return Classification.PERFECT;
        }
        else if(sum > this.number){
            return Classification.ABUNDANT;
        }
        return Classification.DEFICIENT;

    }
}
