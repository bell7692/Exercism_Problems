class Scrabble {

    String word;

    Scrabble(String word) {
        this.word = word;
    }

    int getScore() {
        char[] wordArray = this.word.toUpperCase().toCharArray();
        int totalPoints = 0;
        for (char c: wordArray){
            switch (c){
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'L':
                case 'N':
                case 'R':
                case 'S':
                case 'T': totalPoints += 1;
                break;
                case 'D':
                case 'G': totalPoints += 2;
                break;
                case 'B':
                case 'C':
                case 'M':
                case 'P': totalPoints += 3;
                break;
                case 'F':
                case 'H':
                case 'V':
                case 'W':
                case 'Y': totalPoints +=  4;
                break;
                case 'K': totalPoints +=  5;
                break;
                case 'J':
                case 'X':  totalPoints += 8;
                break;
                case 'Q':
                case 'Z':  totalPoints += 10;
                break;
            }
        }
        return totalPoints;
    }

}
