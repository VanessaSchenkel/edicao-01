package br.com.cwi.reset.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.cwi.reset.domain.Musica;

@Repository
public class MusicaRepositorio {

    private static final List<Musica> musicas = new ArrayList<>();

}
