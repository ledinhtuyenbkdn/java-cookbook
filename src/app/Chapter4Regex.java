package app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Chapter4Regex {
    public static void main(String[] args) {
        Chapter4Regex chapter4Regex = new Chapter4Regex();
        chapter4Regex.testForPattern();
        chapter4Regex.findMatchingText();
    }

    private void testForPattern() {
        String inputString = "I am a Regex";
        String stringRegexPattern = ".*Regex$";
        // use String class
        if (inputString.matches(stringRegexPattern)) {
            System.out.println("Matched");
        }

        // use Pattern and Matcher class
        Pattern pattern = Pattern.compile(stringRegexPattern);
        Matcher matcher = pattern.matcher(inputString);
        if (matcher.lookingAt()) {
            System.out.println("Matched");
        }

        Pattern pattern1 = Pattern.compile(stringRegexPattern);
        Matcher matcher1 = pattern1.matcher(inputString);
        if (matcher1.matches()) {
            System.out.println("Matched");
        }

        Pattern pattern2 = Pattern.compile(stringRegexPattern);
        Matcher matcher2 = pattern2.matcher(inputString);
        if (matcher2.find()) {
            System.out.println("Matched");
        }
    }

    private void findMatchingText() {
        String inputString = "I love you 3000 4000";
        String stringRegexPattern = "\\d+";

        Pattern pattern = Pattern.compile(stringRegexPattern);
        Matcher matcher = pattern.matcher(inputString);

        if (matcher.find()) {
            System.out.println("Matched: " + matcher.group());
        }

        if (matcher.find()) {
            System.out.println("Matched: " + inputString.substring(matcher.start(), matcher.end()));
        }

        String name = "Tuyen, Le";
        String stringRegexPattern1 = "(\\w+), (\\w+)";
        Pattern pattern1 = Pattern.compile(stringRegexPattern1);
        Matcher matcher1 = pattern1.matcher(name);

        if (matcher1.find()) {
            System.out.println(matcher1.group(2) + " " + matcher1.group(1));
        }
    }
}
