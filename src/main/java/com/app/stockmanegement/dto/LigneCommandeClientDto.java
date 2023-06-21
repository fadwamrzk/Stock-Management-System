package com.app.stockmanegement.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class LigneCommandeClientDto {
    private Integer id;

    private ArticleDto article;

    private CommandeClientDto commandeClient;

    private BigDecimal quantite;

    private BigDecimal prixunitaire;

}
