/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorymethod.DAO;

import com.mycompany.factorymethod.log.LogService;
import model.Produto;

/**
 *
 * @author nitro5WIN10
 */
public class SQLiteProdutoDAO implements IProdutoDAO {
    private LogService log = new LogService();
    @Override
    public void inserir(Produto produto){
        System.out.print("\nInserindo o Produto " + produto.getNome()+ " no banco de dados.\n");
        log.addLog("\nInserindo o Produto " + produto.getNome()+ " no banco de dados.\n");
    }
    
    @Override
    public void atualiza(Produto produto){
        System.out.print("Atualizando o Produto " + produto.getNome()+ " no banco de dados.\n");
        log.addLog("Atualizando o Produto " + produto.getNome()+ " no banco de dados.\n");
    }
    
    @Override
    public void listar(){
        System.out.print("Listando os produtos do banco de dados.\n");
        log.addLog("Listando os produtos do banco de dados.\n");
    }
    
    @Override
    public void deletar(Produto produto){
        System.out.print("Deletando o Produto " + produto.getNome()+ " no banco de dados.\n\n");
        log.addLog("Deletando o Produto " + produto.getNome()+ " no banco de dados.\n\n");
    }
}
