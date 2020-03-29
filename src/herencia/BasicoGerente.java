/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import clases.Valores;
import interfaces.ISalario;

/**
 *
 * @author Usuario
 */
public class BasicoGerente extends Valores implements ISalario{

    @Override
    public double calcular() {
        return(this.getHorasTrabajadas() * this.getValorHora() + 2000000);
    }
    @Override
    public String realizarFuncion(String funcion){
    return "Se encarga de " +funcion;
    }
}
