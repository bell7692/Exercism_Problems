class TwelveDays {

    String verse(int verseNumber) {
        String str = "";
        switch (verseNumber){
            case 1:str = "On the first day of Christmas my true love gave to me, a Partridge in a Pear Tree.\n";
                break;
            case 2:str ="On the second day of Christmas my true love gave to me, two Turtle Doves, and a Partridge in a Pear Tree.\n";
                break;
            case 3:str ="On the third day of Christmas my true love gave to me, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
                break;
            case 4:str ="On the fourth day of Christmas my true love gave to me, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
                break;
            case 5:str ="On the fifth day of Christmas my true love gave to me, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
                break;
            case 6:str ="On the sixth day of Christmas my true love gave to me, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
                break;
            case 7:str ="On the seventh day of Christmas my true love gave to me, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
                break;
            case 8:str ="On the eighth day of Christmas my true love gave to me, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
                break;
            case 9:str ="On the ninth day of Christmas my true love gave to me, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
                break;
            case 10:str ="On the tenth day of Christmas my true love gave to me, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
                break;
            case 11:str ="On the eleventh day of Christmas my true love gave to me, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
                break;
            case 12:str ="On the twelfth day of Christmas my true love gave to me, twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
                break;
        }
        return str;
    }

    String verses(int startVerse, int endVerse) {
        String finalVerse = "";
        for (int i = startVerse; i < endVerse; i++) {
            finalVerse += verse(i)+"\n";

        }
        return finalVerse + verse(endVerse);
    }
    
    String sing() {
        return verses(1, 12);
    }
}
