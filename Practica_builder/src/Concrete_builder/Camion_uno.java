/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concrete_builder;

/**
 *
 * @author jorge malaver
 */
import Abstraccion.*;//traemos todo del paquete abstraccion
import Productos .*;//traemos todo del paquete productos
public class Camion_uno extends CamionBuilder{//creamos una clase llamada "camion_dos" y hereda la clase abstracta camion builder (sera nuestro concrete builder)
    
   @Override//nos ayuda a sobreescribir
   public void builmotor(){//sobreescribimos el metodo buildmotor
       Camion.setmotor("Motor cummis");//el atributo camion al ser una instanciacion de la clase "Camion" podemos llamar el metodo set 
                                       //y establecer valor al atributo String motor en la clase "camion"
   }
   
   @Override//nos ayuda a sobreescribir
   public void builcarroceria(){//sobreescribimos el metodo buildcarroceria 
    
       Camion.setcarroceria("De lujo");//el atributo camion al ser una instanciacion de la clase "Camion" <<esta instanciacion se realizo en la
                                        // clase Camionbuilder >> podemos llamar a su metodo setcarroceria y establecer valor al atributo string
                                        // carroceria en la clase "Camion"
   }
   
   @Override//nos ayuda a sobreescribir
   public void builruedas(){//sobreescribimos el metodo builruedas()
       
       Camion.setruedas("Gan tamaño");//el atributo camion al ser una instanciacion de la clase "Camion" <<esta instanciacion se realizo en la
                                        // clase Camionbuilder >> podemos llamar a su metodo setruedas y establecer valor al atributo string
                                        // ruedas en la clase "Camion"
   }
}
