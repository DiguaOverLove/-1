package com.neu.controller;

import com.neu.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("dept")
public class Controller {
    @Autowired
    private RestTemplate restTemplate;
    private static final String REST_URL_PREFIX="http://localhost:8082";

    @GetMapping(value = "/findAll")
    public List<Dept> findAll(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/findAll",List.class);
    }

    @GetMapping(value = "/findById/{id}")
    public Dept findById(@PathVariable("id")int id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/findById/"+id,Dept.class);
    }
}
