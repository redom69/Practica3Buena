package com.example.demo.repositorios;

import com.example.demo.entidades.dimLUGAR;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import java.util.List;

@RepositoryRestResource
public interface RepositoryLugar extends CrudRepository<dimLUGAR, String> {

    List<dimLUGAR> findById (String id);
    List<dimLUGAR> findByNombre (String nombre);
    List<dimLUGAR> findByCpostal (int cpostal);
    List<dimLUGAR> findByAutopista (String autopista);
    List<dimLUGAR> findByGestor (String gestor);

}
