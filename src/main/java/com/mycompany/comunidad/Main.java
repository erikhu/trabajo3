/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.comunidad;


import java.util.List;
import multichain.command.CommandManager;
import multichain.object.StreamKeyItem;
import multichain.object.StreamKey;
import multichain.command.MultichainException;
import multichain.command.CommandElt;
import com.google.gson.JsonObject;
import java.util.LinkedList;
/**
 *
 * @author julia
 */
public class Main {
    public static CommandManager commandManager;
    static{
        Main.commandManager = new CommandManager("localhost",     "6818", "multichainrpc","7hzmTeY82P9mSd3MpMuwEPqG8sxPu4rVmgaBqitjPLEw");
    }
    public static void main(String args[]) {      
        Form.execute();
     }
}
