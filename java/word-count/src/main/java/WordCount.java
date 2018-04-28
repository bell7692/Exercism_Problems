import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public Map<String,Integer> phrase(String word) {

        String[] temp = word.trim().toLowerCase().split("[ ,]");
        for (int i = 0; i <temp.length ; i++) {
            temp[i] = temp[i].replaceAll("'\\B|\\B'|[ .!&@$%:^&]", "");
        }



        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < temp.length; i++) {
            incrementValue(map,temp[i]);
        }

        return map;


    }


        public void incrementValue(Map<String, Integer> map, String key){
                Integer count = map.get(key);
                if (count == null){
                        count = 0;
                    }
                map.put(key, count +1);
            }
    public static void main(String[] args) {
        String temp = "'large'";
        String newTemp = temp.replaceAll("'\\B|\\B'|[.!&@$%^&]", "");
        System.out.println(temp);
        System.out.println(newTemp);

    }
}
