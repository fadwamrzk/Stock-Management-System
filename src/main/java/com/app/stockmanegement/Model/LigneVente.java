package com.app.stockmanegement.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="lignevente")
public class LigneVente  extends AbstractEntity{

    @ManyToOne
    @JoinColumn(name="idvente")
    private Ventes vente;

    private BigDecimal quantite;

}
