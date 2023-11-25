/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.factorymethod.FactoryDAO;

import com.mycompany.factorymethod.DAO.IProdutoDAO;

/**
 *
 * @author nitro5
 */
public interface IDAOFactory {
    public IProdutoDAO getProdutoDAO();
}
