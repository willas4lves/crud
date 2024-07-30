package com.api.crud.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.api.crud.classes.cliente;
import com.api.crud.repository.ClienteRepository;

import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<cliente> getAll() {
        return clienteRepository.findAll();
    }

}
