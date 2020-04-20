package com.example.demo.servicios;

import com.example.demo.entidades.dimLUGAR;
import com.example.demo.repositorios.RepositoryLugar;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class serviciosLugar {
    @Autowired
    private RepositoryLugar repositorio;

    public List<dimLUGAR> getLugares(){
        return (List<dimLUGAR>) repositorio.findAll();
    }

    public void guardarLugar(dimLUGAR t){
        repositorio.save(t);
    }
}
