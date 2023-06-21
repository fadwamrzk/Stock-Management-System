package com.app.stockmanegement.dto;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AdressDto {
    private Integer id;
    private String addresse1;
    private String addresse2;
    private String ville;
    private  String codePostale;
    private String pays;

}
