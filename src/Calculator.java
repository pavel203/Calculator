import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator  {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String templateArabic = "([1-9]|10)\\s[+-/*]\\s([1-9]|10)";
        String templateRoman = "(I|II|III|IV|V|VI|VII|VIII|IX|X)\\s[+-/*]\\s(I|II|III|IV|V|VI|VII|VIII|IX|X)";
        String inputLine = "";

        int arabicNumeral;
        String romanNumeral;

        boolean matchesArabic = false;
        boolean matchesRoman = false;

        try {
            inputLine = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Pattern patternArabic = Pattern.compile(templateArabic);
        Matcher matcherArabic = patternArabic.matcher(inputLine);

        if (matchesArabic = matcherArabic.matches()) {
            String[] subStrings = inputLine.split(" ");
            arabicNumeral = ArabicNumerals.calculateArabicNumeral(subStrings);
            System.out.println(arabicNumeral);
        }
        else {
            Pattern patternRoman = Pattern.compile(templateRoman);
            Matcher matcherRoman = patternRoman.matcher(inputLine);
            if (matchesRoman = matcherRoman.matches()){
                String[] subStrings = inputLine.split(" ");
                romanNumeral = RomanNumerals.calculateRomanNumeral(subStrings);
                System.out.println(romanNumeral);
            }
            else {
                throw new IOException();
            }
        }

        reader.close();
    }
}
