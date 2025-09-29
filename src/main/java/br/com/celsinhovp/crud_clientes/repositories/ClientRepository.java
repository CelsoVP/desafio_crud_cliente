package br.com.celsinhovp.crud_clientes.repositories;

import br.com.celsinhovp.crud_clientes.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long > {

}
