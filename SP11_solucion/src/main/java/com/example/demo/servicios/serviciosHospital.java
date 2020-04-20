package com.example.demo.servicios;

import com.example.demo.entidades.dimTIEMPO;
import com.example.demo.entidades.tablaHECHOS;
import com.example.demo.repositorios.RepositoryHechos;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class serviciosHospital {

    @Autowired
    private RepositoryHechos repositorio;

    public List<tablaHECHOS> getHospitales(){
        return (List<tablaHECHOS>) repositorio.findAll();
    }

    public void guardarHospital(tablaHECHOS  t){
        repositorio.save(t);
    }
}
