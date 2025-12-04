package com.spring.patrones.di_ioc.servicios;

import com.spring.patrones.di_ioc.repositorios.RepositorioMensaje;
import org.springframework.stereotype.Service;

@Service
public class ServicioMensajeImpl implements ServicioMensaje {

    private final RepositorioMensaje repo;

    public ServicioMensajeImpl(RepositorioMensaje repo) {   // inyección por constructor
        this.repo = repo;
    }

    @Override
    public void enviarMensaje(String msg) {
        repo.guardar(msg);
        System.out.println("Mensaje enviado: " + msg);
    }
}
