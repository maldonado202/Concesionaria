/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.automovil.persistencia;

import com.mycompany.automovil.logica.Automovil;
import java.util.List;

/**
 *
 * @author danim
 */
public class ControladoraPersistencia {
    //creo una instancia de JpaController para que mande los datos a la BD
    AutomovilJpaController autoJpa = new AutomovilJpaController();//necesita del driver de mysql en dependencies

    public void agregarAutomovil(Automovil auto) {
        autoJpa.create(auto);
    }

    public List<Automovil> traerAutos() {
        return autoJpa.findAutomovilEntities();//trae todos los registros que hay en la DB de autos y
                                        // los devuelve al tipo de estructura que nosotros necesitemos
    }

    public void borrarAuto(int idAuto) {
        try {
            autoJpa.destroy(idAuto);
        } catch (Exception ex) {
            System.getLogger(ControladoraPersistencia.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

    public Automovil traerAutos(int idAuto) {
        return autoJpa.findAutomovil(idAuto);
    }

    public void modificarAuto(Automovil auto) {
        try {
            autoJpa.edit(auto);
        } catch (Exception ex) {
            System.getLogger(ControladoraPersistencia.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

    
    
}
