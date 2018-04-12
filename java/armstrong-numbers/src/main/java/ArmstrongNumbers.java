class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
        int total = 0;
	    String [] digits = Integer.toString(numberToCheck).split("");
        for (int i = 0; i < digits.length; i++) {
            total += Math.pow((Integer.valueOf(digits[i])), digits.length);
        }
        if(total == numberToCheck){
            return true;
        }
        return false;

    }

}
