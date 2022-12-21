package br.edu.infnet.ecommerce.resources;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.google.common.net.MediaType;

import br.edu.infnet.ecommerce.clients.ProdutoClient;
import br.edu.infnet.ecommerce.resources.dto.ClienteDTO;
import br.edu.infnet.ecommerce.resources.dto.CompraDTO;
import br.edu.infnet.ecommerce.resources.dto.CompraResponseDTO;
import br.edu.infnet.ecommerce.resources.dto.ProdutoCatalogoDTO;
import br.edu.infnet.ecommerce.resources.dto.ProdutoDTO;

@RestController
@RequestMapping("/compras")
public class CompraResource {
	
	private static Logger log = LoggerFactory.getLogger(CompraResource.class);
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@Value("${cliente.endpoint.url}")
	private String clienteApiUrl;
	
	@Autowired
	private ProdutoClient produtoClient;
	
	@PostMapping
	public CompraResponseDTO efetuaCompra(@RequestBody CompraDTO compraDTO) {
		
		log.info("Solicitaçao para pedido com a informaçao: {}", compraDTO);
		
		
		if(log.isDebugEnabled()) {
			log.debug("Debug ligado");
		}
		
		ClienteDTO clienteDTO =  restTemplate.getForObject(clienteApiUrl + 
				compraDTO.getClienteId(), ClienteDTO.class);
		
		System.out.println(clienteDTO);
		System.out.println(compraDTO);
		
		log.info("Chamada a api de cleintes realizada: {}", clienteDTO);

		
//		List<ProdutoDTO> produtos = produtoClient.getProdutos();
		ResponseEntity<List<ProdutoCatalogoDTO>> produtos = produtoClient.getProdutos();
//		System.out.println("foi" + produtos.getBody());
		
		
		return new CompraResponseDTO(clienteDTO, produtos.getBody());
		
		}
	
}
