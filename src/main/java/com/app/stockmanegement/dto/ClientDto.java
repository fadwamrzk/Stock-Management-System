package com.app.stockmanegement.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder
public class ClientDto {
    private Integer id;
    private String nom;
    private String prenom;
    private AdressDto address;
    private String photo;
    private String mail;
    private String numTel;

    @JsonIgnore
    private List<CommandeClientDto> commandeClients;

}
