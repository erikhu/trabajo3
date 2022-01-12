/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import com.google.gson.JsonObject;
/**
 *
 * @author julia
 */
public class Individuo {
    public String numero;
    public String nombre;
    public Individuo(String numero,String nombre){
        this.numero = numero;
        this.nombre = nombre;
    }
    
    public JsonObject toJson(){
         JsonObject datos = new JsonObject();
         datos.addProperty("nombre", this.nombre);
         JsonObject parametro = new JsonObject();
         parametro.add("json", datos);
         return parametro;
    }
}
