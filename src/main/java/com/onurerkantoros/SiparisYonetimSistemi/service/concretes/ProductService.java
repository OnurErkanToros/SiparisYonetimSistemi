package com.onurerkantoros.SiparisYonetimSistemi.service.concretes;

import com.onurerkantoros.SiparisYonetimSistemi.dto.concretes.ProductDto;
import com.onurerkantoros.SiparisYonetimSistemi.repository.ProductRepository;
import com.onurerkantoros.SiparisYonetimSistemi.service.abstracts.IBaseService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IBaseService<ProductDto> {
    private ProductRepository productRepository;
    private ModelMapper modelMapper;

    public ProductService(ProductRepository productRepository, ModelMapper modelMapper) {
        this.productRepository = productRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public ProductDto create(ProductDto personDto) {
        return null;
    }

    @Override
    public List<ProductDto> getAll() {
        return null;
    }

    @Override
    public ProductDto getUser(int id) {
        return null;
    }

    @Override
    public ProductDto update(int id, ProductDto user) {
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
