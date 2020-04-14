package com.example.demo.repositorios;

import com.example.demo.entidades.dimHOSPITAL;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RepositoryHospital extends CrudRepository<dimHOSPITAL, String> {

    List<dimHOSPITAL> findById (String id);
    List<dimHOSPITAL> findByNombre (String nombre);
    List<dimHOSPITAL> findByCpostal (int cpostal);
    List<dimHOSPITAL> findByAutopista (String autopista);
    List<dimHOSPITAL> findByGestor (String gestor);

}
