package com.app.microservicio.cliente.controller;

import org.springframework.web.bind.annotation.RestController;

import com.app.commons.alquiler.models.entity.Cliente;
import com.app.microservicio.cliente.service.ClienteService;
import com.common.microservicios.controller.CommonController;


@RestController
public class ClienteController extends CommonController<Cliente, ClienteService>{

}
