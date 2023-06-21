package com.app.stockmanegement.Model;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="lignecommandefournisseur")
public class LigneCommandeFournisseur extends AbstractEntity {
    @ManyToOne
    @JoinColumn(name = "idarticle")
    private Article article;

    @ManyToOne
    @JoinColumn(name = "idcommandefournisseur")
    private CommandeFournisseur commandeFournisseur;

    @Column(name="quantite")
    private BigDecimal quantite;

    @Column(name="prixunitaire")
    private BigDecimal prixunitaire;
}
