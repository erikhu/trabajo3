/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.comunidad;


import java.util.List;
import multichain.command.CommandManager;
import multichain.object.StreamKeyItem;
import multichain.command.MultichainException;
import multichain.command.CommandElt;
/**
 *
 * @author julia
 */
public class Main {
     public static void main(String args[]) {
         Form.execute();
         CommandManager commandManager = new CommandManager("localhost",     "6818", "multichainrpc","7hzmTeY82P9mSd3MpMuwEPqG8sxPu4rVmgaBqitjPLEw");
         List<StreamKeyItem> items;
         
         try{
             commandManager.invoke(CommandElt.SUBSCRIBE, "individuos");
             items = (List<StreamKeyItem>) commandManager.invoke(CommandElt.LISTSTREAMKEYITEMS,"individuos","11");
             
             for (StreamKeyItem item : items) {
                 System.out.println(item);
             }
             
         }
         catch (MultichainException e){
             e.printStackTrace();
         }
     }
}
