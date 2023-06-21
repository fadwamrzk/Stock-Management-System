package com.app.stockmanegement.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

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

    @Column(name = "description")
    private String description;

    @Embedded
    private Address address;

    @Column(name = "codefiscal")
    private String codefiscal;

    @Column(name = "photo")
    private String photo;

    @Column(name = "email")
    private String email;

    @Column(name = "numtel")
    private String numtel;

    @Column(name = "siteweb")
    private String siteweb;

    @OneToMany(mappedBy = "entreprise")
    private List<User> utilisateurs;


}
