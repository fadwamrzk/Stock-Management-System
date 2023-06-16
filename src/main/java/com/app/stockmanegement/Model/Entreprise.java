package com.app.stockmanegement.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="entreprise")
public class Entreprise extends AbstractEntity {
    @Column(name = "nom")
    private String nom;
}
