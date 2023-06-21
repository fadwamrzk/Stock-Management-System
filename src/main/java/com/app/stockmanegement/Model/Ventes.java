package com.app.stockmanegement.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="ventes")
public class Ventes extends AbstractEntity{

    @Column(name = "code")
    private String code;

    @Column(name = "datevente")
    private Instant dateVente;

    @Column(name = "commentaire")
    private String commentaire;
}
