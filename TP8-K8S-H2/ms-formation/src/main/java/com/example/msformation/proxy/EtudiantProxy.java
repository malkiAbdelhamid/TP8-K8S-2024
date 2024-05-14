package com.example.msformation.proxy;

import com.example.msformation.model.Etudiant;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="ms-scolarite",url="ms-scolarite-h2-srv:8082")

public interface EtudiantProxy {

    @GetMapping("/etudiants/search/findEtudiantByIdFormation")
    CollectionModel<Etudiant> getLesEtudiants(@RequestParam("idf") Long idf,
                                              @RequestParam("projection") String projection);
}


