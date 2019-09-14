//cerner_2^5_2019
import java.util.*;
import java.util.stream.*;
/***
 * This class completes the /r/dailyProgrammer challenge #380 [Easy]
 * https://www.reddit.com/r/dailyprogrammer/comments/cmd1hb/20190805_challenge_380_easy_smooshed_morse_code_1/
 */
public class Smoosher {
    private static Map<String, String> morseMap = Stream.of(new String[][] {
        {"a",".-"},{"b","-..."},{"c","-.-."},{"d","-.."},{"e","."},
        {"f","..-."},{"g","--."},{"h","...."},{"i",".."},{"j",".---"},
        {"k","-.-"},{"l",".-.."},{"m","--"},{"n","-."},{"o","---"},
        {"p",".--."},{"q","--.-"},{"r",".-."},{"s","..."},{"t","-"},{" "," "},
        {"u","..-"},{"v","...-"},{"w",".--"},{"x","-..-"},{"y","-.--"},{"z","--.."}
    }).collect(Collectors.toMap(morsePair -> morsePair[0], morsePair -> morsePair[1]));

    public static String Smorse(String word) {
        String lowerWord = word.toLowerCase();
        StringBuilder morseBuilder = new StringBuilder();
        for (char c : lowerWord.toCharArray())
            morseBuilder.append(morseMap.get(String.valueOf(c)));
        return morseBuilder.toString();
    }
}
