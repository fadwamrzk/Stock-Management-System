package com.app.stockmanegement.dto;

import lombok.Builder;
import lombok.Data;
//pas sur qu'on va les exposer
@Data
@Builder
public class RoleDto {
    private Integer id;

    private String roleName;

    private UtilisateurDto utilisateur;
}
