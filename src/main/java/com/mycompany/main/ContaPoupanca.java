/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author itor5
 */
public class ContaPoupanca extends Conta{
    private static int VALOR_FINANCIAMENTO = 12000;

    public ContaPoupanca(Agencia agenciaAssociada, Cliente cliente) {
        super(agenciaAssociada, cliente);
    }
    
    @Override
    public void imprimirExtrato() {
        System.out.println("*** Dados da conta poupança: ***");
        super.imprimirInfosComuns();
    }
 
    public void financiamento(){
        this.saldo += VALOR_FINANCIAMENTO;
    }
}
