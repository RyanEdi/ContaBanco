package edu.ryan.ContaTerminal;

public class Conta {
    private String titular;
    private String numero;
    private int numeroAgencia;
    private double saldo;

    public Conta(String titular, String numero, int numeroAgencia) {
        this.titular = titular;
        this.numero = numero;
        this.numeroAgencia = numeroAgencia;
        this.saldo = 0.0;
    }

    public String getTitular() {
        return titular;
    }

    public String getNumero() {
        return numero;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }
}
