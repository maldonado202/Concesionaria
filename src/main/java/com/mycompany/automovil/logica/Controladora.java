/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.automovil.logica;

import com.mycompany.automovil.persistencia.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author danim
 */
public class Controladora {
    //la logica recibe los datos de la igu y crea el objeto
    //auto creado en la logica, ahora debe ir a la controladora de la persistencia
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void agregarAutomovil(String modelo, String marca, String motor, String color, String patente, int cantPuertas) {
        Automovil auto = new Automovil();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuertas(cantPuertas);
        
        
        controlPersis.agregarAutomovil(auto);
    }

    public List<Automovil> traerAutos() {
        //llamo a la persistencia, ella ejecuta el metodo traerAutos y 
        //lo retorna a quien haya llamado a este metodo que es consultaAutomovil y 
        //consultaAutoovil carga los autos en la igu
        return controlPersis.traerAutos();
    }

    public void borrarAuto(int idAuto) {
       controlPersis.borrarAuto(idAuto);
    }

    public Automovil traerAutos(int idAuto) {
         return controlPersis.traerAutos(idAuto);
    }

    public void modificarAuto(Automovil auto, String modelo, String marca, String motor, String color, String patente, int cantPuertas) {
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuertas(cantPuertas);
        //le pido a la persistencia que modifique
        controlPersis.modificarAuto(auto);
    }
    
}
