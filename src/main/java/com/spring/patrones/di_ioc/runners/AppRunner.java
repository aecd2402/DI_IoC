package com.spring.patrones.di_ioc.runners;


import com.spring.patrones.di_ioc.servicios.ServicioMensaje;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {

    private final ServicioMensaje servicio;

    public AppRunner(ServicioMensaje servicio) {
        this.servicio = servicio;
    }

    @Override
    public void run(String... args) {
        servicio.enviarMensaje("Hola con Spring Boot + DI");
    }
}