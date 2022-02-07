
package practica_1;

import java.util.Random;
import java.util.Scanner;


public class Practica_1 {

    public static void main(String[] args) {
        
        //variables para el juego
        int num ;
        String name; 
        String grande ;
        int food;
        int par;
        int trap;
        
        // Texto para menú del juego
        do {
        Scanner tusita = new Scanner(System.in);
        System.out.println("║BIENVENIDO AL JUEGO PACMAN║");
        System.out.println("⇉⇉⇉⇉《IPC1 - 2022》⇇⇇⇇⇇");
        System.out.println("≛≛≛≛≛≛≛≛≛≛≛≛≛≛≛≛≛≛≛≛≛≛");
        System.out.println("1.            INICIAR JUEGO");
        System.out.println("2.      TABLA DE POSICIONES");
        System.out.println("3.                    SALIR");
        System.out.println("≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡");
        System.out.print("Ingesa una opción:");  
        num = tusita.nextInt();
        if(num == 1) { 
            //En este if se hara el menu del juego como el juego en si
            System.out.println("MENÚ DE JUEGO");
            System.out.println("≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡");
            System.out.println("¿Estás listo para vencer el juego?");
            System.out.print("Ingrese su Nombre:");
            name = tusita.next(); 
            System.out.println("Ingrese del tamaño del tablero [m,n]");
            grande = tusita.next(); //Creando el ingreso de datos con arreglo y split  
            String[] matriz = grande.split(",");
            int row = Integer.parseInt(matriz[0]);
            int column = Integer.parseInt(matriz[1]);
            System.out.println("Ingresa Cantidad de comida [0-28]");
            food = tusita.nextInt() ;
            System.out.println("Ingrese cantidad de paredes [0-13]");
            par = tusita.nextInt() ;
            System.out.println("Ingrese cantidad de Trampas [0-10]");
            trap = tusita.nextInt() ;
            //Los datos de abajo son todos los que el usuario ingreso en la pantalla
            System.out.println("ღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღ");
            System.out.println("Ingrese su Nombre:"+name);
            System.out.println("Ingrese del tamaño del tablero [mxn]:"+row+","+column); 
            System.out.println("Ingresa Cantidad de comida [0-28]:"+food);
            System.out.println("Ingrese cantidad de paredes [0-13]:"+par);
            System.out.println("Ingrese cantidad de Trampas [0-10]:"+trap);
            System.out.println("ღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღ");
            
        }

        if(num == 2){
            //En este iff mostare la tabla de posiciones
            System.out.println("JUGADORES:") ;
            
            
        }
        if (num == 3){
            // Este iff es para salir a la pantalla inicial
            System.out.println("¡Gracias por jugar!");
        } 
    }while (num <= 3);System.out.println("Ingrese Opción Correcta");
        
    }    
}
