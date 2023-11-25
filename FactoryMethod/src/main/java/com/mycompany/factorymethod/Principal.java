/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factorymethod;

import com.mycompany.factorymethod.DAO.IProdutoDAO;
import com.mycompany.factorymethod.FactoryDAO.DAOFactoryService;
import model.Produto;

/**
 *
 * @author nitro5
 */
public class Principal {

    public static void main(String[] args) {
        try {
        Produto acucar = new Produto("Açucar", 5.22);

        DAOFactoryService factoryService = new DAOFactoryService();

        IProdutoDAO produtoDAO = factoryService.getProdutoDAO();
        
        produtoDAO.inserir(acucar);
        produtoDAO.atualiza(acucar);
        produtoDAO.listar();
        produtoDAO.deletar(acucar);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
