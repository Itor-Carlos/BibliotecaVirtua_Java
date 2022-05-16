/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.main;

/**
 *
 * @author itor5
 */
public class Main {

    public static void main(String[] args) {
        /*PRIMEIROS TESTES*/
        Agencia agenciaBrasil = new Agencia("Agencia Brasil","145678");
        Cliente jose = new Cliente("Jose Renato", "123.456.78-10", 19);
        Cliente itor = new Cliente("Itor Carlos Souza Queiroz","987.654.321-01",19);
       
        Conta joseConta = new ContaCorrente(agenciaBrasil, jose);
        joseConta.depositar(300);
        joseConta.imprimirInfosComuns();
        joseConta.sacar(400);
        joseConta.imprimirInfosComuns();
        
        
        Conta itorConta = new ContaPoupanca(agenciaBrasil, itor);
        itorConta.depositar(600);
        itorConta.transferir(300, joseConta);
        
        System.out.println("-------------------");
        joseConta.imprimirInfosComuns();
        itorConta.imprimirInfosComuns();
        
    }
}
