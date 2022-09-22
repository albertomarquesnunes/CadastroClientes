package br.com.phoenixsantos.clientes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.phoenixsantos.clientes.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long>{

}
