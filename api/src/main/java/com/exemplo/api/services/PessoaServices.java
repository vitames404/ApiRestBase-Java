package com.exemplo.api.services;

import com.exemplo.api.models.Pessoa;
import com.exemplo.api.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PessoaServices {

    @Autowired
    PessoaRepository pessoaRepository;

    public List<Pessoa> getPessoas()
    {
        List<Pessoa> listaPessoas = pessoaRepository.findAll();

        return listaPessoas;
    }

    public Pessoa postPessoa(Pessoa novaPessoa)
    {
        return pessoaRepository.save(novaPessoa);
    }

    public void deletePessoa(Pessoa antigaPessoa)
    {
        pessoaRepository.delete(antigaPessoa);
    }

    public Pessoa updatePessoa(Pessoa alteraPessoa)
    {
        return pessoaRepository.save(alteraPessoa);
    }


}