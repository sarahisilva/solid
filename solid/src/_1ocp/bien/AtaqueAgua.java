/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _1ocp.bien;

/**
 *
 * @author asus
 */
public class AtaqueAgua extends Ataque{

   public double valor=0.70;

    @Override
    public double daño() {
        return this.valor;
    }

    
    
}
