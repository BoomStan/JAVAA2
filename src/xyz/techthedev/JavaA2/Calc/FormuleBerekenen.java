package xyz.techthedev.JavaA2.Calc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class FormuleBerekenen {
    static Integer bereken(String formule) {
        System.out.println(formule);
        //Variabelen zoals patterns and matchers
        final Pattern pattern = Pattern.compile("(\\d+)([\\*\\+-])(\\d+)");
        final Matcher matcher = pattern.matcher(formule);
//        final Pattern pattern2 = Pattern.compile("(\\d+)([\\*\\+-])(\\d+)[\\*\\+-](\\d+)");
//        final Matcher matcher2 = pattern2.matcher(formule);

        //checked voor keer, plus en min
        if (matcher.matches()) {
            switch (matcher.group(2)) {
                case "*":
                    return Integer.parseInt(matcher.group(1)) * Integer.parseInt(matcher.group(3));
                case "+":
                    return Integer.parseInt(matcher.group(1)) + Integer.parseInt(matcher.group(3));
                case "-":
                    return Integer.parseInt(matcher.group(1)) - Integer.parseInt(matcher.group(3));
            }
            System.out.println(matcher.group(2));
            return 1;

            //berekend eerst wat er in de haakjes zit en maakt een subresult aan die het haakje vervangt
        } else if (formule.matches(".*\\(.+\\).*")) {
            final int begin = formule.lastIndexOf('(');
            final int end = formule.indexOf(')', begin);
            int subresult = bereken(formule.substring(begin + 1, end));
            String newformule = formule.substring(0, begin) + subresult + formule.substring(end + 1);
            System.out.printf(newformule);
            return bereken(newformule);

            //berekenen van meerdere getallen voor de plus

            //als er iets niet klopt returnt de formule 0

        }
        return 0;
    }
}