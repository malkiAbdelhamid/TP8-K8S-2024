package com.example.msbourse.entities;

import com.example.msbourse.model.EtudiantScolarite;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
@Table(name="etudiant-bourse")
public class Etudiant {
    @Id
    private Long idEtudiant;

    private Long nCompteCCP;
    private Float salaireParant;
    private Boolean situationImpot;

    @JsonIgnore
    @OneToMany(mappedBy = "etudiant")
    List<Virement> virements;

    @Transient
    EtudiantScolarite etudiantScolarite;
}
