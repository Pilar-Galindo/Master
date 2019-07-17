/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author GUILLEN
 */

 public class estudiante {
 
        public static void main(String[] args) {
 
          
          String nombre_estudiante;
          String rut_estudiante;
          String colegio_estudiante;
          int edad_estudiante;
          int numero_matricula_estudiante;
 
          
 
         
          nombre_estudiante = "Proyecto en grupo ";
          rut_estudiante = "1-9";
          colegio_estudiante = " UTH ";
          edad_estudiante = 18;
          numero_matricula_estudiante = 123456;
 
        
          estudiante alumno1 = new estudiante(colegio_estudiante, numero_matricula_estudiante, nombre_estudiante, rut_estudiante, edad_estudiante);
       
 
          alumno1.mostrarDatos();
         
 
      }
    }