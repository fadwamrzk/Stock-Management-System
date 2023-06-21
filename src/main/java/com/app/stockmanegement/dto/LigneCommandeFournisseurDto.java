package com.app.stockmanegement.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
@Data
@Builder
public class LigneCommandeFournisseurDto {
    private Integer id;

    private ArticleDto article;

    private CommandeFournisseurDto commandeFournisseur;

    private BigDecimal quantite;

    private BigDecimal prixunitaire;

}
