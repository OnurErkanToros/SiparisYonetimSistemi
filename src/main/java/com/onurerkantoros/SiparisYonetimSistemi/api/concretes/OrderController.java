package com.onurerkantoros.SiparisYonetimSistemi.api.concretes;

import com.onurerkantoros.SiparisYonetimSistemi.api.abstracts.IBaseController;
import com.onurerkantoros.SiparisYonetimSistemi.dto.concretes.OrderDto;
import org.springframework.http.HttpEntity;

import java.util.List;

public class OrderController implements IBaseController<OrderDto> {
    @Override
    public HttpEntity<List<OrderDto>> getAll() {
        return null;
    }

    @Override
    public HttpEntity<OrderDto> getById(int id) {
        return null;
    }

    @Override
    public HttpEntity<OrderDto> create(OrderDto orderDto) {
        return null;
    }

    @Override
    public HttpEntity<OrderDto> update(int id, OrderDto orderDto) {
        return null;
    }

    @Override
    public HttpEntity<Boolean> delete(int id) {
        return null;
    }

    @Override
    public HttpEntity<Integer> deleteAll() {
        return null;
    }
}
