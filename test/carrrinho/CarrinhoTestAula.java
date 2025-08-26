package carrinho;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import produto.Produto;

public class CarrinhoTest {

    @Test
    public void testQuantidadeItens() {
        Carrinho carrinho = new Carrinho();
        Produto produto = new Produto("item1", 1.90);
        
        carrinho.addItem(produto);
        
        assertEquals(1, carrinho.getQtdeItems());
    }
}
