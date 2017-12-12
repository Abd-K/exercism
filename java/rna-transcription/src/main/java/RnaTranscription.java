class RnaTranscription {

    String transcribe(String dnaStrand) {
        String rnaValue = "";
        for (char c:dnaStrand.toCharArray()) {
            switch(c){
                case 'G':
                    rnaValue =rnaValue.concat("C");
                    break;
                case 'C':
                    rnaValue =rnaValue.concat("G");
                    break;
                case 'T':
                    rnaValue =rnaValue.concat("A");
                    break;
                case 'A':
                    rnaValue =rnaValue.concat("U");
                    break;
                default:
                    throw new IllegalArgumentException("Invalid input");
                }
        }
        return rnaValue;
    }

}
