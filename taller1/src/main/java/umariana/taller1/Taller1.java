/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package umariana.taller1;

import java.util.ArrayList;
import java.util.Scanner;
import mundo.Tarea;
import java.util.Collections;

/**
 *
 * @author David Esteban Ortiz
 */
public class Taller1 {

    public static void main(String[] args) {
        //Scanner permite la entrada de datos primitivos
        Scanner lector = new Scanner(System.in);
        ArrayList<Tarea>misTareas=new ArrayList<>();

       boolean activo=true;
       do{
           //Menu de opciones para añadir una nuevas tareas, verlas, y cerrar el programa
           System.out.println("==== Menu de opciones ====");
           System.out.println("1.Agregar tarea");
           System.out.println("2. Mostrar tareas");
           System.out.println("3. Mostrar tareas por prioridad");
           System.out.println("4. Terminar programa");
           System.out.println("seleccione una opción");
           System.out.println("=========================");
           
          int opcion = lector.nextInt();
          
          switch(opcion){
                   case 1:
                       //Ingreso de los datos para añadir una nueva tarea
                       //Entrada de id
                       System.out.println("Ingrese el id de la tarea");
                       int id= lector.nextInt();lector.nextLine();
                       //entrada de la descripción
                       System.out.println("Ingrese la descripcion de la tarea");
                       String descripcion=lector.nextLine();
                       //entrada de la prioridad
                       System.out.println("Ingrese la prioridad de 1-5");
                       int prioridad=lector.nextInt();
                       //Creacion del objeto y llenar la información
                       Tarea nuevaTarea=new Tarea(id,descripcion,prioridad);
                       //ALMACENAR EL OBJETO EN LA CONTENEDORA
                       misTareas.add(nuevaTarea);
                       System.out.println("Tarea agregada satisfactoriamente");
                   break;
                   case 2:
                       
                       System.out.println("====TAREAS REGISTRADAS====");
                       //isEmpty()se usa para determinar si se inicializan variables individuales, verifica que si no hay tareas para mostrar muestra el sout de no hay tareas registradas
                       if (misTareas.isEmpty()) {
                              System.out.println("No hay tareas registradas.");
                       } else {
                       for(Tarea t:misTareas){
                           System.out.println("id: "+t.getIdTarea());
                           System.out.println("descripción: "+t.getDescripcion());
                           System.out.println("prioridad: "+t.getPrioridad());
                           System.out.println("==================");
                       }
                       }
                   break;
                   
                   case 3:
                    // Ordenar tareas por prioridad con el metodo Collectios.sort que nos permite ordenar la lista de manera descendente
                      Collections.sort(misTareas, (tarea1, tarea2) -> tarea2.getPrioridad() - tarea1.getPrioridad());
                    // mostrar las tareas ordenadas por prioridad de forma descendente
                     System.out.println("TAREAS ORDENADAS POR PRIORIDAD DE FORMA DESCENDENTE:");
                     //isEmpty()se usa para determinar si se inicializan variables individuales, verifica que si no hay tareas para mostrar muestra el sout de no hay tareas registradas
                     if (misTareas.isEmpty()) {
                              System.out.println("No hay tareas registradas.");
                     } else {
                     
                     for (Tarea p : misTareas) {
                           System.out.println("prioridad: "+p.getPrioridad());
                           System.out.println("id: "+p.getIdTarea());
                           System.out.println("descripción: "+p.getDescripcion());
                           System.out.println("==================");
                     }
                     }

                       
                     
             break;
                   
                   case 4:
                       //Culminacion del programa
                       activo = false; System.out.println("PROGRAMA TERMINADO");
                   break;
                   
                   default: 
                       //Error por si la opción que se selecciono no es valida 
                       System.out.println("Opción no valida");
                   
       }
           
       }while (activo);
    }
}
