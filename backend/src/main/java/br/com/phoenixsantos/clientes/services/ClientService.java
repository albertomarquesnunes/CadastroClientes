package br.com.phoenixsantos.clientes.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.phoenixsantos.clientes.dto.ClientDTO;
import br.com.phoenixsantos.clientes.entities.Client;
import br.com.phoenixsantos.clientes.repositories.ClientRepository;
import br.com.phoenixsantos.clientes.services.exception.ResourceNotFoundException;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public List<ClientDTO> findAll(){
		List<Client> list = repository.findAll();
		return list.stream().map(x -> new ClientDTO(x)).collect(Collectors.toList());
		
	}

	@Transactional(readOnly = true)
	public ClientDTO findById(Long id) {
		Optional<Client> obj = repository.findById(id);
		Client entity = obj.orElseThrow(()-> new ResourceNotFoundException("Não Encontrado"));
		return new ClientDTO(entity);
	}

}
