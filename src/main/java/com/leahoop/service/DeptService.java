package com.leahoop.service;

import com.leahoop.domain.Dept;

import java.util.Optional;


public interface DeptService {

    Optional<Dept> findById(Long id);

    void save(Dept dept);

}
