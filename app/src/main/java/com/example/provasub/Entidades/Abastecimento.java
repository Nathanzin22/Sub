package com.example.provasub.Entidades;

public class Abastecimento {
    private float quilometragem_atual;
    private float Quantidade_abastecida;
    private String Data;
    private float Valor_pago;

    public float getQuilometragem_atual() {
        return quilometragem_atual;
    }

    public void setQuilometragem_atual(float quilometragem_atual) {
        this.quilometragem_atual = quilometragem_atual;
    }

    public float getQuantidade_abastecida() {
        return Quantidade_abastecida;
    }

    public void setQuantidade_abastecida(float quantidade_abastecida) {
        Quantidade_abastecida = quantidade_abastecida;
    }

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
    }

    public float getValor_pago() {
        return Valor_pago;
    }

    public void setValor_pago(float valor_pago) {
        Valor_pago = valor_pago;
    }
}
