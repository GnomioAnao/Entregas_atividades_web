package com.fatec.loja;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

public class Cesta {
      private int codigo;
    private ClienteModel cliente = new ClienteModel();
    private double total;
    private List<Item> item = new ArrayList<Item>();


    public Cesta(int codigo, ClienteModel cliente, double total, List<Item> item) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.total = total;
        this.item = item;
    }


    public int getCodigo() {
        return codigo;
    }


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public ClienteModel getCliente() {
        return cliente;
    }


    public void setCliente(ClienteModel cliente) {
        this.cliente = cliente;
    }


    public double getTotal() {
        return total;
    }


    public void setTotal(double total) {
        this.total = total;
    }


    public List<Item> getItem() {
        return item;
    }


    public void setItem(List<Item> item) {
        this.item = item;
    }

}
