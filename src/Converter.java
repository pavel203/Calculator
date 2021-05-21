public class Converter { // название класса должно быть емким и общим,
    // а из названия методов можно понять что класс может делать

    public static String convertArabicToRoman(int arabicNumeral) throws NumberFormatException {
        String result = "";
        int number = arabicNumeral;

        if (number <= 0) {
            throw new NumberFormatException();
        }
        if (number == 100) {
            return "C";
        }
        while (number >= 90) {
            result += "XC";
            number -= 90;
        }
        while (number >= 50) {
            result += "L";
            number -= 50;
        }
        while (number >= 40) {
            result += "XL";
            number -= 40;
        }
        while (number >= 10) {
            result += "X";
            number -= 10;
        }
        while (number >= 9) {
            result += "IX";
            number -= 9;
        }
        while (number >= 5) {
            result += "V";
            number -= 5;
        }
        while (number >= 4) {
            result += "IV";
            number -= 4;
        }
        while (number >= 1) {
            result += "I";
            number -= 1;
        }
        return result;
    }
}

