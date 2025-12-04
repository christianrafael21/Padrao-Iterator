package padroescomportamentais.iterator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class EstatisticaTest {

    @Test
    void deveContarJogadoresAtivosTime() {
        Time time = new Time(
                new Jogador("LeBron James", true),
                new Jogador("Stephen Curry", true),
                new Jogador("Kevin Durant", false),
                new Jogador("Giannis Antetokounmpo", true)
        );
        assertEquals(3, Estatistica.contarJogadoresAtivosTime(time));
    }

    @Test
    void deveContarTotalJogadoresTime() {
        Time time = new Time(
                new Jogador("LeBron James", true),
                new Jogador("Stephen Curry", true),
                new Jogador("Kevin Durant", false),
                new Jogador("Giannis Antetokounmpo", true)
        );
        assertEquals(4, Estatistica.contarTotalJogadoresTime(time));
    }

}
