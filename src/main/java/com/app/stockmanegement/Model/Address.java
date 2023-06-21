package com.app.stockmanegement.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Table;
import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
@Table(name="address")
public class Address{

    @Column(name="addresse1")
    private String addresse1;

    @Column(name="addresse2")
    private String addresse2;

    @Column(name="ville")
    private String ville;

    @Column(name="codepostale")
    private  String codePostale;

    @Column(name="pays")
    private String pays;

}
