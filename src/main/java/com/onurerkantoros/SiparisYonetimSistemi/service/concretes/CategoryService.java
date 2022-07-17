package com.onurerkantoros.SiparisYonetimSistemi.service.concretes;

import com.onurerkantoros.SiparisYonetimSistemi.dto.concretes.CategoryDto;
import com.onurerkantoros.SiparisYonetimSistemi.repository.CategoryRepository;
import com.onurerkantoros.SiparisYonetimSistemi.service.abstracts.IBaseService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements IBaseService<CategoryDto> {
    private CategoryRepository categoryRepository;
    private ModelMapper modelMapper;

    public CategoryService(CategoryRepository categoryRepository, ModelMapper modelMapper) {
        this.categoryRepository = categoryRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public CategoryDto create(CategoryDto personDto) {
        return null;
    }

    @Override
    public List<CategoryDto> getAll() {
        return null;
    }

    @Override
    public CategoryDto getUser(int id) {
        return null;
    }

    @Override
    public CategoryDto update(int id, CategoryDto user) {
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
