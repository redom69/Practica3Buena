package com.example.demo.servicios;

import com.example.demo.entidades.dimHOSPITAL;
import com.example.demo.repositorios.RepositoryHospital;
import com.example.demo.repositorios.RepositoryPaciente;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class serviciosHospotal {
    @Autowired
    private RepositoryHospital repositorio;

    public List<dimHOSPITAL> getPacientes(){
        return (List<dimHOSPITAL>) repositorio.findAll();
    }

    public void guardarPaciente(dimHOSPITAL  t){
        repositorio.save(t);
    }
}
