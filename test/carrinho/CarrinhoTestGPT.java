package carrinho;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import produto.Produto;
import produto.ProdutoNaoEncontradoException;

import java.util.ArrayList;

public class CarrinhoTest {

    private Carrinho carrinho;

    // Classe mock simples para Produto
    private static class ProdutoMock extends Produto {
        private double preco;

        public ProdutoMock(double preco) {
            this.preco = preco;
        }

        @Override
        public double getPreco() {
            return preco;
        }
    }

    @BeforeEach
    public void setUp() {
        carrinho = new Carrinho();
    }

    @Test
    @DisplayName("Teste adicionar item e contar quantidade")
    public void testAddItem() {
        Produto p1 = new ProdutoMock(10.0);
        Produto p2 = new ProdutoMock(20.0);

        carrinho.addItem(p1);
        carrinho.addItem(p2);

        assertEquals(2, carrinho.getQtdeItems());
    }

    @Test
    @DisplayName("Teste calcular valor total com múltiplos itens")
    public void testGetValorTotal() {
        Produto p1 = new ProdutoMock(10.0);
        Produto p2 = new ProdutoMock(20.0);
        Produto p3 = new ProdutoMock(30.5);

        carrinho.addItem(p1);
        carrinho.addItem(p2);
        carrinho.addItem(p3);

        assertEquals(60.5, carrinho.getValorTotal(), 0.001);
    }

    @Test
    @DisplayName("Teste remover item existente")
    public void testRemoveItemSucesso() throws ProdutoNaoEncontradoException {
        Produto p1 = new ProdutoMock(15.0);
        carrinho.addItem(p1);

        assertEquals(1, carrinho.getQtdeItems());
        carrinho.removeItem(p1);
        assertEquals(0, carrinho.getQtdeItems());
    }

    @Test
    @DisplayName("Teste remover item não existente lança exceção")
    public void testRemoveItemFalha() {
        Produto p1 = new ProdutoMock(15.0);

        ProdutoNaoEncontradoException exception = assertThrows(ProdutoNaoEncontradoException.class, () -> {
            carrinho.removeItem(p1);
        });

        assertNotNull(exception);
    }

    @Test
    @DisplayName("Teste esvaziar carrinho")
    public void testEsvazia() {
        carrinho.addItem(new ProdutoMock(10.0));
        carrinho.addItem(new ProdutoMock(20.0));
        assertEquals(2, carrinho.getQtdeItems());

        carrinho.esvazia();
        assertEquals(0, carrinho.getQtdeItems());
        assertEquals(0.0, carrinho.getValorTotal(), 0.001);
    }

    @Test
    @DisplayName("Teste valor total do carrinho vazio")
    public void testValorTotalVazio() {
        assertEquals(0.0, carrinho.getValorTotal(), 0.001);
    }
}
