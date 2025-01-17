package org.locadora.veiculos;

import org.locadora.services.GerarPlaca;

public class Veiculo {
    
    private String marca;
    private String modelo;
    private String ano;
    private String placa;
    private double quilometragem;
    private double valorDiaria;
    private boolean alugado;

    public Veiculo(String marca, String modelo, String ano, double quilometragem, double valorDiaria) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.quilometragem = quilometragem;
        this.valorDiaria = valorDiaria;
        this.alugado = false;
        this.placa = GerarPlaca.gerarPlaca();
    }

    public Veiculo() {
    }
    
    public void alugar() {
        alugado = true;
    }
    
    public boolean isAlugado() {
        return alugado;
    }
    
    public String getPlaca() {
        return placa;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getAno() {
        return ano;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }    

    @Override
    public String toString() {
        return "Veiculo{" + "marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", placa=" + placa + ", quilometragem=" + quilometragem + ", valorDiaria=" + valorDiaria + ", alugado=" + alugado + '}';
    }
    
}
