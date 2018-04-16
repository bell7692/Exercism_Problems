import java.util.ArrayList;
import java.util.List;

class Sieve {
    public int maxPrime;

    public Sieve(int maxPrime) {
        this.maxPrime = maxPrime;
    }

    List<Integer> getPrimes() {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i < maxPrime ; i++) {
            list.add(i);
        }

        for(int i = 2; i < list.size(); i+=2){
            list.remove(i);
        }

//        for(int i = 1; i < list.size(); i+=3){
//            list.remove(i);
//        }
//        for(int i = 2; i < list.size(); i+=5){
//            list.remove(i);
//        }
//        for(int i = 3; i < list.size(); i+=7){
//            list.remove(i);
//        }
//        for(int i = 3; i < list.size(); i+=11){
//            list.remove(i);
//        }


        return list;

    }
}
