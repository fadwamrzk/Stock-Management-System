package com.app.stockmanegement.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder
public class UtilisateurDto {
    private Integer id;

    private String nom;

    private String prenom;

    private String dateDeNaissance;

    private String motDePasse;

    private AdressDto address;

    private String photo;

    private EntrepriseDto entreprise;

    private List<RoleDto> roles;
}
