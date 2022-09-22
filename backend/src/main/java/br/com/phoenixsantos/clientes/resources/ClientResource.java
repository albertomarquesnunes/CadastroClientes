package br.com.phoenixsantos.clientes.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.phoenixsantos.clientes.entities.Client;

@RestController
@RequestMapping(value ="/clients")
public class ClientResource {

	
	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L,"Ana","56656656445",12.00,Instant.parse("2022-02-15T18:35:24.00Z"),1));
		list.add(new Client(2L,"Alberto","4545545455",12.00,Instant.parse("2022-02-15T18:35:24.00Z"),1));
		list.add(new Client(3L,"Amelia","1098090999",12.00,Instant.parse("2022-02-15T18:35:24.00Z"),1));
		list.add(new Client(4L,"Neyde","109735583711",12.00,Instant.parse("2022-02-15T18:35:24.00Z"),1));
		
		return  ResponseEntity.ok().body(list);
	}

	
}
