package com.app.stockmanegement.dto;

import com.app.stockmanegement.Model.Address;
import com.app.stockmanegement.Model.User;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class EntrepriseDto {
    private Integer id;
    private String nom;

    private String description;


    private Address address;

    private String codefiscal;


    private String photo;


    private String email;

    private String numtel;


    private String siteweb;


    private List<UtilisateurDto> utilisateurs;
}
