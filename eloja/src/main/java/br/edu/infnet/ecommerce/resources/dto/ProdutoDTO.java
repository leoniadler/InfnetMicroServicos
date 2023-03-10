package br.edu.infnet.ecommerce.resources.dto;

public class ProdutoDTO {
	
	private Integer codigo;
	
	private Integer quantidade;
	
	private String nome;
	
	private Double preco;

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "ProdutoDTO [codigo=" + codigo + ", quantidade=" + quantidade + ", nome=" + nome + ", preco=" + preco
				+ "]";
	}

	

	
	
	

}
