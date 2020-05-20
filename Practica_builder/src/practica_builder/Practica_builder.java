
package practica_builder;


import Abstraccion.*;//del paquete abstraccion traemos todo
import Productos .*;//del paquete productos traemos todo
import Concrete_builder.*;//del paquete concrete_builder obtenemos todo
import java.util.Scanner;
public class Practica_builder {//creamos una clase llamada practica builder que sera el main

        private static Scanner reader = new Scanner(System.in);//nos ayudara a recibir todos los datos
        
    public static void main(String[] args) {//realizamos el main
        // TODO code application logic here
        
        int eleccion;
        
        construir_camion obj= new construir_camion();//instanciamos al director
        CamionBuilder obj1= new Camion_uno();//instanciamos la clase concreta y su referencia es la clase abstracta "CamionBuilder"
        CamionBuilder obj2=new Camion_dos();//instanciamos la clase concreta y su referencia es la clase abstracta "CamionBuilder"
   
        
        do{
           eleccion = menu();
           switch(eleccion){
               case 1:
                   obj.setcamionBuilder(obj1);
                   obj.fabrica_camion();
                   imprimir(obj.getcamion());
                   break;
               case 2:
                   obj.setcamionBuilder(obj2);
                   obj.fabrica_camion();
                   imprimir(obj.getcamion());
                   break;
               case 3:
                   System.out.println("Saliendo del programa");
                   break;
               default:
                   System.out.println("Has escogido un valor no valido");
                   break;
                   
           }
        }while(eleccion != 3);      
        
    }
    
    
    public static void imprimir(camion nueva){//creamos una variable de tipo "camion" que reciba al valor del getcamion() 
        System.out.println("Se ha elegido el camion de:\n"
                + "Carroceria: "+nueva.getCarroceria()
                + "\nMotor     : "+nueva.getMotor()
                + "\nRuedas    : "+nueva.getRuedas());
        
    }
    
    
    public static int menu(){
        System.out.println("Que Camion deseas ver?: \n"
                + "1. Camion uno\n"
                + "2. Camion dos\n"
                + "3. Salir \n"
                + "Por favor selecciona uno: ");
       return reader.nextInt();
    }
    
}
