package Trace;

import Calcul.Calcul;

public class MainTrace {
    public static void main(String[] args) {
        Calcul calcul = new Calcul();
        Operation operation = new Operation(calcul);
        operation.savop('s',4,5,4+5);

        Calcul calcul2 = (Calcul)operation.lireOp();
        System.out.println(calcul2.getOp());
    }
}
