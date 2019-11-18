package com.leahoop.service.impl;

import com.leahoop.domain.Dept;
import com.leahoop.repository.DeptRepository;
import com.leahoop.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptRepository deptRepository;

    @Override
    public Optional<Dept> findById(Long id) {
        return deptRepository.findById(id);
    }

    @Override
    public void save(Dept dept) {
        deptRepository.save(dept);
    }


}
