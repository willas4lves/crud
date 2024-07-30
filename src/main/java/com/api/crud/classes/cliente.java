package com.api.crud.classes;

import java.util.ArrayList;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "clientes")
public class cliente {
    

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column (nullable =  false)
    private String nome;

    @Column(length = 11)
    private String telefone;

    @Column (nullable = false, unique = true)
    private String cpf;

    @OneToOne
    @JoinColumn(name = "endereco_id", referencedColumnName = "id")
    private Endereco endereco;

    @Column(unique = true)
    private String email;

    @Column(name = "data_nascimento")
    private String dataNascimento;



}
