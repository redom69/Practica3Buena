package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.transaction.Transactional;
import java.io.IOException;
import java.util.List;

@SpringBootApplication
public class App{

    public static void main(String[] args) throws IOException {
        SpringApplication.run(App.class, args);
        RecolectoDatos r = new RecolectoDatos();
        r.RecolectoHospital("C:\\Users\\d.hernandezp.2016\\IdeaProjects\\Practica3Buena\\SP11_solucion\\src\\main\\resources\\csv\\H2.csv");

    }

 /*   *//* Redefinición de método para ejecutar acciones sobre la BD. *//*
    @Override
    @Transactional
    public void run(String... strings) throws Exception {

        int anio = 2016;

        //clienteCantidad
        System.out.println("\nCliente y cantidad:");
        List<ResultadoDTO> clienteCantidad = repositoryCliente.clienteCantidad(anio);
        for (ResultadoDTO res : clienteCantidad) {
            System.out.println(res);
        }

        // Drill
        System.out.println("\nDrill:");
        List<ResultadoDTO> drill = repositoryCliente.drill(anio);
        for (ResultadoDTO res : drill) {
            System.out.println(res);
        }

        // SliceDice
        System.out.println("\nSlice Dice:");
        List<ResultadoDTO> sliceDice = repositoryCliente.sliceDice(anio);
        for (ResultadoDTO res : sliceDice) {
            System.out.println(res);
        }

        //pivot
        System.out.println("\nPivot:");
        List<ResultadoDTO> pivot = repositoryLibro.pivot(anio);
        for (ResultadoDTO res : pivot) {
            System.out.println(res);
        }

    }*/
  }
