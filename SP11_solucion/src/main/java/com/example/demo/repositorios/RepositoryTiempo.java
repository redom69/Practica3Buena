package com.example.demo.repositorios;

import com.example.demo.entidades.dimTIEMPO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.Date;
import java.util.List;


@Repository
public interface RepositoryTiempo extends CrudRepository<dimTIEMPO, Integer> {

    List<dimTIEMPO> findById (int id);
    List<dimTIEMPO> findByFecha (Date fecha);
    List<dimTIEMPO> findByDia (int dia);
    List<dimTIEMPO> findByMes (int mes);
    List<dimTIEMPO> findByAnio (int anio);
    List<dimTIEMPO> findByCuatrim (int cuatrim);
    List<dimTIEMPO> findByDiasemana(String diasemana);
    List<dimTIEMPO> findByEsfinde (boolean esfinde);

}
