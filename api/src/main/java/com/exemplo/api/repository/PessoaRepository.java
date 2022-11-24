package com.exemplo.api.repository;

import com.exemplo.api.models.Pessoa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PessoaRepository extends CrudRepository<Pessoa, Long> {
    public List<Pessoa> findAll();
}
