package br.edu.infnet.ecommerce.resources.dto;

import java.util.List;

public class CompraResponseDTO {

	
	private ClienteDTO cliente;
	
	private List<ProdutoCatalogoDTO> listaProdCatalogo;

	public CompraResponseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CompraResponseDTO(ClienteDTO cliente, List<ProdutoCatalogoDTO> listaProdCatalogo) {
		super();
		this.cliente = cliente;
		this.listaProdCatalogo = listaProdCatalogo;
	}

	public ClienteDTO getCliente() {
		return cliente;
	}

	public List<ProdutoCatalogoDTO> getListaProdCatalogo() {
		return listaProdCatalogo;
	}

	
	
	
	
}
