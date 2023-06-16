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
@Table(name="client")
public class Client extends AbstractEntity{
    @Column(name="nom")
    private String nom;

    @Column(name="prenom")
    private String prenom;

    @Embedded//cad un champ composee
    private Address address;

    @Column(name="photo")
    private String photo;

    @Column(name="mail")
    private String mail;

    @Column(name="numTel")
    private String numTel;

    @OneToMany(mappedBy = "client")
    private List<CommandeClient> commandeClients;



}
