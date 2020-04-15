package com.example.demo.servicios;

import com.example.demo.entidades.dimPACIENTE;
import com.example.demo.repositorios.RepositoryPaciente;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class serviciosPaciente {

    @Autowired
    private RepositoryPaciente repositorio;

    public List<dimPACIENTE> getPacientes(){
        return (List<dimPACIENTE >) repositorio.findAll();
    }

    public void guardarPaciente(dimPACIENTE  t){
        repositorio.save(t);
    }
}
