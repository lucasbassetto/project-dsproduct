package com.project.dsproduct.services;

import com.project.dsproduct.dto.PedidoDTO;
import com.project.dsproduct.entities.Pedido;
import com.project.dsproduct.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public List<PedidoDTO> findAll() {
        List<Pedido> result = pedidoRepository.findAll();
        return result.stream().map(PedidoDTO::new).toList();
    }
}
