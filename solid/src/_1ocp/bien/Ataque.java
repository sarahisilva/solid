/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _1ocp.bien;


/**
 *
 * @author Palacios
 */
public abstract class Ataque {
    //ATAQUE_AGUA, ATAQUE_FUEGO , ATAQUE_AIRE , ATAQUE_PLANTA
    public double valor;

    abstract public double daño();
}
