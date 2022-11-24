package com.exemplo.api.controller;

import com.exemplo.api.models.Endereco;
import com.exemplo.api.services.EnderecoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/endereco")
public class EnderecoController {

    @Autowired
    EnderecoServices enderecoServices;

    @GetMapping("/")
    public ResponseEntity buscarendereco()
    {
        List<Endereco> listaenderecos = enderecoServices.getEndereco();

        return ResponseEntity.ok(listaenderecos);
    }

    @PostMapping("/")
    public ResponseEntity salvaendereco(@RequestBody Endereco endereco)
    {
        enderecoServices.postEndereco(endereco);

        return ResponseEntity.ok(endereco);
    }

    @DeleteMapping("/")
    public void deletaendereco(@RequestBody Endereco endereco)
    {
        enderecoServices.deleteEndereco(endereco);
    }

    @PutMapping("/")
    public ResponseEntity updateendereco(@RequestBody Endereco endereco)
    {
        enderecoServices.updateEndereco(endereco);

        return ResponseEntity.ok(endereco);
    }
    
}
