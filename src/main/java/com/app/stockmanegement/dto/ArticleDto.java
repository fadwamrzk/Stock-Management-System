package com.app.stockmanegement.dto;

import com.app.stockmanegement.Model.Category;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class ArticleDto {
    private Integer id;
    private String codeArticle;
    private String designation;
    private BigDecimal prixunitaireHt;
    private BigDecimal tauxTva;
    private BigDecimal prixunitaireTtc;
    private String photo;
    private CategoryDto category;
}
