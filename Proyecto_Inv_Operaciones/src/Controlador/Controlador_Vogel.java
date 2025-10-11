/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.modelo_vogel;
import vista.MetodoAproVogel;

/**
 *
 * @author yamil
 */
public class Controlador_Vogel {
    
     private MetodoAproVogel  vista;
     private modelo_vogel modelo;

    public Controlador_Vogel (MetodoAproVogel vista, modelo_vogel modelo) {
        this.vista = vista;
        this.modelo = modelo;
        initController();
    }
     private void initController (){
      
     }
    
}
