/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;

/**
 *
 * @author jorge malaver
 */
public class camion {//creamos una clase llamada Camion (sera nuestra clase producto)
    
    private String motor="";//creamos un atributo llamado motor de tipo string
    private String carroceria="";//creamos un atributo llamado carroceria de tipo string
    private String ruedas="";//creamos un atributo llamado ruedas de tipo string
    
    public void setmotor(String motor){//creamos un metodo seter para obtener y dar valor al atributo motor
        this.motor=motor;//el atributo motor de la clase sera igual al valor de entrada del metodo
    }
    
    public void setcarroceria(String carroceria){//creamos un metodo seter para obtener y dar valor al atributo carroceria
        this.carroceria=carroceria;//el atributo carroceria de la clase sera igual al valor de entrada del metodo
    }
    
    public void setruedas(String ruedas){//creamos un metodo seter para obtener y dar valor al atributo ruedas
        
        this.ruedas=ruedas;//el atributo ruedas de la clase sera igual al valor de entrada del metodo
    }

    public String getMotor() {
        return motor;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public String getRuedas() {
        return ruedas;
    }
    
}
