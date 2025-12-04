package padroescomportamentais.iterator;

import java.util.Iterator;

public class Estatistica {

    public static Integer contarJogadoresAtivosTime(Time time) {
        int quantidade = 0;
        for (Jogador jogador : time) {
            if (jogador.isAtivo()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalJogadoresTime(Time time) {
        int quantidade = 0;
        for (Iterator j = time.iterator(); j.hasNext(); ) {
            quantidade++;
            j.next();
        }
        return quantidade;
    }

}
