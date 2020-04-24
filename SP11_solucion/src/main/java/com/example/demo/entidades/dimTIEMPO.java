package com.example.demo.entidades;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "dimtiempo")
public class dimTIEMPO {
    private Set<tablaHECHOS> hechos;

    @Column
    private int id;
    @Column
    private Date fecha;
    @Column
    private int dia;
    @Column
    private int mes;
    @Column
    private int anio;
    @Column
    private int cuatrim;
    @Column
    private String diasemana;
    @Column
    private boolean esfinde;

    public dimTIEMPO() {
    }

    public dimTIEMPO(int id, Date fecha, int dia, int mes, int anio, int cuatrim, String diasemana, boolean esfinde) {
        this.id = id;
        this.fecha = fecha;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.cuatrim = cuatrim;
        this.diasemana = diasemana;
        this.esfinde = esfinde;
    }

    @OneToMany(mappedBy = "fechaIngreso_id",cascade = CascadeType.ALL)
    public Set<tablaHECHOS> getHechos() {
        return hechos;
    }

    public void setHechos(Set<tablaHECHOS> hechos) {
        this.hechos = hechos;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getCuatrim() {
        return cuatrim;
    }

    public void setCuatrim(int cuatrim) {
        this.cuatrim = cuatrim;
    }

    public String getDiasemana() {
        return diasemana;
    }

    public void setDiasemana(String diasemana) {
        this.diasemana = diasemana;
    }

    public boolean isEsfinde() {
        return esfinde;
    }

    public void setEsfinde(boolean esfinde) {
        this.esfinde = esfinde;
    }

    @Override
    public String toString() {
        return "dimTIEMPO{" +
                "hechos=" + hechos +
                ", id=" + id +
                ", fecha=" + fecha +
                ", dia=" + dia +
                ", mes=" + mes +
                ", anio=" + anio +
                ", cuatrim=" + cuatrim +
                ", diasemana='" + diasemana + '\'' +
                ", esfinde=" + esfinde +
                '}';
    }
}
