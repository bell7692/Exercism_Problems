class Hamming {

    String leftStrand;
    String rightStrand;

    Hamming(String leftStrand, String rightStrand) {
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;

    }

    int getHammingDistance() throws IllegalArgumentException {
        String[] leftStrandArray = leftStrand.split("");
        String[] rightStrandArray = rightStrand.split("");
        int countOfDifferences = 0;
        if (leftStrandArray.length != rightStrandArray.length){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");

            }
            for (int i = 0; i <leftStrandArray.length; i++) {

                if (!leftStrandArray[i].equals(rightStrandArray[i])) {
                    countOfDifferences++;
                }
            }



        int number = 123432;
        String[] numbers = String.valueOf(number).split("");

        return countOfDifferences;
    }



}
