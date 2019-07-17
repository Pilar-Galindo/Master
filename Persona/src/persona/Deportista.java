/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

public class Deportista extends Persona{
private String deporte;
public String getDeporte() {
return deporte;
}
public Deportista(String nombre, String deporte) {
this(nombre);
this.deporte = deporte;
}
public void setDeporte(String deporte) {
this.deporte = deporte;
}
public Deportista(String nombre) {

}
}
