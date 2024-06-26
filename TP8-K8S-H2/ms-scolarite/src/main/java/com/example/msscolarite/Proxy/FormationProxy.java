package com.example.msscolarite.Proxy;


import com.example.msscolarite.Model.Formation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="ms-formation", url="ms-formation-h2-srv:8081")
public interface FormationProxy {

    @GetMapping("/formations/{id}")

    public Formation getFormation(@PathVariable("id") Long idf);

  /* get  http://localhost:8081/formations/1
    gerFormation(1)

    get  http://localhost:8081/formations/2
    getFormation(2)*/
}
