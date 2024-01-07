package tech.kitucode.spring.service;

import java.util.List;
import java.util.Optional;

public interface CrudService<T> {
    T save(T t);
    List<T> findAll();
    Optional<T> findOne(Integer id);
}
