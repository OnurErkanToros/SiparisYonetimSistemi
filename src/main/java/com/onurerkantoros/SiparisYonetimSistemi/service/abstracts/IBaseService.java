package com.onurerkantoros.SiparisYonetimSistemi.service.abstracts;

import java.util.List;

public interface IBaseService<T> {
    T create(T personDto);
    List<T> getAll();
    T getUser(int id);
    T update(int id, T user);
    boolean delete(int id);
    int deleteAll();
}
