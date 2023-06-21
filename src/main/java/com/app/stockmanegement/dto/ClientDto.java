package com.app.stockmanegement.dto;

import com.app.stockmanegement.Model.Address;
import com.app.stockmanegement.Model.CommandeClient;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.OneToMany;
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
    private List<CommandeClientDto> commandeClients;

}
