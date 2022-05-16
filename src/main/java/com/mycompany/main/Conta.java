/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author itor5
 */
public abstract class Conta implements IConta{
    
	private static int NUMERO_CONTA = (int) (1000 + Math.random() * 10000);;

	protected Agencia agenciaConta;
	protected int numero;
	protected double saldo;
	protected Cliente clienteAssociado;

	public Conta(Agencia agenciaAssociada,Cliente cliente) {
		this.agenciaConta = agenciaAssociada;
                this.numero = NUMERO_CONTA;
		this.clienteAssociado = cliente;
	}

	@Override
	public void sacar(double valorSaque) {
           if(valorSaque <= 0){
               throw new IllegalArgumentException("o valor para saque deve ser maior que 0!");
           }
           if(valorSaque < saldo){
               throw new IllegalArgumentException("Não há dinheiro suficiente para esse saque!");
           }
           this.saldo -= valorSaque;
	}

	@Override
	public void depositar(double valorDeposito) {
            if(valorDeposito <= 0){
               throw new IllegalArgumentException("o valor para saque deve ser maior que 0!");
            }
            this.saldo += valorDeposito;
	}

	@Override
	public void transferir(double valorTransferencia, IConta contaDestino) {
            if(valorTransferencia <= 0){
                throw new IllegalArgumentException("O valor para transferência deve ser maior que 0!");
            }
            if(contaDestino == null){
                throw new IllegalArgumentException("Para realizar a operação de transferência, deve-se enviar o valor para uma conta existente!");
            }
	}

        //sem sets para forçar a utilização dos metodos: saque, deposito, transferir e para impedir possíveis fraudes
	public Agencia getAgencia() {
	    return agenciaConta;
	}

	public int getNumero() {
            return numero;
	}

	public double getSaldo() {
	    return saldo;
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.clienteAssociado.getNome()));
		System.out.println(String.format("Agencia: %s", this.agenciaConta.informacoesAgencia()));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
    
}
