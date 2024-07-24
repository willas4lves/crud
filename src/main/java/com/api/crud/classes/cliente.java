package com.api.crud.classes;

import java.util.ArrayList;
import java.util.UUID;

import lombok.Data;

@Data
public class cliente {
    public static ArrayList<cliente> clientes = new ArrayList<cliente>();

    private UUID id = UUID.randomUUID();
    private String nome;
    private String cpf;
    private Endereco endereco;
    private String telefone;
    private String email;
    private String dataNascimento;



}
