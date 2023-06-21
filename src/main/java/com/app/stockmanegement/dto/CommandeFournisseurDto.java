package com.app.stockmanegement.dto;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;
@Data
@Builder
public class CommandeFournisseurDto {
    private Integer id;

    private String code;

    private Instant dateCommande;

    private FournisseurDto fournisseur;

    private List<LigneCommandeFournisseurDto> ligneCommandeFournisseurs;

}
