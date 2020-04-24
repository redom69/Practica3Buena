package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.IOException;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

@Configuration
@ComponentScan
@EnableJpaRepositories
@Import(RepositoryRestMvcConfiguration.class)
@EnableAutoConfiguration

@SpringBootApplication
public class App{

    public static void main(String[] args) throws IOException {
        SpringApplication.run(App.class, args);
        RecolectoDatos r = new RecolectoDatos();
        r.inicializarTablas();

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
