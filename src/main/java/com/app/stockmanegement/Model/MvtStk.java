package com.app.stockmanegement.Model;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="mvtstk")
public class MvtStk extends AbstractEntity{
    @Column(name = "datemvt")
    private Instant dateMvt;

    @Column(name = "quantite")
    private Instant quantite;

    @ManyToOne
    @JoinColumn(name = "idarticle")
    private Article article;

    @Column(name = "typemvt")
    private TypeMvtStk typeMvt;
}
