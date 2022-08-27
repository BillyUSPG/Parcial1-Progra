/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hopital;

/**
 *
 * @author Billy
 */
public class Nurse extends UserDatos{
    String specialidad;

    public Nurse(String specialidad,int id, String name, String email,String dirrecion, int numero) {
        super(id,name,email,dirrecion,numero);
        this.specialidad = specialidad;
    }

    public String getSpecialidad() {
        return specialidad;
    }

    public void setSpecialidad(String specialidad) {
        this.specialidad = specialidad;
    }
    
}
