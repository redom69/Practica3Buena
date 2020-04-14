package com.example.demo.entidades;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "dimhospital")
public class dimHOSPITAL {

    private Set<tablaHECHOS> hechos;

    @Column
    private String id;
    @Column
    private String nombre;
    @Column
    private int cpostal;
    @Column
    private String autopista;
    @Column
    private String gestor;

    public dimHOSPITAL() {
    }

    public dimHOSPITAL(String id, String nombre, int cpostal, String autopista, String gestor) {
        this.id = id;
        this.nombre = nombre;
        this.cpostal = cpostal;
        this.autopista = autopista;
        this.gestor = gestor;
    }

    @OneToMany(mappedBy = "hospital_id",cascade = CascadeType.ALL)
    public Set<tablaHECHOS> getHechos() {
        return hechos;
    }

    public void setHechos(Set<tablaHECHOS> hechos) {
        this.hechos = hechos;
    }

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCpostal() {
        return cpostal;
    }

    public void setCpostal(int cpostal) {
        this.cpostal = cpostal;
    }

    public String getAutopista() {
        return autopista;
    }

    public void setAutopista(String autopista) {
        this.autopista = autopista;
    }

    public String getGestor() {
        return gestor;
    }

    public void setGestor(String gestor) {
        this.gestor = gestor;
    }

    @Override
    public String toString() {
        return "dimHOSPITAL{" +
                "hechos=" + hechos +
                ", id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cpostal=" + cpostal +
                ", autopista='" + autopista + '\'' +
                ", gestor='" + gestor + '\'' +
                '}';
    }
}
