package Calcul;

import Trace.Operation;

public class MainCalcul {
    public static void main(String[] args) {
        Calcul calcul = new Calcul();
        Operation c = new Operation(calcul);
        calcul.setTrace(c);
        System.out.println(calcul.somme(4,5));
        System.out.println(calcul.prod(4,5));
        System.out.println(c.lireOp().getOp());
    }
}
