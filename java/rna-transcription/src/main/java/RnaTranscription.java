class RnaTranscription {

    String transcribe(String dnaStrand) {
        String [] dnaArray = dnaStrand.split("");
        String rna = "";
        for (String nucleotides : dnaArray) {
            switch (nucleotides) {
                case "G":
                    rna += "C";
                    break;
                case "C":
                    rna += "G";
                    break;
                case "T":
                    rna += "A";
                    break;
                case "A":
                    rna += "U";
                    break;

            }

        }
        return rna;
    }

}
