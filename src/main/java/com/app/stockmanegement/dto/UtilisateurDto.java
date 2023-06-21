package com.app.stockmanegement.dto;

import com.app.stockmanegement.Model.Address;
import com.app.stockmanegement.Model.Entreprise;
import com.app.stockmanegement.Model.Roles;
import jakarta.persistence.*;
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
