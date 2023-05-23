import java.util.ArrayList;
import java.util.List;

public class ProdutoTeste {
    public static void main(String[] args) {
        List<Produto> carrinho = new ArrayList<>();

        carrinho.add(new Livro("Carlos Drummond de Andrade - Alguma Poesia"));
        carrinho.add(new Mouse("Mouse Optico, 30000dpi"));
        carrinho.add(new Mouse("Mouse Gamer, RGB, 16000dpi"));
        carrinho.add(new Livro("Stephen King - Carrie"));
        carrinho.add(new Mouse("Mouse Escritorio"));
        carrinho.add(new Livro("Gabrielle-Suzanne Barbot - A Bela e A Fera"));
        carrinho.add(new Livro("George RR Martin - A Guerra dos Tronos"));
        carrinho.add(new Livro("Machado de Assis - Dom Casmurro"));
        carrinho.add(new Mouse("Mouse Optico, Ergonomico, 10000dpi"));
        carrinho.add(new Mouse("Mouse Wireless"));

        for(Produto p : carrinho) System.out.println(p.getDescricao());
    }
}
