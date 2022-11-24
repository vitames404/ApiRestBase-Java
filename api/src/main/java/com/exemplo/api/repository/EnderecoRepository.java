package com.exemplo.api.repository;

import com.exemplo.api.models.Endereco;
import com.exemplo.api.models.Pessoa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, Long> {
    public List<Endereco> findAll();
}
