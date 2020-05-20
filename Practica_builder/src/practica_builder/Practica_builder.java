
package practica_builder;


import Abstraccion.*;//del paquete abstraccion traemos todo
import Productos .*;//del paquete productos traemos todo
import Concrete_builder.*;//del paquete concrete_builder obtenemos todo
public class Practica_builder {//creamos una clase llamada practica builder que sera el main

    
    public static void main(String[] args) {//realizamos el main
        // TODO code application logic here
        construir_camion obj= new construir_camion();//instanciamos al director
        CamionBuilder obj1= new Camion_uno();//instanciamos la clase concreta y su referencia es la clase abstracta "CamionBuilder"
        CamionBuilder obj2=new Camion_dos();//instanciamos la clase concreta y su referencia es la clase abstracta "CamionBuilder"
        
        obj.setcamionBuilder(obj1);//llamamos al set de tipo camionbuilder y le damos el valor de obj1 o camion uno
        obj.fabrica_camion();//llamamos el metodo fabrica_camion de la clase construir camion que nos ayudara a establecer los valores
        
        camion nueva=obj.getcamion();//creamos una variable de tipo "camion" que reciba al valor del getcamion()
        nueva.getCarroceria();
        nueva.getMotor();
        nueva.getRuedas();
    
    }
    
    
}
