package com.example.demo.entidades;

import javax.persistence.*;

@Entity
@Table(name ="tablahechos")
public class tablaHECHOS {

    @Column
    private int id;
    @Column
    private dimPACIENTE cliente_id;
    @Column
    private dimHOSPITAL hospital_id;
    @Column
    private dimTIEMPO fechaIngreso_id;
    @Column
    private int Duracion;
    @Column
    private String uci;
    @Column
    private String Fallecido;
    @Column
    private int Tratamiento;

    public tablaHECHOS() {
    }

    public tablaHECHOS(int id, dimPACIENTE cliente_id, dimHOSPITAL hospital_id, dimTIEMPO fechaIngreso_id, int Duracion, String uci, String Fallecido, int Tratamiento) {
        this.id = id;
        this.cliente_id = cliente_id;
        this.hospital_id = hospital_id;
        this.fechaIngreso_id = fechaIngreso_id;
        this.Duracion = Duracion;
        this.uci = uci;
        this.Fallecido = Fallecido;
        this.Tratamiento = Tratamiento;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    public dimPACIENTE getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(dimPACIENTE cliente_id) {
        this.cliente_id = cliente_id;
    }

    @ManyToOne
    @JoinColumn(name = "hospital_id")
    public dimHOSPITAL getHospital_id() {
        return hospital_id;
    }

    public void setHospital_id(dimHOSPITAL hospital_id) {
        this.hospital_id = hospital_id;
    }

    @ManyToOne
    @JoinColumn(name = "fechaIngreso_id")
    public dimTIEMPO getFechaIngreso_id() {
        return fechaIngreso_id;
    }

    public void setFechaIngreso_id(dimTIEMPO fechaIngreso_id) {
        this.fechaIngreso_id = fechaIngreso_id;
    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int Duracion) {
        this.Duracion = Duracion;
    }

    public String getuci() {
        return uci;
    }

    public void setuci(String uci) {
        this.uci = uci;
    }

    public String getFallecido() {
        return Fallecido;
    }

    public void setFallecido(String Fallecido) {
        this.Fallecido = Fallecido;
    }

    public int getTratamiento() {
        return Tratamiento;
    }

    public void setTratamiento(int Tratamiento) {
        this.Tratamiento = Tratamiento;
    }

    @Override
    public String toString() {
        return "tablaHECHOS{" +
                "id=" + id +
                ", cliente_id=" + cliente_id +
                ", hospital_id=" + hospital_id +
                ", fechaIngreso_id=" + fechaIngreso_id +
                ", Duracion=" + Duracion +
                ", uci='" + uci + '\'' +
                ", Fallecido='" + Fallecido + '\'' +
                ", Tratamiento=" + Tratamiento +
                '}';
    }
}
