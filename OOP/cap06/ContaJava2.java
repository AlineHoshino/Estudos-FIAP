package com.java;
import java.io.Serializable;
/**
 * Classe que abstrai conta bancária
 * @author aline
 *
 */

public class Conta implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int agencia;
	private int numero;
	private double saldo;

	
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
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
    public double getSaldo() {
    	return this.saldo;
    }
    // não precisa criar o método setSaldo porque depositar e retirar modifica o saldo
}