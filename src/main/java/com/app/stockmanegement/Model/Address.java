package com.app.stockmanegement.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.sql.exec.spi.StandardEntityInstanceResolver;

@Data
@Builder
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
