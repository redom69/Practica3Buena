package com.example.demo.repositorios;

import com.example.demo.entidades.dimLUGAR;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RepositoryLugar extends CrudRepository<dimLUGAR, String> {

    List<dimLUGAR> findById (String id);
    List<dimLUGAR> findByNombre (String nombre);
    List<dimLUGAR> findByCpostal (int cpostal);
    List<dimLUGAR> findByAutopista (String autopista);
    List<dimLUGAR> findByGestor (String gestor);

}
