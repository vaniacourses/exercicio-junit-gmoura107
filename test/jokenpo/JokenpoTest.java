package jokenpo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import jokenpo.Jokenpo;

public class JokenpoTest {
	private Jokenpo jogo;
	@BeforeEach
	public void inicializa() {
		jogo = new Jokenpo();
	}
	
	
	@DisplayName("Testa todos os resultados possiveis do jokenpo, ate invalido")
    @Test
    public void testJogar() {
        

        // Testa empate
        assertEquals(0, jogo.jogar(1, 1));
        assertEquals(0, jogo.jogar(2, 2));
        assertEquals(0, jogo.jogar(3, 3));

        // Testa vitórias do jogador 1
        assertEquals(1, jogo.jogar(1, 2)); 
        assertEquals(1, jogo.jogar(2, 3)); 
        assertEquals(1, jogo.jogar(3, 1));

        // Testa vitórias do jogador 2
        assertEquals(2, jogo.jogar(2, 1));
        assertEquals(2, jogo.jogar(3, 2));
        assertEquals(2, jogo.jogar(1, 3));

        // Testa opção inválida
        assertEquals(-1, jogo.jogar(0, 1));
        assertEquals(-1, jogo.jogar(1, 4));
    }
}
