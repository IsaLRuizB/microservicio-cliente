package com.app.microservicio.cliente.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.commons.alquiler.models.entity.Cliente;



@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
