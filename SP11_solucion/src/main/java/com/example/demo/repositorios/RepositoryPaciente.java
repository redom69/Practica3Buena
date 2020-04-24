package com.example.demo.repositorios;

import com.example.demo.entidades.dimPACIENTE;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@RepositoryRestResource
public interface RepositoryPaciente extends CrudRepository<dimPACIENTE, Integer> {

    List<dimPACIENTE> findById (int id);
    List<dimPACIENTE> findByEdad (int edad);
    List<dimPACIENTE> findBySexo (boolean sexo);
    List<dimPACIENTE> findByImc (int imc);
    List<dimPACIENTE> findByFormaFisica (int formaFisica);
    List<dimPACIENTE> findByTabaquismo (boolean tabaquismo);
    List<dimPACIENTE> findByAlcoholismo  (boolean alcoholismo);
    List<dimPACIENTE> findByColesterol (boolean colesterol);
    List<dimPACIENTE> findByHipertension (boolean hipertension);
    List<dimPACIENTE> findByCardiopatia (boolean cardiopatia);
    List<dimPACIENTE> findByReuma (boolean reuma);
    List<dimPACIENTE> findByEpoc (boolean epoc);
    List<dimPACIENTE> findByHepatitis (int hepatitis);
    List<dimPACIENTE> findByCancer (boolean cancer);
    
}
