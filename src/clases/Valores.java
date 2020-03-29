/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import abstracto.Labores;

/**
 *
 * @author Usuario
 */
public class Valores extends Labores{
    private double horasTrabajadas;
    private double valorHora;

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String realizarFuncion() {
        return "Empleado básico";
    }

    @Override
    public String realizarFuncion(String funcion) {
        return funcion;
    }
    
}
