package com.onurerkantoros.SiparisYonetimSistemi.service.concretes;

import com.onurerkantoros.SiparisYonetimSistemi.dto.concretes.SellerPersonDto;
import com.onurerkantoros.SiparisYonetimSistemi.repository.SellerPersonRepository;
import com.onurerkantoros.SiparisYonetimSistemi.service.abstracts.IBaseService;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellerPersonService implements IBaseService<SellerPersonDto> {
    private SellerPersonRepository sellerPersonRepository;
    private ModelMapper modelMapper;
    private PasswordEncoder passwordEncoder;

    public SellerPersonService(SellerPersonRepository sellerPersonRepository, ModelMapper modelMapper) {
        this.sellerPersonRepository = sellerPersonRepository;
        this.modelMapper = modelMapper;
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    @Override
    public SellerPersonDto create(SellerPersonDto personDto) {
        return null;
    }

    @Override
    public List<SellerPersonDto> getAll() {
        return null;
    }

    @Override
    public SellerPersonDto getUser(int id) {
        return null;
    }

    @Override
    public SellerPersonDto update(int id, SellerPersonDto user) {
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
