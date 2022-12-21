package br.edu.infnet.ecommerce.resources.dto;

import java.util.List;

public class CompraDTO {
	
	private Integer compraId;
	
	private Integer clienteId;
	
	private List<ProdutoDTO> produtos;

	public Integer getCompraId() {
		return compraId;
	}

	public void setCompraId(Integer compraId) {
		this.compraId = compraId;
	}

	public Integer getClienteId() {
		return clienteId;
	}

	public void setClienteId(Integer clienteId) {
		this.clienteId = clienteId;
	}

	public List<ProdutoDTO> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<ProdutoDTO> produtos) {
		this.produtos = produtos;
	}

	@Override
	public String toString() {
		return "CompraDTO [clienteId=" + clienteId + ", produtos=" + produtos + "]";
	}
	
	
	
	
}
