package com.onurerkantoros.SiparisYonetimSistemi.service.concretes;

import com.onurerkantoros.SiparisYonetimSistemi.dto.concretes.HeadOfficePersonDto;
import com.onurerkantoros.SiparisYonetimSistemi.entity.concretes.HeadOfficePerson;
import com.onurerkantoros.SiparisYonetimSistemi.repository.HeadOfficePersonRepository;
import com.onurerkantoros.SiparisYonetimSistemi.service.abstracts.IBaseService;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class HeadOfficePersonService implements IBaseService<HeadOfficePersonDto> {
    private final HeadOfficePersonRepository headOfficePersonRepository;
    private final ModelMapper modelMapper;
    private final PasswordEncoder passwordEncoder;

    public HeadOfficePersonService(HeadOfficePersonRepository headOfficePersonRepository, ModelMapper modelMapper) {
        this.headOfficePersonRepository = headOfficePersonRepository;
        this.modelMapper = modelMapper;
        this.passwordEncoder = new BCryptPasswordEncoder();
    }


    @Override
    public HeadOfficePersonDto create(HeadOfficePersonDto personDto) {
        HeadOfficePerson headOfficePerson = modelMapper.map(personDto, HeadOfficePerson.class);
        headOfficePerson.setCreatedDate(new Date());
        headOfficePerson.setCreatedBy("Admin");
        headOfficePerson.setPassword(passwordEncoder.encode(headOfficePerson.getPassword()));
        return modelMapper.map(headOfficePersonRepository.save(headOfficePerson), HeadOfficePersonDto.class);
    }

    @Override
    public List<HeadOfficePersonDto> getAll() {
        List<HeadOfficePerson> headOfficePersonList = headOfficePersonRepository.findAll();
        List<HeadOfficePersonDto> headOfficePersonDtoList = headOfficePersonList.stream().map(headOfficePerson -> modelMapper.map(headOfficePerson, HeadOfficePersonDto.class)).collect(Collectors.toList());
        return headOfficePersonDtoList;
    }

    @Override
    public HeadOfficePersonDto getUser(int id) {
        Optional<HeadOfficePerson> headOfficePersonOptional = headOfficePersonRepository.findById(id);
        headOfficePersonOptional.ifPresent(headOfficePerson -> modelMapper.map(headOfficePerson, HeadOfficePersonDto.class));
        return null;
    }

    @Override
        public HeadOfficePersonDto update(int id, HeadOfficePersonDto headOfficePersonDto) {
        Optional<HeadOfficePerson> headOfficePersonOptional = headOfficePersonRepository.findById(id);
        HeadOfficePerson headOfficePerson = modelMapper.map(headOfficePersonDto,HeadOfficePerson.class);
        headOfficePersonOptional.get().setFirstName(headOfficePerson.getFirstName());
        headOfficePersonOptional.get().setLastName(headOfficePerson.getLastName());
        headOfficePersonOptional.get().setUsername(headOfficePerson.getUsername());
        headOfficePersonOptional.get().setMail(headOfficePerson.getMail());
        headOfficePersonOptional.get().setPermission(headOfficePerson.getPermission());
        headOfficePersonOptional.get().setPassword(passwordEncoder.encode(headOfficePerson.getPassword()));
        headOfficePersonOptional.get().setHeadOffice(headOfficePerson.getHeadOffice());
        headOfficePersonOptional.get().setHeadOfficeDepartment(headOfficePerson.getHeadOfficeDepartment());

        return modelMapper.map(headOfficePersonRepository.save(headOfficePersonOptional.get()),HeadOfficePersonDto.class);
    }

    @Override
    public boolean delete(int id) {
        Optional<HeadOfficePerson> headOfficePersonOptional = headOfficePersonRepository.findById(id);
        if(headOfficePersonOptional.isPresent()){
            headOfficePersonRepository.delete(modelMapper.map(headOfficePersonOptional.get(),HeadOfficePerson.class));
            return true;
        }
        return false;
    }

    @Override
    public int deleteAll() {
        List<HeadOfficePerson> headOfficePersonList = headOfficePersonRepository.findAll();
        headOfficePersonRepository.deleteAll();
        return headOfficePersonList.size();
    }
}
