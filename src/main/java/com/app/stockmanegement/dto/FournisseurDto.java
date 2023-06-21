package com.app.stockmanegement.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder
public class FournisseurDto {
    private Integer id;

    private String nom;

    private String prenom;

    private AdressDto address;

    private String photo;

    private String mail;

    private String numTel;

    private List<CommandeFournisseurDto> commandeFournisseurs;

}
