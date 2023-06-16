package com.app.stockmanegement.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="mvtstk")
public class MvtStk extends AbstractEntity{
    @ManyToOne
    @JoinColumn(name = "idarticle")
    private Article article;

}
