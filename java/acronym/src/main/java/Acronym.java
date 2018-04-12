class Acronym {

    String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        String[] phraseArray = this.phrase.split("[\\s-]+");
        String acronym = "";
        for (int i = 0; i < phraseArray.length; i++) {
            acronym += phraseArray[i].substring(0,1).toUpperCase();
        }
        return acronym;
    }

}
