package br.com.BarberShop.Models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Agendamento {
    private Cliente cliente;
    private Servico servico;
    private float valor;
    private LocalDate data;
    private String observacao;

    public Agendamento(Cliente cliente, Servico servico, float valor, String data) {
        this.cliente = cliente;
        this.servico = servico;
        this.valor = valor;
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
            this.data = LocalDate.parse(data, formatter);
        } catch (DateTimeParseException e) {
            e.printStackTrace();
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    } 

    
    
}

