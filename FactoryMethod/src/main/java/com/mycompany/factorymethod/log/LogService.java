/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorymethod.log;

import io.github.cdimascio.dotenv.Dotenv;
/**
 *
 * @author nitro5WIN10
 */
public class LogService {
    private ILog metodoLog;
    private String env;

    public LogService() {
        setMetodo();
    }
    
    private void setMetodo(){
        getDotEnv();
        if(env.equalsIgnoreCase("JSON")){
            metodoLog = JsonLog.getInstancia();
        }else{
            throw new IllegalArgumentException("Tipo arquivo de log não suportado.");
        }
    }
    
    private void getDotEnv(){
        Dotenv dotenv = Dotenv.configure().load();

        env = dotenv.get("LOG");
    }
    
    public void addLog(String msg){
        metodoLog.addLog(msg);
    }
}
