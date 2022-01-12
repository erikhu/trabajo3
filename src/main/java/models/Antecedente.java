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
public class Antecedente {
    public String delito;
    public String descripcion;
    public Antecedente(String delito,String descripcion){
        this.delito = delito;
        this.descripcion = descripcion;
    }
    
    public JsonObject toJson(){
         JsonObject datos = new JsonObject();
         datos.addProperty("delito", this.delito);
         datos.addProperty("descripcion", this.descripcion);
         JsonObject parametro = new JsonObject();
         parametro.add("json", datos);
         return parametro;
    }
}
