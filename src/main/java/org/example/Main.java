package org.example;

public class Main {

    public static String toCellReference(int columnNumber, int rowNumber) {
        String rowPart = Integer.toString(rowNumber + 1);
        StringBuilder columnBuilder = new StringBuilder();
        if (columnNumber == 0) {
            return "A" + rowPart;
        }
        int currentNumber = columnNumber;
        boolean firstRound = true;
        while (currentNumber > 0) {
            int rest = currentNumber % 26;
            if (firstRound) {
                columnBuilder.insert(0, toLetterColumnDigit(rest));
            } else {
                columnBuilder.insert(0, toLetterColumnDigit(rest - 1));
            }
            currentNumber = (currentNumber - rest) / 26;
            firstRound = false;
        }
        return columnBuilder + rowPart;
    }

    /**
     * @param columnNumber number between
     */
    private static char[] toLetterColumnDigit(int columnNumber) {
        return Character.toChars(65 + columnNumber);
    }
}