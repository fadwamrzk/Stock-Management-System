package com.app.stockmanegement.Model;

import com.app.stockmanegement.dto.UtilisateurDto;
import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="roles")
public class Roles extends AbstractEntity {
    @Column(name = "roles")
    private String roleName;

    @ManyToOne
    @JoinColumn (name = "idutilisateur")
    private User utilisateur;
}
