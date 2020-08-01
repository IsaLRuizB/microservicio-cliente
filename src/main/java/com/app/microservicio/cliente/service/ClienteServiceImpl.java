package com.app.microservicio.cliente.service;

import org.springframework.stereotype.Service;

import com.app.commons.alquiler.models.entity.Cliente;
import com.app.microservicio.cliente.models.repository.ClienteRepository;
import com.common.microservicios.service.CommonsServiceImpl;



@Service
public class ClienteServiceImpl extends CommonsServiceImpl<Cliente, ClienteRepository> implements ClienteService {

	

	
}
