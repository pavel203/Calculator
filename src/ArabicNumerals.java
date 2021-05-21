public class ArabicNumerals {

    public static int calculateArabicNumeral(String[] subStrings) {
        int firstNumber = Integer.parseInt(subStrings[0]);
        int secondNumber = Integer.parseInt(subStrings[2]);
        int result = switch (subStrings[1]) {
            case ("+") -> firstNumber + secondNumber;
            case ("-") -> firstNumber - secondNumber;
            case ("*") -> firstNumber * secondNumber;
            case ("/") -> firstNumber / secondNumber;
            default -> 0;
        };

        return result;
    }

}
