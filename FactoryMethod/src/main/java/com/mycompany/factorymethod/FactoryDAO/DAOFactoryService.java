/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorymethod.FactoryDAO;

import com.mycompany.factorymethod.DAO.IProdutoDAO;
import io.github.cdimascio.dotenv.Dotenv;

/**
 *
 * @author nitro5WIN10
 */
public class DAOFactoryService {
    private IDAOFactory sgbd;
    private String env;

    public DAOFactoryService() {
        this.sgbd = getDAOFactory();
    }
    
    private IDAOFactory getDAOFactory(){
        getDotEnv();
        if(env.equalsIgnoreCase("SQLITE")){
            return new SQLiteFactory();
        }else{
            throw new IllegalArgumentException("SGBD não suportado.");
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
