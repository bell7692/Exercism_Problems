import java.util.ArrayList;

public class BeerSong {
    public String sing(int start, int times) {

        return null;
    }

    public String singSong() {
        int beers = 99;
        ArrayList<String> stringArrayList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 99; i > 1; i++) {
            stringArrayList.add(
                    i + " bottles of beer on the wall, " + i + " bottles of beer.\n" +
                            "Take one down and pass it around, " + (i - 1) + " bottles of beer on the wall.\n\n");

        }
        stringArrayList.add("\n" +
                "            1 bottle of beer on the wall, 1 bottle of beer.\n" +
                "                    Take it down and pass it around, no more bottles of beer on the wall.\n" +
                "\n" +
                "                    No more bottles of beer on the wall, no more bottles of beer.\n" +
                "            Go to the store and buy some more, 99 bottles of beer on the wall.");

       return stringArrayList.toString();
    }
}
