package com.example.msscolarite.Proxy;


import com.example.msscolarite.Model.Virement;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "ms-bourse", url="ms-bourse-mysql-srv:7083")
public interface BourseProxy {

    @GetMapping("/virements/search/findVirementByEtudiant_IdEtudiant")
    public CollectionModel<Virement> getVirements(@RequestParam("ide") Long ide,
                                                  @RequestParam("projection") String projection);

}
