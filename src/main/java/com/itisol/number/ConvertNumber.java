package com.itisol.number;

public class ConvertNumber {

    static final char COMMA = ',';
    static final int INDEX_ZERO = 0;

    public static String convertNumberToCommaFormattedString(int number) {
        StringBuilder numberBuilder = new StringBuilder();
        int numberControl = number;

        int thousand = 1000;

        while (numberControl > 0) {

            int remainingNumber = numberControl % thousand;

            String remaining = addMissingZeros(remainingNumber);

            numberBuilder.insert(INDEX_ZERO, remaining);
            numberBuilder.insert(INDEX_ZERO, COMMA);

            numberControl = numberControl/thousand;
        }

        //Remove Comma
        if (numberBuilder.length() > 0) {
            numberBuilder.deleteCharAt(INDEX_ZERO);
        }

        removeInitialZeros(numberBuilder);

        return numberBuilder.toString();
    }

    private static String addMissingZeros(int number) {
        return number == 0
                ? "000"
                : number < 10
                    ? "00" + number
                    : number < 100
                        ? "0" + number
                        : String.valueOf(number);
    }

    private static void removeInitialZeros(StringBuilder numberBuilder) {
        while (numberBuilder.charAt(INDEX_ZERO) == '0') {
            numberBuilder.deleteCharAt(INDEX_ZERO);
        }
    }
}
