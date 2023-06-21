package com.app.stockmanegement.Model;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="commandefournisseur")
public class CommandeFournisseur extends AbstractEntity {
    @Column(name="code")
    private String code;

    @Column(name = "datecommande")
    private Instant dateCommande;

    @ManyToOne
    @JoinColumn(name="idFounisseur")
    private Fournisseur fournisseur;

    @OneToMany(mappedBy = "commandeFournisseur")
    private List<LigneCommandeFournisseur> ligneCommandeFournisseurs;


}
