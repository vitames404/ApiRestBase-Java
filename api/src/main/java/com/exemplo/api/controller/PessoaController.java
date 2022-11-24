package com.exemplo.api.controller;

import com.exemplo.api.models.Pessoa;
import com.exemplo.api.services.PessoaServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/api/pessoa")
public class PessoaController {

    @Autowired
    PessoaServices pessoaServices;

    @GetMapping("/")
    public ResponseEntity buscarPessoa()
    {
        List<Pessoa> listaPessoas = pessoaServices.getPessoas();

        return ResponseEntity.ok(listaPessoas);
    }

    @PostMapping("/")
    public ResponseEntity salvaPessoa(@RequestBody Pessoa pessoa)
    {
        pessoaServices.postPessoa(pessoa);

        return ResponseEntity.ok(pessoa);
    }

    @DeleteMapping("/")
    public void deletaPessoa(@RequestBody Pessoa pessoa)
    {
        pessoaServices.deletePessoa(pessoa);
    }

    @PutMapping("/")
    public ResponseEntity updatePessoa(@RequestBody Pessoa pessoa)
    {
        pessoaServices.updatePessoa(pessoa);

        return ResponseEntity.ok(pessoa);
    }

}
