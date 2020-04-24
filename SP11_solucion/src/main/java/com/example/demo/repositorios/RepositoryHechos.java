package com.example.demo.repositorios;

import com.example.demo.entidades.tablaHECHOS;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface RepositoryHechos extends CrudRepository<tablaHECHOS, Integer> {

    List<tablaHECHOS> findById (int id);
    List<tablaHECHOS> findByDuracion (int duracion);
    List<tablaHECHOS> findByUci (String uci);
    List<tablaHECHOS> findByFallecido (String Fallecido);
    List<tablaHECHOS> findByTratamiento (String Tratamiento);

}