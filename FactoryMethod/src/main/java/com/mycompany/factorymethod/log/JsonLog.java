/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorymethod.log;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nitro5
 */
public class JsonLog implements ILog {
    private List<String> logs;
    private static JsonLog instancia = null;

    private JsonLog() {
        logs = new ArrayList<>();
    }
    
    public static JsonLog getInstancia() {
        if(instancia == null)
            instancia = new JsonLog();
        
        return instancia;
    }
      
    @Override
    public void addLog(String msg){
        logs.add(msg);
    }
  
}
