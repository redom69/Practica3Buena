package com.example.demo.entidades;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "dimpaciente")
public class dimPACIENTE {

    private Set<tablaHECHOS> hechos;

    @Column
    private int id;
    @Column
    private int edad;
    @Column
    private boolean sexo;
    @Column
    private int IMC;
    @Column
    private int formaFisica;
    @Column
    private boolean tabaquismo;
    @Column
    private boolean alcoholismo;
    @Column
    private boolean colesterol;
    @Column
    private boolean hipertension;
    @Column
    private boolean cardiopatia;
    @Column
    private boolean reuma;
    @Column
    private boolean EPOC;
    @Column
    private int hepatitis;
    @Column
    private boolean cancer;

    public dimPACIENTE() {
    }

    public dimPACIENTE(int id, int edad, boolean sexo, int IMC, int formaFisica, boolean tabaquismo, boolean alcoholismo, boolean colesterol, boolean hipertension, boolean cardiopatia, boolean reuma, boolean EPOC, int hepatitis, boolean cancer) {
        this.id = id;
        this.edad = edad;
        this.sexo = sexo;
        this.IMC = IMC;
        this.formaFisica = formaFisica;
        this.tabaquismo = tabaquismo;
        this.alcoholismo = alcoholismo;
        this.colesterol = colesterol;
        this.hipertension = hipertension;
        this.cardiopatia = cardiopatia;
        this.reuma = reuma;
        this.EPOC = EPOC;
        this.hepatitis = hepatitis;
        this.cancer = cancer;
    }

    public int getIMC() {
        return IMC;
    }

    public void setIMC(int IMC) {
        this.IMC = IMC;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public int getFormaFisica() {
        return formaFisica;
    }

    public void setFormaFisica(int formaFisica) {
        this.formaFisica = formaFisica;
    }

    public boolean isTabaquismo() {
        return tabaquismo;
    }

    public void setTabaquismo(boolean tabaquismo) {
        this.tabaquismo = tabaquismo;
    }

    public boolean isAlcoholismo() {
        return alcoholismo;
    }

    public void setAlcoholismo(boolean alcoholismo) {
        this.alcoholismo = alcoholismo;
    }

    public boolean isColesterol() {
        return colesterol;
    }

    public void setColesterol(boolean colesterol) {
        this.colesterol = colesterol;
    }

    public boolean isHipertension() {
        return hipertension;
    }

    public void setHipertension(boolean hipertension) {
        this.hipertension = hipertension;
    }

    public boolean isCardiopatia() {
        return cardiopatia;
    }

    public void setCardiopatia(boolean cardiopatia) {
        this.cardiopatia = cardiopatia;
    }

    public boolean isReuma() {
        return reuma;
    }

    public void setReuma(boolean reuma) {
        this.reuma = reuma;
    }

    public boolean isEPOC() {
        return EPOC;
    }

    public void setEPOC(boolean EPOC) {
        this.EPOC = EPOC;
    }

    public int getHepatitis() {
        return hepatitis;
    }

    public void setHepatitis(int hepatitis) {
        this.hepatitis = hepatitis;
    }

    public boolean isCancer() {
        return cancer;
    }

    public void setCancer(boolean cancer) {
        this.cancer = cancer;
    }

    @OneToMany(mappedBy = "cliente_id", cascade = CascadeType.ALL)
    public Set<tablaHECHOS> getHechos() {
        return hechos;
    }

    public void setHechos(Set<tablaHECHOS> hechos) {
        this.hechos = hechos;
    }

    @Override
    public String toString() {
        return "dimPACIENTE{" +
                "hechos=" + hechos +
                ", id=" + id +
                ", edad=" + edad +
                ", sexo=" + sexo +
                ", IMC=" + IMC +
                ", formaFisica=" + formaFisica +
                ", tabaquismo=" + tabaquismo +
                ", alcoholismo=" + alcoholismo +
                ", colesterol=" + colesterol +
                ", hipertension=" + hipertension +
                ", cardiopatia=" + cardiopatia +
                ", reuma=" + reuma +
                ", EPOC=" + EPOC +
                ", hepatitis=" + hepatitis +
                ", cancer=" + cancer +
                '}';
    }
}
