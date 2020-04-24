package com.example.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.example.demo.entidades.dimLUGAR;
import com.example.demo.entidades.dimPACIENTE;
import com.example.demo.entidades.dimTIEMPO;
import com.example.demo.entidades.tablaHECHOS;
import com.example.demo.servicios.*;


public class RecolectoDatos {

    private serviciosLugar servicioL;
    private serviciosHospital servicioH;
    private serviciosTiempo servicioT;
    private serviciosPaciente servicioP;

    public RecolectoDatos() {
    }

    public void RecolectoHospital(String ruta1, String ruta2, String ruta3, String ruta4) throws IOException {
        BufferedReader bufferedLectura1 = new BufferedReader(new FileReader(ruta1));
        BufferedReader bufferedLectura2 = new BufferedReader(new FileReader(ruta2));
        String linea1 = bufferedLectura1.readLine();
        String linea2 = bufferedLectura2.readLine();
        linea1 = bufferedLectura1.readLine();
        linea2 = bufferedLectura2.readLine();
        tablaHECHOS hospital = new tablaHECHOS();
        dimPACIENTE paciente = new dimPACIENTE();
        dimTIEMPO tiempo = new dimTIEMPO();
        dimLUGAR lugar = new dimLUGAR();
        int contador = 1;
        while((linea1 != null)&&(linea2 != null)){
            String[] campos = linea1.split(String.valueOf(";"));

            hospital.setId(Integer.parseInt(campos[0]));
            hospital.setDuracion(Integer.parseInt(campos[3]));
            hospital.setuci(campos[4]);
            hospital.setFallecido(campos[5]);
            hospital.setTratamiento(Integer.parseInt(campos[6]));

            String[] campos2 = linea2.split(String.valueOf(";"));

            paciente.setId(Integer.parseInt(campos2[0]));
            paciente.setEdad(Integer.parseInt(campos2[1]));
            paciente.setSexo(Boolean.parseBoolean(campos2[2]));
            paciente.setimc(Integer.parseInt(campos2[3]));
            paciente.setFormaFisica(Integer.parseInt(campos2[4]));
            paciente.setTabaquismo(Boolean.parseBoolean(campos2[5]));
            paciente.setAlcoholismo(Boolean.parseBoolean(campos2[6]));
            paciente.setColesterol(Boolean.parseBoolean(campos2[7]));
            paciente.setHipertension(Boolean.parseBoolean(campos2[8]));
            paciente.setCardiopatia(Boolean.parseBoolean(campos2[9]));
            paciente.setReuma(Boolean.parseBoolean(campos2[10]));
            paciente.setepoc(Boolean.parseBoolean(campos2[11]));
            paciente.setHepatitis(Integer.parseInt(campos2[12]));
            paciente.setCancer(Boolean.parseBoolean(campos2[13]));
            hospital.setCliente_id(paciente);

            tiempo = RecolectoTiempo(ruta3, campos[2]);
            hospital.setFechaIngreso_id(tiempo);
            System.out.println(tiempo.toString());

            lugar = RecolectoLugar(ruta4, contador);
            hospital.setHospital_id(lugar);
            contador++;

            linea1 = bufferedLectura1.readLine();
            linea2 = bufferedLectura2.readLine();
        }
        if(bufferedLectura1 != null){
            bufferedLectura1.close();
        }
        if(bufferedLectura2 != null){
            bufferedLectura2.close();
        }
        servicioL.guardarLugar(lugar);
        servicioP.guardarPaciente(paciente);
        servicioT.guardarTiempos(tiempo);
        servicioH.guardarHospital(hospital);

    }

    public void RecolectoPaciente(String ruta) throws IOException {
        BufferedReader bufferedLectura = new BufferedReader(new FileReader(ruta));
        String linea = bufferedLectura.readLine();
        dimPACIENTE paciente = new dimPACIENTE();
        while(linea != null){
            String[] campos = linea.split(String.valueOf(";"));
            paciente.setId(Integer.parseInt(campos[0]));
            paciente.setEdad(Integer.parseInt(campos[1]));
            paciente.setSexo(Boolean.parseBoolean(campos[2]));
            paciente.setimc(Integer.parseInt(campos[3]));
            paciente.setFormaFisica(Integer.parseInt(campos[4]));
            paciente.setTabaquismo(Boolean.parseBoolean(campos[5]));
            paciente.setAlcoholismo(Boolean.parseBoolean(campos[6]));
            paciente.setColesterol(Boolean.parseBoolean(campos[7]));
            paciente.setHipertension(Boolean.parseBoolean(campos[8]));
            paciente.setCardiopatia(Boolean.parseBoolean(campos[9]));
            paciente.setReuma(Boolean.parseBoolean(campos[10]));
            paciente.setepoc(Boolean.parseBoolean(campos[11]));
            paciente.setHepatitis(Integer.parseInt(campos[12]));
            paciente.setCancer(Boolean.parseBoolean(campos[13]));
            linea = bufferedLectura.readLine();
            servicioP.guardarPaciente(paciente);
        }
        if(bufferedLectura != null){
            bufferedLectura.close();
        }
    }

    public dimTIEMPO RecolectoTiempo(String ruta, String date) throws IOException {
        BufferedReader bufferedLectura = new BufferedReader(new FileReader(ruta));
        String linea = bufferedLectura.readLine();
        linea = bufferedLectura.readLine();
        dimTIEMPO tiempo = new dimTIEMPO();
        while(linea != null){
            String[] campos = linea.split(String.valueOf(";"));
            if (date.equals(campos[1])) {
                String[] fechas = campos[1].split(String.valueOf("/"));
                Date fecha = new Date((Integer.parseInt(fechas[2])-1900),Integer.parseInt(fechas[1]),Integer.parseInt(fechas[0]));
                tiempo.setId(Integer.parseInt(campos[0]));
                tiempo.setFecha(fecha);
                tiempo.setDia(Integer.parseInt(campos[2]));
                tiempo.setMes(Integer.parseInt(campos[3]));
                tiempo.setAnio(Integer.parseInt(campos[4]));
                tiempo.setCuatrim(Integer.parseInt(campos[5]));
                tiempo.setDiasemana(campos[6]);
                tiempo.setEsfinde(Boolean.parseBoolean(campos[7]));

                return tiempo;
            }
            linea = bufferedLectura.readLine();
        }
        if(bufferedLectura != null){
            bufferedLectura.close();
        }
        return tiempo;
    }

    public dimLUGAR RecolectoLugar(String ruta, int contador) throws IOException {
        BufferedReader bufferedLectura = new BufferedReader(new FileReader(ruta));
        String linea = bufferedLectura.readLine();
        linea = bufferedLectura.readLine();
        dimLUGAR lugar = new dimLUGAR();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        int contador2 = 1;
        while(linea != null) {
            if (contador == contador2) {
                String[] campos = linea.split(String.valueOf(";"));
                lugar.setId(campos[0]);
                lugar.setNombre(campos[1]);
                lugar.setCpostal(Integer.parseInt(campos[2]));
                lugar.setAutopista(campos[3]);
                lugar.setGestor(campos[4]);
                linea = bufferedLectura.readLine();
                return lugar;
            }
            contador2++;
        }
        if(bufferedLectura != null){
            bufferedLectura.close();
        }
        return lugar;
    }

    public void inicializarTablas() throws IOException {
        String ruta1 = "C:\\Users\\d.hernandezp.2016\\IdeaProjects\\Practica3Buena\\SP11_solucion\\src\\main\\resources\\csv\\H1.csv";
        String ruta2 = "C:\\Users\\d.hernandezp.2016\\IdeaProjects\\Practica3Buena\\SP11_solucion\\src\\main\\resources\\csv\\P1.csv";
        String ruta3 = "C:\\Users\\d.hernandezp.2016\\IdeaProjects\\Practica3Buena\\SP11_solucion\\src\\main\\resources\\csv\\dimTIEMPO.csv";
        String ruta4 = "C:\\Users\\d.hernandezp.2016\\IdeaProjects\\Practica3Buena\\SP11_solucion\\src\\main\\resources\\csv\\dimLUGAR.csv";
        RecolectoHospital(ruta1, ruta2, ruta3, ruta4);
    }
}

