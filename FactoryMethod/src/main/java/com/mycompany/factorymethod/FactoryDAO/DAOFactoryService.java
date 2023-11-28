/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorymethod.FactoryDAO;

import com.mycompany.factorymethod.DAO.IProdutoDAO;
import io.github.cdimascio.dotenv.Dotenv;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nitro5WIN10
 */
public class DAOFactoryService {
    private IDAOFactory sgbd;
    private String env;

    public DAOFactoryService(){
        this.sgbd = getDAOFactory();
    }
    
    private IDAOFactory getDAOFactory(){
        getDotEnv();
        try{
            Class<?> classeEnv = Class.forName(env);
            Object instancia = classeEnv.getDeclaredConstructor().newInstance();
            return (IDAOFactory)instancia;
        }catch(Exception e) {
            throw new RuntimeException("Erro: SGBD não suportado! \n" + e.getMessage());
        }
    }
    
    public IProdutoDAO getProdutoDAO(){
        return sgbd.getProdutoDAO();
    }
    
    private void getDotEnv(){
        Dotenv dotenv = Dotenv.configure().load();

        env = dotenv.get("SGBD");
    }
}
