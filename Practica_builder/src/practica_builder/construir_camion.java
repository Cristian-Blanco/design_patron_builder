
 package practica_builder;

/**
 *
 * @author jorge malaver
 */
import Concrete_builder.*;//importamos todas las clases del paquete concrete_builder
import Productos.*;//importamos todas las clases del paquete productos
import Abstraccion.*;//importamos todas las clases del paquete abstraccion
public class construir_camion {//creamos una clase llamada construir_camion (sera nuestra clase director) se encarga de gestionar el producto
    
    private CamionBuilder nuevo;//creamos un atributo de tipo CamionBuilder llamado nuevo
    
    public void setcamionBuilder(CamionBuilder op ){//creamos un metodo seter que obtendra una variable de tipo camionBuilder llamada op
                                                       //este seter se podra ver utilizado en el main
        
        nuevo= op; //el valor de nuevo sera igual a de op
    }
    
    
    public camion getcamion(){//se crea un metodo get de tipo camion (su valor sera un objeto)
        return nuevo.getcamion();//retornamos el valor de getcamion() <<getcamion() es creado en camionbuilder y obtiene el objeto camion>>
    }
    
    public void fabrica_camion(){//creamos un metodo de tipo void llamado fabrica_camion
        nuevo.ConstruirCamion();//utilizando el metodo construirCamion() podemos comenzar a instanciar a camion
        nuevo.builmotor();//se remplazan y obtenemos los valores dependiendo de lo que el usuario escogio
        nuevo.builcarroceria();//se remplazan y obtenemos los valores dependiendo de lo que el usuario escogio
        nuevo.builruedas();//se remplazan y obtenemos los valores dependiendo de lo que el usuario escogio
    }
}
