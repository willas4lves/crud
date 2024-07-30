package com.api.crud.repository;

import com.api.crud.classes.cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<cliente, Long> {

}
