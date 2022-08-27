/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hopital;

public class Paciente extends UserDatos {
    String cumple;
    double peso;
    double altura;
    String sangre;

    public Paciente(String cumple, double peso, double altura, String sangre, int id, String name, String email,String dirrecion, int numero) {
        super(id,name,email,dirrecion,numero);
        this.cumple = cumple;
        this.peso = peso;
        this.altura = altura;
        this.sangre = sangre;
        
    }

    public String getCumple() {
        return cumple;
    }

    public void setCumple(String cumple) {
        this.cumple = cumple;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getSangre() {
        return sangre;
    }

    public void setSangre(String sangre) {
        this.sangre = sangre;
    }
    
}
