package xyz.techthedev.JavaA2.Calc;
public class Main {

    static FormuleBerekenen fBerkenen = new FormuleBerekenen();
    static Getalherken gHerken = new Getalherken();
    static brackets bracket = new brackets();

    public static void main(String[] args) {
        /*Report berekent de formule uit en zet het resultaat netjes op het scherm neer*/
        String[] formules = {"4*3","(4*10)+15","4-4-2","4+2*3-1","4+2*3"};

        for(int i = 0; i< formules.length; i++){
            report(formules[i]);
        }


    }

    private static void report(String formule) {
        int resultaat = fBerkenen.bereken(formule);
        System.out.println(formule + " = " + resultaat);
    }

}
