package com.exemplo.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemplo.api.models.Filmes;

public interface FilmesRepository extends JpaRepository<Filmes, Long>{

    Filmes findById(long id);

}
