package digital.innovation.one;

import digital.innovation.one.operacao.Calculadora;

public class Main {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.sum(1,2));
    }
}
