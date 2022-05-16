/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author itor5
 */
public interface IConta {
    	
    void imprimirExtrato();
    
    void sacar(double valorSaque);
	
    void transferir(double valorTransferencia, IConta contaDestino);
    
    void depositar(double valorDeposito);
}
