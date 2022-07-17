package com.onurerkantoros.SiparisYonetimSistemi.api.abstracts;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IBaseController<T> {
    HttpEntity<List<T>> getAll();
    HttpEntity<T> getById(int id);
    HttpEntity<T> create(T t);
    HttpEntity<T> update(int id,T t);
    HttpEntity<Boolean> delete(int id);
    HttpEntity<Integer> deleteAll();
}
