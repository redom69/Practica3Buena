package com.example.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import com.example.demo.servicios.*;


public class RecolectoDatos {

    private serviciosLugar servicioH;
    private serviciosTiempo servicioT;
    private serviciosPaciente servicioP;

    public RecolectoDatos() {
    }

    public void RecolectoHospital(String ruta) throws IOException {
        BufferedReader bufferedLectura = new BufferedReader(new FileReader(ruta));
        String linea = bufferedLectura.readLine();
        while(linea != null){
            String[] campos = linea.split(String.valueOf(";"));

            System.out.println(campos[2]);
            linea = bufferedLectura.readLine();
        }
        if(bufferedLectura != null){
            bufferedLectura.close();
        }
    }
    public void RecolectoPaciente(String ruta) throws IOException {
        BufferedReader bufferedLectura = new BufferedReader(new FileReader(ruta));
        String linea = bufferedLectura.readLine();
        while(linea != null){
            String[] campos = linea.split(String.valueOf(";"));

            System.out.println(campos[2]);
            linea = bufferedLectura.readLine();
        }
        if(bufferedLectura != null){
            bufferedLectura.close();
        }
    }
    public void RecolectoTiempo(String ruta) throws IOException {
        BufferedReader bufferedLectura = new BufferedReader(new FileReader(ruta));
        String linea = bufferedLectura.readLine();
        while(linea != null){
            String[] campos = linea.split(String.valueOf(";"));

            System.out.println(campos[2]);
            linea = bufferedLectura.readLine();
        }
        if(bufferedLectura != null){
            bufferedLectura.close();
        }
    }

    public void inicializarTablas(){

    }
}

