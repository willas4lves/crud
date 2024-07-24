package com.api.crud.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.crud.classes.cliente;
import java.util.UUID;

@RestController
@RequestMapping("clientes")
public class ClienteController {

    @GetMapping
    public String getall(){
        if (cliente.clientes.isEmpty()) {
            return "clintes não registrados";
        }else {
            String resposta = cliente.clientes.toString();
            return resposta;
        }
    }
    @PostMapping
    public String create(@RequestBody cliente cliente) {
        cliente.clientes.add(cliente);
        return "Cliente cadastrado com sucesso!";
    }
    @GetMapping("/{id}")
    public String getById(@PathVariable UUID id) {
        for (cliente cliente : cliente.clientes) {
            if (cliente.getId().equals(id)) {
                return cliente.toString();
            }
        }
        return "Cliente não encontrado.";
    }

}
