package com.example.demo.repositorios;

import com.example.demo.entidades.dimPACIENTE;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositoryPaciente extends CrudRepository<dimPACIENTE, Integer> {

    List<dimPACIENTE> findById (int id);
    List<dimPACIENTE> findByEdad (int edad);
    List<dimPACIENTE> findBySexo (boolean sexo);
    List<dimPACIENTE> findByIMC (int IMC);
    List<dimPACIENTE> findByFormaFisica (int formaFisica);
    List<dimPACIENTE> findByTabaquismo (boolean tabaquismo);
    List<dimPACIENTE> findByAlcolihismo (boolean alcoholismo);
    List<dimPACIENTE> findByColesterol (boolean colesterol);
    List<dimPACIENTE> findByHipertension (boolean hipertension);
    List<dimPACIENTE> findByCardiopatia (boolean cardiopatia);
    List<dimPACIENTE> findByReuma (boolean reuma);
    List<dimPACIENTE> findByEPOC (boolean EPOC);
    List<dimPACIENTE> findByHepatitis (int hepatitis);
    List<dimPACIENTE> findByCancer (boolean cancer);
    
}
