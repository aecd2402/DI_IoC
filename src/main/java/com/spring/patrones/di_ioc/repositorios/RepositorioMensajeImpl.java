package com.spring.patrones.di_ioc.repositorios;

import org.springframework.stereotype.Repository;

@Repository
public class RepositorioMensajeImpl implements RepositorioMensaje {
    @Override
    public void guardar(String msg) {
        System.out.println("Guardando en BD: " + msg);
    }
}
