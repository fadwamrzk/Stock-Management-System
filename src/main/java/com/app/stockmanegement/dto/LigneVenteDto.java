package com.app.stockmanegement.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
@Data
@Builder
public class LigneVenteDto {
    private Integer id;

    private VentesDto vente;

    private BigDecimal quantite;

    private BigDecimal prixunitaire;
}
