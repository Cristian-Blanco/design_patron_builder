
package Abstraccion;

import Productos.*; //importamos del paquete productos toda sus clases
public abstract class CamionBuilder {//creamos una clase abstracta de CamionBuilder (es nuestro abstract builder) 
    
    protected camion Camion;//creamos un atributo de tipo producto camion (recibira un objeto)
    
    public camion getcamion(){//realizamos un get que tendra como valor el producto camion
        return Camion;//retornamos el producto al objeto
    }
    
    public void ConstruirCamion(){//creamos un metodo ConstruirCamion de tipo void
        Camion =new camion();//instanciamos la clase camion y la guardamos en el atributo camion
    }
    
    public abstract void builmotor();//creamos un metodo abstracto de tipo void (los que le daran valor son los concrete builder)
    public abstract void builcarroceria();//creamos un metodo abstracto de tipo void(los que le daran valor son los concrete builder)
    public abstract void builruedas();//creamos un metodo abstracto de tipo void(los que le daran valor son los concrete builder)
    /*
    se sobreescribiran los metodos en las dos clases de concrete_builder y se mostraran gracias al metodo creado en la clase construir camion
    (fabrica camion)
    */
}
