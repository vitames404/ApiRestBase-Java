package com.exemplo.api.resources;

import com.exemplo.api.models.Filmes;
import com.exemplo.api.repository.FilmesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping(value="/api")
public class FilmesResource {

    @Autowired
    FilmesRepository filmesRepository;

    @GetMapping("/filmes")
    public List<Filmes> listaFilmes()
    {
        return filmesRepository.findAll();
    }

    @GetMapping("/filmes/{id}")
    public Filmes listaFilmesUnico(@PathVariable(value="id") long id){
        return filmesRepository.findById(id);
    }

    @PostMapping("/filmes")
    public Filmes salvaFilmes(@RequestBody Filmes filme)
    {
        return filmesRepository.save(filme);
    }

    @DeleteMapping("/filmes")
    public void deletaFilmes(@RequestBody Filmes filmes)
    {
        filmesRepository.delete(filmes);
    }

    @PutMapping("/filmes")
    public Filmes alteraFilmes(@RequestBody Filmes filmes)
    {
        return filmesRepository.save(filmes);
    }



}
