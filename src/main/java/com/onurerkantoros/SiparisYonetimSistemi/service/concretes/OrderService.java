package com.onurerkantoros.SiparisYonetimSistemi.service.concretes;

import com.onurerkantoros.SiparisYonetimSistemi.dto.concretes.OrderDto;
import com.onurerkantoros.SiparisYonetimSistemi.repository.OrderRepository;
import com.onurerkantoros.SiparisYonetimSistemi.service.abstracts.IBaseService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements IBaseService<OrderDto> {
    private OrderRepository orderRepository;
    private ModelMapper modelMapper;

    public OrderService(OrderRepository orderRepository, ModelMapper modelMapper) {
        this.orderRepository = orderRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public OrderDto create(OrderDto personDto) {
        return null;
    }

    @Override
    public List<OrderDto> getAll() {
        return null;
    }

    @Override
    public OrderDto getUser(int id) {
        return null;
    }

    @Override
    public OrderDto update(int id, OrderDto user) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public int deleteAll() {
        return 0;
    }
}
