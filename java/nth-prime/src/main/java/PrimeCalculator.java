import java.util.ArrayList;

class PrimeCalculator {

    int nth(int nth) {
        if(nth == 0){
            throw new IllegalArgumentException();
        }
        ArrayList<Integer> primeArray = new ArrayList<>();
        int index = 0;
        int i = 2;
        while(index != nth) {
            if (primes(i) == true) {
                primeArray.add(i);
                index++;
                i++;
            } else {
                i++;
            }
        }
       // System.out.println(primeArray.toString());
        return primeArray.get(primeArray.size()-1);
    }
    public boolean primes(int num){
        if(num == 0 || num == 1){
            return false;
        }
        for(int i = 2; i < num; i++){
            if(num % i == 0){
               // System.out.println(num + " is not prime");
                return false;
            }
        }
       // System.out.println(num + " is prime");
        return true;
    }

}
