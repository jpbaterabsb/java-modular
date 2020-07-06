package digital.innovation.one.operacao.internal;

import digital.innovation.one.Operacao;

public class SubHelper implements Operacao {
    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}
