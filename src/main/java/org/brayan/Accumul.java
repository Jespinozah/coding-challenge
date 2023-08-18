package org.brayan;

public final class Accumul {

    public Accumul() {
        throw new AssertionError("Cannot be instantiated");
    }

    public static String accum(String input) {
        StringBuilder builder = new StringBuilder();
        int reps = 0;
        for (String ch : input.split("")) {
            builder.append(ch.toUpperCase());
            for (int i = 0; i < reps; i++) {
                builder.append(ch.toLowerCase());
            }
            reps++;
            if (reps < input.length()) {
                builder.append("-");
            }
        }

        return builder.toString();
    }
}
