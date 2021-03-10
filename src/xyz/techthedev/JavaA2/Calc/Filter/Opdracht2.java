package xyz.techthedev.JavaA2.Calc.Filter;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Opdracht2 {
    static String tekst =
            "Dit is een tekst met \" en ** en ?? "+
                    "en allerlei andere niet wenselijke tekens zoals ® etc. ";
    char[] weg = {'"', '?'};
    public static void main(String[] args) {

        Map<String, String> wordsToReplace = new HashMap<String, String>();
        //filter voor alle tekens
        wordsToReplace.put("\"", "");
        wordsToReplace.put("*", "");
        wordsToReplace.put("?", "");
        wordsToReplace.put("`", "");
        wordsToReplace.put("~", "");
        wordsToReplace.put("!", "");
        wordsToReplace.put("@", "");
        wordsToReplace.put("#", "");
        wordsToReplace.put("$", "");
        wordsToReplace.put("%", "");
        wordsToReplace.put("^", "");
        wordsToReplace.put("&", "");
        wordsToReplace.put("(", "");
        wordsToReplace.put("+", "");
        wordsToReplace.put(")", "");
        wordsToReplace.put("-", "");
        wordsToReplace.put("_", "");
        wordsToReplace.put("=", "");
        wordsToReplace.put("{", "");
        wordsToReplace.put("}", "");
        wordsToReplace.put("[", "");
        wordsToReplace.put("]", "");
        wordsToReplace.put("|", "");
        wordsToReplace.put(":", "");
        wordsToReplace.put("/", "");
        wordsToReplace.put(";", "");
        wordsToReplace.put("'", "");
        wordsToReplace.put("<", "");
        wordsToReplace.put(">", "");
        wordsToReplace.put(",", "");
        wordsToReplace.put(".", "");
        wordsToReplace.put("®", "");

        Set<String> keys = wordsToReplace.keySet();

        for(String key: keys){
            tekst = tekst.replace(key, wordsToReplace.get(key));
        }

        System.out.println(tekst);
    }

}