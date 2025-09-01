package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    private Calculadora calc;

    @BeforeEach
    public void setUp() {
        calc = new Calculadora();
    }

    @Test
    @DisplayName("Teste soma com valores positivos, negativos e zero")
    public void testSoma() {
        assertEquals(5, calc.soma(2, 3));
        assertEquals(-1, calc.soma(-2, 1));
        assertEquals(0, calc.soma(0, 0));
        assertEquals(-5, calc.soma(-2, -3));
    }

    @Test
    @DisplayName("Teste subtração com valores positivos, negativos e zero")
    public void testSubtracao() {
        assertEquals(-1, calc.subtracao(2, 3));
        assertEquals(-3, calc.subtracao(-2, 1));
        assertEquals(0, calc.subtracao(0, 0));
        assertEquals(1, calc.subtracao(-2, -3));
    }

    @Test
    @DisplayName("Teste multiplicação com valores positivos, negativos e zero")
    public void testMultiplicacao() {
        assertEquals(6, calc.multiplicacao(2, 3));
        assertEquals(-2, calc.multiplicacao(-2, 1));
        assertEquals(0, calc.multiplicacao(0, 10));
        assertEquals(6, calc.multiplicacao(-2, -3));
    }

    @Test
    @DisplayName("Teste divisão com valores positivos e negativos")
    public void testDivisao() {
        assertEquals(2, calc.divisao(6, 3));
        assertEquals(-2, calc.divisao(-6, 3));
        assertEquals(-2, calc.divisao(6, -3));
        assertEquals(2, calc.divisao(-6, -3));
    }

    @Test
    @DisplayName("Teste divisão por zero lança ArithmeticException")
    public void testDivisaoPorZero() {
        assertThrows(ArithmeticException.class, () -> {
            calc.divisao(10, 0);
        });
    }

    @Test
    @DisplayName("Teste somatória de números")
    public void testSomatoria() {
        assertEquals(0, calc.somatoria(0));
        assertEquals(1, calc.somatoria(1));
        assertEquals(10, calc.somatoria(4)); // 4+3+2+1+0 = 10
        assertEquals(55, calc.somatoria(10));
        // Com números negativos, deve retornar 0 (pelo código)
        assertEquals(0, calc.somatoria(-1));
    }

    @Test
    @DisplayName("Teste se número é positivo")
    public void testEhPositivo() {
        assertTrue(calc.ehPositivo(0));
        assertTrue(calc.ehPositivo(10));
        assertFalse(calc.ehPositivo(-1));
        assertFalse(calc.ehPositivo(-100));
    }

    @Test
    @DisplayName("Teste comparação entre números")
    public void testCompara() {
        assertEquals(0, calc.compara(5, 5));
        assertEquals(1, calc.compara(10, 5));
        assertEquals(-1, calc.compara(5, 10));
        assertEquals(0, calc.compara(-1, -1));
        assertEquals(1, calc.compara(0, -1));
        assertEquals(-1, calc.compara(-5, 0));
    }
}
