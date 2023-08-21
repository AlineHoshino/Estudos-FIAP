package com.java;
/**
 * Classe que abstrai conta bancária
 * @author aline
 *
 */
public class Conta {
	
	int agencia;
	int numero;
	double saldo;

	
	public Conta(int agencia, int numero, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
	public void depositar(double valor) {
		this.saldo+= valor;
	}
	/**
	 * Retira valor da conta
	 * @param valor
	 */
    public void retirar(double valor) {
        this.saldo = saldo - valor;
    }
    /**
     * Verifica saldo
     * @return valor do saldo
     */
    public double verificarSaldo() {
    	return this.saldo;
    }
}