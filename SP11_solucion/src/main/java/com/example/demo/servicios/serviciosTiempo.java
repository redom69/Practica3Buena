package com.example.demo.servicios;

import com.example.demo.repositorios.RepositoryTiempo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entidades.dimTIEMPO;
import java.util.List;



@Service
public class serviciosTiempo {

    @Autowired
    private RepositoryTiempo repositorio;

    public List<dimTIEMPO> getTiempos(){
        return (List<dimTIEMPO>) repositorio.findAll();
    }

    public void guardarTiempos(dimTIEMPO  t){
        repositorio.save(t);
    }

}
