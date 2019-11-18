package com.leahoop.controller;

import com.leahoop.domain.Dept;
import com.leahoop.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"api"})
public class Api {

    @Autowired
    private DeptService deptService;

    @GetMapping({"/dept/find"})
    public ResponseEntity getDept(@RequestParam Long id) {
        return new ResponseEntity(deptService.findById(id), HttpStatus.OK);
    }

    @PostMapping({"/dept/save"})
    public ResponseEntity saveDept(@RequestBody Dept dept) {
        deptService.save(dept);
        return new ResponseEntity(HttpStatus.OK);
    }

}
