import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {
    private static String[] keys = new String[] {"I","II","III","IV","V","VI","VII","VIII","IX","X", "XL", "L", "XC", "C"};
    private static Integer[] values = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 40, 50, 90, 100};

    public static HashMap<String, Integer> getRomanMap(String[] keys, Integer[] values) {
        HashMap<String, Integer> result = new HashMap<>();
        for (int i = 0; i < keys.length; i++) {
            result.put(keys[i], values[i]);
        }
        return result;
    }

    public static String calculateRomanNumeral(String[] subStrings) throws NumberFormatException {
        HashMap<String, Integer> myMap = getRomanMap(keys, values);

        for (int i = 0; i < subStrings.length; i+=2) {
            for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
                String key = entry.getKey();
                Integer value = entry.getValue();
                if (key.equals(subStrings[i])){
                    subStrings[i] = value.toString();
                }
            }
        }

        int arabicNumeral = ArabicNumerals.calculateArabicNumeral(subStrings);
        String romanNumeral = ArabicToRomanConverter.convertArabicToRoman(arabicNumeral);

        return romanNumeral;
    }
}
