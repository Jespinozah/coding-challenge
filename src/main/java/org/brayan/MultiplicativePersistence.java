package org.brayan;

public final class MultiplicativePersistence {
    public MultiplicativePersistence() {
        throw new AssertionError("Cannot be instantiated");
    }

    public static int persistence(long input) {
        String inputString = Long.toString(input);
        int result = 1, temp, counter = 1;
        boolean continueFlag = true;
        if (inputString.length() == 1) return 0;
        while (continueFlag) {
            for (String ch : inputString.split("")) {
                temp = Integer.valueOf(ch);
                result = result * temp;
            }

            if (result / 10 == 0) {
                continueFlag = false;
            } else {
                counter++;
            }

            inputString = String.valueOf(result);
            result = 1;
        }

        return counter;
    }
}
