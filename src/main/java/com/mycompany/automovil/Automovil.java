/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.automovil;

import com.mycompany.automovil.igu.Principal;

/**
 *
 * @author danim
 */
public class Automovil {

    public static void main(String[] args) {
        //creo un objeto de tipo Principal ya que la pantalla que quiero que aparesca se llama asi
        Principal princ = new Principal();//al objeto princ que es de tipo Principal asignale un nuevo
                                          // jfram Principal
        princ.setVisible(true);//hago visible la pantalla
        princ.setLocationRelativeTo(null);//que no tome nada como referencia
    
    }
}
