
package practica_1;

import java.util.Scanner;

public class Practica_1 {

    public static void main(String[] args) {
        Scanner tusita = new Scanner(System.in);
        Scanner reales = new Scanner(System.in);
        
        int num ;
        String name;
        
        // Texto para menú del juego         
        System.out.println("║BIENVENIDO AL JUEGO PACMAN║");
        System.out.println("⇉⇉⇉⇉《IPC1 - 2022》⇇⇇⇇⇇");
        System.out.println("≛≛≛≛≛≛≛≛≛≛≛≛≛≛≛≛≛≛≛≛≛≛");
        System.out.println("1.            INICIAR JUEGO");
        System.out.println("2.      TABLA DE POSICIONES");
        System.out.println("3.                    SALIR");
        System.out.println("≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡");
        System.out.println("Ingesa una opción:");  
        num = reales.nextInt();
        if(num == 1) { 
            //En este if se hara el menu del juego como el juego en si
            System.out.println("MENÚ DE JUEGO");
            System.out.println("≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡");
            System.out.println("¿Estás listo para vencer el juego?");
            System.out.println("Ingrese su Nombre:");
            name = tusita.nextLine();
        }
        if(num == 2){
            //En este iff mostare la tabla de posiciones
            System.out.println("JUGADORES:") ;
        }
        if (num == 3){
            // Este iff es para salir a la pantalla inicial
            System.out.println("¡Gracias por jugar!");
        }      
    }
    
}
