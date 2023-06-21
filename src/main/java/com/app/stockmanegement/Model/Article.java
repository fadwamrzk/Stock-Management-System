package com.app.stockmanegement.Model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="article")
public class Article extends AbstractEntity{

    @Column(name="codearticle")
    private String codeArticle;

    @Column(name = "designation")
    private String designation;

    @Column(name="prixunitaireht")
    private BigDecimal prixunitaireHt;

    @Column(name = "tauxtva")
    private BigDecimal tauxTva;

    @Column(name = "prixunitairettc")
    private BigDecimal prixunitaireTtc;

    private String photo;

    @ManyToOne
    @JoinColumn(name="idcategory")
    private Category category;

}

