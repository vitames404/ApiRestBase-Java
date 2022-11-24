package com.exemplo.api.services;

import com.exemplo.api.models.Endereco;
import com.exemplo.api.models.Pessoa;
import com.exemplo.api.repository.EnderecoRepository;
import com.exemplo.api.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoServices {

    @Autowired
    EnderecoRepository enderecoRepository;

    public List<Endereco> getEndereco()
    {
        List<Endereco> listaEnderecos = enderecoRepository.findAll();

        return listaEnderecos;
    }

    public Endereco postEndereco(Endereco novoEndereco)
    {
        return enderecoRepository.save(novoEndereco);
    }

    public void deleteEndereco(Endereco antigoEndereco)
    {
        enderecoRepository.delete(antigoEndereco);
    }

    public Endereco updateEndereco(Endereco alteraEndereco)
    {
        return enderecoRepository.save(alteraEndereco);
    }

}
