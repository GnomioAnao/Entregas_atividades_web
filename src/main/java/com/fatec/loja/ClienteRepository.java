package com.fatec.loja;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository 
extends JpaRepository<ClienteModel, Integer>{


}

