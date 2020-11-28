package com.leahoop.controller;

import com.leahoop.domain.Dept;
import com.leahoop.service.DeptService;
import com.leahoop.service.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class Api {

    private final DeptService deptService;

    private final StockService stockService;

    @GetMapping({"/dept/find"})
    public ResponseEntity getDept(@RequestParam Long id) {
        return new ResponseEntity(deptService.findById(id), HttpStatus.OK);
    }

    @PostMapping({"/dept/save"})
    public ResponseEntity saveDept(@RequestBody Dept dept) {
        deptService.save(dept);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping({"/stock"})
    public ResponseEntity getStock(@RequestParam String id) {
        String fileName = this.getClass().getClassLoader().getResource("test.txt").getPath();
        System.out.println(fileName);
        return new ResponseEntity(stockService.getStock(id), HttpStatus.OK);
    }

}
