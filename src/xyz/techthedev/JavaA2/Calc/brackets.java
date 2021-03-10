package xyz.techthedev.JavaA2.Calc;

    class brackets {
        static Integer brackets(String formule) {
            //regex voor haakjes, begin en eind van het haakje
            if (formule.matches(".*\\(.+\\).*")) {
                final int begin = formule.lastIndexOf('(');
                final int end = formule.indexOf(')', begin);
                return brackets(formule.substring(begin + 1, end));
            }
            return 0;
        }
    }

