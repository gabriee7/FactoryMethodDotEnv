/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.factorymethod.DAO;

import java.util.List;
import model.Produto;

/**
 *
 * @author nitro5WIN10
 */
public interface IProdutoDAO {
    public void inserir(Produto produto);
    public void atualiza(Produto produto);
    public void listar();
    public void deletar(Produto produto);
}
