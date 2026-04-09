package br.com.bootcamp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RefeicaoTest {
    @Test
    public void testCriarRefeicaoValida() {
        Refeicao r = new Refeicao("Salada", true);
        assertEquals("Salada", r.getNome());
        assertTrue(r.isSaudavel());
    }

    @Test
    public void testErroNomeVazio() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Refeicao("", true);
        });
    }
}
