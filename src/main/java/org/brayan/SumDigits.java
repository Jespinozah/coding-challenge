package org.brayan;

public final class SumDigits {
    public SumDigits() {
        throw new AssertionError("Cannot be instantiated");
    }

    public static int digitalRoot(int n) {
        var value = String.valueOf(n);
        int sum = 0;
        Boolean continueFlag = true;
        if (value.length() == 1) {
            return Integer.parseInt(value);
        }

        while (continueFlag) {
            for (String ch : String.valueOf(n).split("")) {
                sum += Integer.valueOf(ch);
            }

            if (sum > 9) {
                continueFlag = true;
                n = sum;
                sum = 0;
            } else {
                continueFlag = false;
            }
        }

        return sum;
    }

    public static int digitalRootV2(int n) {
        return (n != 0 && n % 9 == 0) ? 9 : n % 9;
    }
}
