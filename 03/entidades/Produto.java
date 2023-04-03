package entidades;

import java.util.Arrays;

public class Produto {
	    private String nome;
	    private double preco;
	    private int quantidade;
	    private int[] codigos;

	    //Construtor
	    public Produto(String nome, double preco, int quantidade, int[] codigos) {
	        this.nome = nome;
	        this.preco = preco;
	        this.quantidade = quantidade;
	        this.codigos = codigos;
	    }

	    public void adicionarProduto(int quantidade) {
	        this.quantidade = this.quantidade + quantidade;
	    }

	    public void removerProduto(int quantidade) {
	        this.quantidade = this.quantidade - quantidade;
	    }

	    public boolean verificarSeContemCodigo(int codigo) {
	        for (int i = 0; i < codigos.length; i++) {
	            if (codigos[i] == codigo) {
	                return true;
	            }
	        }
	        return false;
	    }

	    //Getters and Setters
	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public double getPreco() {
	        return preco;
	    }

	    public void setPreco(double preco) {
	        this.preco = preco;
	    }

	    public int getQuantidade() {
	        return quantidade;
	    }

	    public void setQuantidade(int quantidade) {
	        this.quantidade = quantidade;
	    }

	    public int[] getCodigos() {
	        return codigos;
	    }

	    public void setCodigos(int[] codigos) {
	        this.codigos = codigos;
	    }
	    
	    //To String
	    public String toString() {
	        return "Nome: " + nome + "\nPreço: " + preco + "\nQuantidade: " + quantidade + "\nCódigos: " + Arrays.toString(codigos);
	    }
}
