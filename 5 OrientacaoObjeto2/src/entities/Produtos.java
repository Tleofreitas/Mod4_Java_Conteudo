package entities;

public class Produtos {
	
	public String nome;
	public double preco;
	public int quantidade;
	
	public double valorTotalEmEstoque() {
		return preco * quantidade;
	}
	
	public void adicionarProdutos(int quantidade) {
		this.quantidade += quantidade; // this.quantidade = acessar parametro da classe
	}
	
	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	// Conversão de objeto para String
	public String toString() {
		return nome
		+ ", $ "
		+ String.format("%.2f", preco)
		+ ", "
		+ quantidade
		+ " units, Total: $ "
		+ String.format("%.2f", valorTotalEmEstoque());
		}
}
