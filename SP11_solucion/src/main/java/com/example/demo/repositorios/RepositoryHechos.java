package com.example.demo.repositorios;

import com.example.demo.entidades.tablaHECHOS;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RepositoryHechos extends CrudRepository<tablaHECHOS, Integer> {

    List<tablaHECHOS> findById (int id);
/*    List<tablaHECHOS> findByCliente_id (dimPACIENTE cliente_id);
    List<tablaHECHOS> findByHospital_id (dimHOSPITAL hospital_id);

    List<tablaHECHOS> findByFechaIngreso_id (dimTIEMPO fechaIngreso_id);*/
    List<tablaHECHOS> findByDuracion (int duracion);
    List<tablaHECHOS> findByUci (String uci);
    List<tablaHECHOS> findByFallecido (String Fallecido);
    List<tablaHECHOS> findByTratamiento (String Tratamiento);

}