
package practica_builder;


import Abstraccion.*;//del paquete abstraccion traemos todo
import Productos .*;//del paquete productos traemos todo
import Concrete_builder.*;//del paquete concrete_builder obtenemos todo
import java.util.Scanner;
public class Practica_builder {//creamos una clase llamada practica builder que sera el main

        private static Scanner reader = new Scanner(System.in);//nos ayudara a recibir todos los datos
        
    public static void main(String[] args) {//realizamos el main
        // TODO code application logic here
        
        int eleccion;//creamos una variable de modo entero
        
        construir_camion obj= new construir_camion();//instanciamos al director
        CamionBuilder obj1= new Camion_uno();//instanciamos la clase concreta y su referencia es la clase abstracta "CamionBuilder"
        CamionBuilder obj2=new Camion_dos();//instanciamos la clase concreta y su referencia es la clase abstracta "CamionBuilder"
   
        
        do{//realizamos un do while
           eleccion = menu();//el entero eleccion sera igual a la funcion menu() que tambien es de tipo entero
           switch(eleccion){//Realizamos un switch case para la condicion
               case 1://si es el caso 1 entonces
                   obj.setcamionBuilder(obj1);//llamamos el metodo setcamionBuilder y le enviamos el objeto camion uno
                   obj.fabrica_camion();//llamamos el metodo que hara todo el cambio de informacion en camion
                   imprimir(obj.getcamion());//llamamos la funcion imprimir y le enviamos como parametro el objeto camion
                   break;//rompemos el switch
               case 2://si es el caso 2 entonces
                   obj.setcamionBuilder(obj2);//llamamos el metodo setcamionBuilder y le enviamos el objeto camion dos
                   obj.fabrica_camion();//llamamos el metodo que hara todo el cambio de informacion en camion
                   imprimir(obj.getcamion());//llamamos la funcion imprimir y le enviamos como parametro el objeto camion
                   break;//rompemos el switch
               case 3://si es el caso 3 entonces
                   System.out.println("Saliendo del programa");//imprimimos texto
                   break;//rompemos el switch
               default:
                   System.out.println("Has escogido un valor no valido");//imprimimos texto
                   break;//rompemos el switch
                   
           }
        }while(eleccion != 3);//mientras la "eleccion" es distinta a tres entonces...
        
    }
    
    
    public static void imprimir(camion nueva){//creamos una variable de tipo "camion" que reciba al valor del getcamion() 
        System.out.println("Se ha elegido el camion de:\n"//imprimimos texto
                + "Carroceria: "+nueva.getCarroceria()//imprimimos la carroceria a traves del get
                + "\nMotor     : "+nueva.getMotor()//imprimimos la motor a traves del get
                + "\nRuedas    : "+nueva.getRuedas());//imprimimos la ruedas a traves del get
        
    }
    
    
    public static int menu(){//realizamos una funcion llamada menu que sera de tipo entero
        System.out.println("Que Camion deseas ver?: \n"//imprimimos texto
                + "1. Camion uno\n"
                + "2. Camion dos\n"
                + "3. Salir \n"
                + "Por favor selecciona uno: ");
       return reader.nextInt();//retornamos un numero seleccionado por el usuario
    }
    
}
