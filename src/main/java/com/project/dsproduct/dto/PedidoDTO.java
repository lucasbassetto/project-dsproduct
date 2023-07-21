package com.project.dsproduct.dto;

import com.project.dsproduct.entities.Pedido;

import java.time.Instant;

public class PedidoDTO {

    private Integer id;
    private Instant date;

    public PedidoDTO() {
    }

    public PedidoDTO(Pedido entity) {
        id = entity.getId();
        date = entity.getDate();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }
}
