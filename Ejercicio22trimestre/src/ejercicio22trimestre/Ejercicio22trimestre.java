/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio22trimestre;

/**
 *
 * @author Usuario DAM 1
 */
public class Ejercicio22trimestre {

  public static void main(String[] args) {

    System.out.print("Por favor, Introduzca un día de la semana (de Lunes a Viernes): ");
    String dia = System.console().readLine();

    int diaNumerico = 0;

    switch(dia) {
      case "Lunes":
        diaNumerico = 0;
        break;
      case "Martes":
        diaNumerico = 1;
        break;
      case "Miércoles":
      case "Miercoles":
        diaNumerico = 2;
        break;
      case "Jueves":
        diaNumerico = 3;
        break;
      case "Viernes":
        diaNumerico = 4;
        break;
      default:
        System.out.print("El día introducido no es correcto.");
    }
    
    System.out.println("A continuación introduzca la hora (hora y minutos)");
    
    System.out.print("Hora: ");
    int horas = Integer.parseInt(System.console().readLine());
    
    System.out.print("Minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    int minutosTotales = (4 * 24 * 60) + (15 * 60);
    int minutosActuales = (diaNumerico * 24 * 60) + (horas * 60) + minutos;
    
    System.out.print("Faltan " + (minutosTotales - minutosActuales) + " minutos para llegar al fin de semana.");
  }
}
   