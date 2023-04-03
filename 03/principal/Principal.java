package principal;


import entidades.Produto;


public class Principal {
	 public static void main(String[] args) {
	        int[] codigos = { 1, 2, 3 };
	        Produto produto = new Produto("Camiseta", 29.99, 10, codigos);

	        System.out.println(produto);

	        System.out.println("Verificando código 2: " + produto.verificarSeContemCodigo(2));

	        produto.adicionarProduto(5);
	        System.out.println("Nova quantidade: " + produto.getQuantidade());

	        produto.removerProduto(3);
	        System.out.println("Nova quantidade: " + produto.getQuantidade());

	        int[] novosCodigos = { 1, 3, 5 };
	        produto.setCodigos(novosCodigos);
	        System.out.println(produto);
	    }
	
}
